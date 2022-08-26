package com.example.fragmenttest1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttest1.databinding.GriditemlayoutBinding
import com.example.fragmenttest1.databinding.ListitemlayoutBinding

class GridLayoutAdapter(private var itemlist: List<String>) : RecyclerView.Adapter<GridLayoutAdapter.ItemListHolder>() {
    inner class ItemListHolder (val binding : GriditemlayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item :String){
            binding.apply {
                griditemTV.text = item
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListHolder {
        return ItemListHolder(GriditemlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemListHolder, position: Int) {
        val item = itemlist[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }
}