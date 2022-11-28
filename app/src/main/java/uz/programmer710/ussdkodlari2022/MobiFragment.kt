package uz.programmer710.ussdkodlari2022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.programmer710.ussdkodlari2022.adapters.InfoAdapter
import uz.programmer710.ussdkodlari2022.databinding.FragmentMobiBinding
import uz.programmer710.ussdkodlari2022.models.MyObject

class MobiFragment : Fragment() {
    private lateinit var binding: FragmentMobiBinding
    private lateinit var infoAdapter: InfoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMobiBinding.inflate(layoutInflater)

        MyObject.loadData()

        infoAdapter = InfoAdapter(MyObject.listReklama_Mobi)
        binding.infoImageRv.adapter = infoAdapter

        binding.buttonBeeline.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
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