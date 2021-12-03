package com.kotlinassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.kotlinassignment.databinding.ListDataAdapterBinding
import com.squareup.picasso.Picasso


class ListDataAdpter : RecyclerView.Adapter<MainViewHolder>() {

    var dataList = mutableListOf<ListData>()
    lateinit var binding : ListDataAdapterBinding

    fun setData(data: List<ListData>) {
        this.dataList = data.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val inflater = LayoutInflater.from(parent.context)
         binding = ListDataAdapterBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
       holder.setIsRecyclable(false)
        val data = dataList[position]
        with(data){
          if (title==null && description==null && imageHref==null){
             setVisibility(false,holder.itemView)
          }else{
              holder.binding.title.text = title
              holder.binding.desc.text = description

              val imageUri = imageHref ?.replace("http", "https")
              Picasso.get()
                      .load(imageUri)
                      .placeholder(R.drawable.placeholder)
                      .resize(80, 80)
                      .error(R.drawable.placeholder)
                      .into(holder.binding.imageView)
          }
        }

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setVisibility(isVisible: Boolean, itemView :View) {
        val param = itemView.getLayoutParams() as RecyclerView.LayoutParams
        if (isVisible) {
            param.height = LinearLayout.LayoutParams.WRAP_CONTENT
            param.width = LinearLayout.LayoutParams.MATCH_PARENT
            itemView.setVisibility(View.VISIBLE)
        } else {
            itemView.setVisibility(View.GONE)
            param.height = 0
            param.width = 0
        }
        itemView.setLayoutParams(param)
    }
}

class MainViewHolder(val binding: ListDataAdapterBinding) : RecyclerView.ViewHolder(binding.root) {}
