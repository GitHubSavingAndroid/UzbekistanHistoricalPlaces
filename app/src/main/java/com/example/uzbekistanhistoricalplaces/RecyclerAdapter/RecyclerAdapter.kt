package com.example.uzbekistanhistoricalplaces.RecyclerAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uzbekistanhistoricalplaces.Dataclass.info
import com.example.uzbekistanhistoricalplaces.databinding.KorinishListItemBinding

class RecyclerAdapter(val clicklistener: (info) -> Unit):
        ListAdapter<info, RecyclerAdapter.MyViewHolder>(diffUtil) {
        class MyViewHolder(val binding: KorinishListItemBinding):RecyclerView.ViewHolder(binding.root)

    companion object{
        val diffUtil=object:DiffUtil.ItemCallback<info>(){


            override fun areItemsTheSame(oldItem: info, newItem: info): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: info, newItem: info): Boolean {
                return oldItem.image == newItem.image
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            KorinishListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.apply {
            TextView.text = item.name
        }
        holder.itemView.setOnClickListener {
            clicklistener(item)
        }
        Glide.with(holder.itemView).load(item.image).into(holder.binding.ImageView)
    }
}