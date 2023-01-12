package com.example.retrofit_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_practice.Data.Detail
import com.example.retrofit_practice.databinding.ItemBinding

/**
 * 2023-01-12
 * pureum
 */
class Adapter(): RecyclerView.Adapter<Adapter.AdapterViewHolder>() {

    var imformation = arrayListOf<Detail>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class AdapterViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list: Detail) {
            binding.textView.text = "날짜:${list.stdDate}"
            binding.textView2.text = "스피드:${list.stdHour}"
            binding.textView3.text = "스피드:${list.conzoneName}"
            binding.textView4.text = "스피드:${list.speed}"
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