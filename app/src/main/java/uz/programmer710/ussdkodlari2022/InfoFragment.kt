package uz.programmer710.ussdkodlari2022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.programmer710.ussdkodlari2022.adapters.RvAdapter
import uz.programmer710.ussdkodlari2022.databinding.FragmentInfoBinding
import uz.programmer710.ussdkodlari2022.models.MyObject

class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding
    private lateinit var rvAdapter: RvAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(layoutInflater)


        val msg = arguments?.getString("keyName")
        MyObject.loadInfo()

        if (msg == "Internet"){

            binding.infoTolbar.text = "Internet Paketlar"
            rvAdapter = RvAdapter(MyObject.listInternet, requireContext())
            binding.myInfoRv.adapter = rvAdapter

        }else if (msg == "Tarif"){

            binding.infoTolbar.text = "Tarif rejalar"
            rvAdapter = RvAdapter(MyObject.listTarif, requireContext())
            binding.myInfoRv.adapter = rvAdapter

        }else if (msg == "Sms"){

            binding.infoTolbar.text = "Sms Paketlar"
            rvAdapter = RvAdapter(MyObject.listSms, requireContext())
            binding.myInfoRv.adapter = rvAdapter

        }else if (msg == "Daqiqa"){

            binding.infoTolbar.text = "Daqiqa Paketlar"
            rvAdapter = RvAdapter(MyObject.listDaqiqa, requireContext())
            binding.myInfoRv.adapter = rvAdapter

        }else if (msg == "Kodlar"){

            binding.infoTolbar.text = "USSD kodlari"
            rvAdapter = RvAdapter(MyObject.listKodlar, requireContext())
            binding.myInfoRv.adapter = rvAdapter

        }else if (msg == "Yangiliklar"){

            binding.infoTolbar.text = "Yangiliklar"
            rvAdapter = RvAdapter(MyObject.listyangiliklar, requireContext())
            binding.myInfoRv.adapter = rvAdapter

        }

        return binding.root
    }
}