package com.example.cryptoapp.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.cryptoapp.pojo.CoinPriceInfo

class CoinPriceInfoCallback : DiffUtil.ItemCallback<CoinPriceInfo>() {
    override fun areItemsTheSame(oldItem: CoinPriceInfo, newItem: CoinPriceInfo): Boolean {
        return oldItem.type == newItem.type
    }

    override fun areContentsTheSame(oldItem: CoinPriceInfo, newItem: CoinPriceInfo): Boolean {
        return oldItem == newItem
    }
}