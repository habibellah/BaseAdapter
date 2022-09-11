package habibellah.ayata.baseadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapterEx <T>(private var items: List<T>):
    RecyclerView.Adapter<BaseAdapterEx.BaseViewHolder>() {

    abstract val layoutId:Int
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

        return ItemViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),layoutId,parent,false))
    }
    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentItem = items[position]
        when(holder)
        {
            is ItemViewHolder ->{
                holder.binding.setVariable(BR.item,currentItem)
            }
        }
    }

    class ItemViewHolder(val binding: ViewDataBinding):BaseViewHolder(binding)

    override fun getItemCount() = items.size

    abstract class BaseViewHolder(binding : ViewDataBinding): RecyclerView.ViewHolder(binding.root)

}