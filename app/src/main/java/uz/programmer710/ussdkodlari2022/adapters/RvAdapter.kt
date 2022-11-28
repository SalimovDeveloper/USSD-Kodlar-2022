package uz.programmer710.ussdkodlari2022.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.programmer710.ussdkodlari2022.R
import uz.programmer710.ussdkodlari2022.databinding.ItemInfoRvBinding
import uz.programmer710.ussdkodlari2022.models.MyInfo

class RvAdapter (val list: List<MyInfo>, val context: Context) : RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(val itemInfoRv: ItemInfoRvBinding): RecyclerView.ViewHolder(itemInfoRv.root){
        fun onBind(myInfo: MyInfo){
            val animation = AnimationUtils.loadAnimation(context, R.anim.my_rv_anim)
            itemInfoRv.root.startAnimation(animation)
            itemInfoRv.itemInfoMiqdor.text = myInfo.nomi
            itemInfoRv.itemInfoSumma.text = myInfo.summa
            itemInfoRv.itemInfoCodi.text = myInfo.kodi
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemInfoRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}