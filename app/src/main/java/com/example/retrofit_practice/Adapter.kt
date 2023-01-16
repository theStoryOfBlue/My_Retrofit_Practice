package com.example.retrofit_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_practice.data.Data_Detail
import com.example.retrofit_practice.databinding.ItemBinding

/**
 * 2023-01-12
 * pureum
 */
class Adapter(): RecyclerView.Adapter<Adapter.AdapterViewHolder>() {

    var imformation = arrayListOf<Data_Detail>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class AdapterViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list: Data_Detail) {
            binding.textView.text = "${list.stdDate.slice(0..3)}.${list.stdDate.slice(4..5)}.${list.stdDate.slice(6..7)}"
            binding.textView2.text = "${list.stdHour.slice(0..1)}:${list.stdHour.slice(2..3)}"
            binding.textView3.text = "${list.conzoneName}"
            binding.textView4.text = "${list.speed}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.bind(imformation[position])
    }

    override fun getItemCount(): Int = imformation.size

}