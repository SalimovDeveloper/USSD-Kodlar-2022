package uz.programmer710.ussdkodlari2022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.programmer710.ussdkodlari2022.adapters.InfoAdapter
import uz.programmer710.ussdkodlari2022.databinding.FragmentHomeBinding
import uz.programmer710.ussdkodlari2022.models.MyObject

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var infoAdapter: InfoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        MyObject.loadData()

        infoAdapter = InfoAdapter(MyObject.listReklama_Beeline)
        binding.infoImageRv.adapter = infoAdapter

        binding.myInternet.setOnClickListener {
            val msg = "Internet"
            findNavController().navigate(R.id.infoFragment, bundleOf("keyName" to msg))
        }

        binding.myTarif.setOnClickListener {
            val msg = "Tarif"
            findNavController().navigate(R.id.infoFragment, bundleOf("keyName" to msg))
        }

        binding.mySms.setOnClickListener {
            val msg = "Sms"
            findNavController().navigate(R.id.infoFragment, bundleOf("keyName" to msg))
        }

        binding.myDaqiqa.setOnClickListener {
            val msg = "Daqiqa"
            findNavController().navigate(R.id.infoFragment, bundleOf("keyName" to msg,))
        }

        binding.myCode.setOnClickListener {
            val msg = "Kodlar"
            findNavController().navigate(R.id.infoFragment, bundleOf("keyName" to msg))
        }

        binding.myYangiliklar.setOnClickListener {
            val msg = "Yangiliklar"
            findNavController().navigate(R.id.infoFragment, bundleOf("keyName" to msg))
        }

        binding.buttonMobi.setOnClickListener {
            findNavController().navigate(R.id.mobiFragment)
        }

        binding.buttonMuzmobile.setOnClickListener {
            findNavController().navigate(R.id.uzmobileFragment)
        }

        binding.buttonUcell.setOnClickListener {
            findNavController().navigate(R.id.ucellFragment)
        }

        binding.buttonHumans.setOnClickListener {
            findNavController().navigate(R.id.humansFragment)
        }

        return binding.root
    }


}