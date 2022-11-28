package uz.programmer710.ussdkodlari2022.models

import uz.programmer710.ussdkodlari2022.R

object MyObject {

   val listReklama_Mobi = ArrayList<InfoImage>()
   val listReklama_Beeline = ArrayList<InfoImage>()
   val listReklama_Uzmobile = ArrayList<InfoImage>()
   val listReklama_Ucell = ArrayList<InfoImage>()
   val listReklama_Humans = ArrayList<InfoImage>()

   val listInternet = ArrayList<MyInfo>()
   val listDaqiqa = ArrayList<MyInfo>()
   val listSms = ArrayList<MyInfo>()
   val listTarif = ArrayList<MyInfo>()
   val listKodlar = ArrayList<MyInfo>()
   val listyangiliklar = ArrayList<MyInfo>()

   fun loadInfo(){

      listInternet.add(MyInfo("1GB", "Narxi:    10.000", "Codi:      *1*1#", ""))
      listInternet.add(MyInfo("2GB", "Narxi:    15.000", "Codi:      *1*2#", ""))
      listInternet.add(MyInfo("5GB", "Narxi:    25.000", "Codi:      *1*5#", ""))
      listInternet.add(MyInfo("10GB", "Narxi:    45.000", "Codi:      *1*10#", ""))
      listInternet.add(MyInfo("20GB", "Narxi:    65.000", "Codi:      *1*20#", ""))
      listInternet.add(MyInfo("30GB", "Narxi:    75.000", "Codi:      *1*30#", ""))
      listInternet.add(MyInfo("50GB", "Narxi:    90.000", "Codi:      *1*50#", ""))
      listInternet.add(MyInfo("75GB", "Narxi:    110.000", "Codi:      *1*75#", ""))

      listDaqiqa.add(MyInfo("200 daq", "Narxi:     10.000", "Muddati:      30 kun", ""))
      listDaqiqa.add(MyInfo("400 daq", "Narxi:     18.000", "Muddati:      30 kun", ""))
      listDaqiqa.add(MyInfo("600 daq", "Narxi:     25.000", "Muddati:      30 kun", ""))

      listSms.add(MyInfo("20 SMS", "Narxi:        500 so'm", "Codi:    *110*161#", ""))
      listSms.add(MyInfo("50 SMS", "Narxi:        1.000 so'm", "Codi:    *110*162#", ""))
      listSms.add(MyInfo("250 SMS", "Narxi:        1.300 so'm", "Codi:    *110*151#", ""))

      listTarif.add(MyInfo("OSON 10", "Oylik to'lov:  10.0000", "Codi:    *110*61#", ""))
      listTarif.add(MyInfo("HAMMASI \n ZO'R 1", "Oylik to'lov:  20.0000", "Codi:    *2*3#", ""))
      listTarif.add(MyInfo("HAMMASI \n ZO'R 2", "Oylik to'lov:  30.0000", "Codi:    *2*5#", ""))
      listTarif.add(MyInfo("HAMMASI \n ZO'R 3", "Oylik to'lov:  40.0000", "Codi:    *2*8#", ""))
      listTarif.add(MyInfo("HAMMASI \n ZO'R 4", "Oylik to'lov:  60.0000", "Codi:    *2*15#", ""))
      listTarif.add(MyInfo("OSON 1", "Oylik to'lov:  40.0000", "Codi:    *2*01#", ""))
      listTarif.add(MyInfo("UYDAGIDEK", "Oylik to'lov:  55.0000", "Codi:    *110*66#", ""))

      listKodlar.add(MyInfo("*102#", "Xisobni", "Tekshirish", ""))
      listKodlar.add(MyInfo("*101#", "MG", "QOLDIG'I", ""))
      listKodlar.add(MyInfo("*105#", "SMS", "QOLDIG'I", ""))
      listKodlar.add(MyInfo("*106#", "DAQIQA", "QOLDIG'I", ""))
      listKodlar.add(MyInfo("*148#", "RAQAMNI", "ANIQLASH", ""))
      listKodlar.add(MyInfo("*303#", "MENING", "RAQAMLARIM", ""))
      listKodlar.add(MyInfo("*110*00#", "DOLLAR", "KURSI", ""))
      listKodlar.add(MyInfo("*110*05#", "TARIF", "REJAM", ""))
      listKodlar.add(MyInfo("*110*09#", "QO'SHIMCHA", "XIZMATLAR", ""))

      listyangiliklar.add(MyInfo("Kechirasz", "Xozirda Qoshimcha", "Yangilik Yo'q", ""))
   }


   fun loadData() {

      listReklama_Mobi.add(InfoImage(R.drawable.mobi_bonuslar))
      listReklama_Mobi.add(InfoImage(R.drawable.mobi_rouming))
      listReklama_Mobi.add(InfoImage(R.drawable.mobi_gapyoq))
      listReklama_Mobi.add(InfoImage(R.drawable.mobi_gapyoq_maxi))

      listReklama_Beeline.add(InfoImage(R.drawable.konstruktor))
      listReklama_Beeline.add(InfoImage(R.drawable.beepul_aksiya))
      listReklama_Beeline.add(InfoImage(R.drawable.juma_aksiya))
      listReklama_Beeline.add(InfoImage(R.drawable.beeline))

      listReklama_Uzmobile.add(InfoImage(R.drawable.uzmobile_sayoxat))
      listReklama_Uzmobile.add(InfoImage(R.drawable.uzmobie_aksiya))
      listReklama_Uzmobile.add(InfoImage(R.drawable.uzmobile_tezlik))
      listReklama_Uzmobile.add(InfoImage(R.drawable.uzmobile_yangi_takliflar))
      listReklama_Uzmobile.add(InfoImage(R.drawable.uzmobile_units))

      listReklama_Ucell.add(InfoImage(R.drawable.ucell_yozgi_tunlar))
      listReklama_Ucell.add(InfoImage(R.drawable.ucell_sof_tarif))
      listReklama_Ucell.add(InfoImage(R.drawable.ucell_haj_umra_uchun))

      listReklama_Humans.add(InfoImage(R.drawable.humans_keshbek))

   }
}
