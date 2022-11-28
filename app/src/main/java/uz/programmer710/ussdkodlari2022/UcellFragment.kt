package uz.programmer710.ussdkodlari2022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.programmer710.ussdkodlari2022.adapters.InfoAdapter
import uz.programmer710.ussdkodlari2022.databinding.FragmentUcellBinding
import uz.programmer710.ussdkodlari2022.models.MyObject

class UcellFragment : Fragment() {
    private lateinit var binding: FragmentUcellBinding
    private lateinit var infoAdapter: InfoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUcellBinding.inflate(layoutInflater)

        MyObject.loadData()

        infoAdapter = InfoAdapter(MyObject.listReklama_Ucell)
        binding.infoImageRv.adapter = infoAdapter

        binding.buttonMobi.setOnClickListener {
            findNavController().navigate(R.id.mobiFragment)
        }

        binding.buttonBeeline.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }

        binding.buttonMuzmobile.setOnClickListener {
            findNavController().navigate(R.id.uzmobileFragment)
        }

        binding.buttonHumans.setOnClickListener {
            findNavController().navigate(R.id.humansFragment)
        }

        return binding.root
    }
}