package uz.programmer710.ussdkodlari2022.adapters

import android.content.pm.PackageItemInfo
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.programmer710.ussdkodlari2022.databinding.ActivityMainBinding.inflate
import uz.programmer710.ussdkodlari2022.databinding.ItemInfoBinding
import uz.programmer710.ussdkodlari2022.models.InfoImage

class InfoAdapter(val list: List<InfoImage>) : RecyclerView.Adapter<InfoAdapter.Vh>() {
    inner class Vh(val itemInfo: ItemInfoBinding): RecyclerView.ViewHolder(itemInfo.root){
        fun onBind(infoImage: InfoImage){
            itemInfo.itemInfoImage.setBackgroundResource(infoImage.infoimage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}