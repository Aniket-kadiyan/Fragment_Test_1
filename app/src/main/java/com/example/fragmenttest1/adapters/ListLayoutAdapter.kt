package com.example.fragmenttest1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttest1.databinding.ListitemlayoutBinding

class ListLayoutAdapter(private var itemList : List<String>) : RecyclerView.Adapter<ListLayoutAdapter.ItemListHolder>() {

    inner class ItemListHolder (val binding : ListitemlayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item :String){
            binding.apply {
                listitemTV.text = item
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListHolder {
        return ItemListHolder(ListitemlayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemListHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}