package uz.programmer710.ussdkodlari2022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.programmer710.ussdkodlari2022.adapters.InfoAdapter
import uz.programmer710.ussdkodlari2022.databinding.FragmentUzmobileBinding
import uz.programmer710.ussdkodlari2022.models.MyObject

class UzmobileFragment : Fragment() {
    private lateinit var binding: FragmentUzmobileBinding
    private lateinit var infoAdapter: InfoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUzmobileBinding.inflate(layoutInflater)

        MyObject.loadData()

        infoAdapter = InfoAdapter(MyObject.listReklama_Uzmobile)
        binding.infoImageRv.adapter = infoAdapter

        binding.buttonMobi.setOnClickListener {
            findNavController().navigate(R.id.mobiFragment)
        }

        binding.buttonBeeline.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
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