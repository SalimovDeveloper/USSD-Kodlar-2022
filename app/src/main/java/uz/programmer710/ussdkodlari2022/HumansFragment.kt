package uz.programmer710.ussdkodlari2022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.programmer710.ussdkodlari2022.adapters.InfoAdapter
import uz.programmer710.ussdkodlari2022.databinding.FragmentHumansBinding
import uz.programmer710.ussdkodlari2022.models.MyObject

class HumansFragment : Fragment() {
    private lateinit var binding: FragmentHumansBinding
    private lateinit var infoAdapter: InfoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHumansBinding.inflate(layoutInflater)

        MyObject.loadData()

        infoAdapter = InfoAdapter(MyObject.listReklama_Humans)
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

        binding.buttonMobi.setOnClickListener {
            findNavController().navigate(R.id.mobiFragment)
        }

        return binding.root
    }
}