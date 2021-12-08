package com.example.stores2

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter {

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val binding = ItemStoreBinding.bind(view)
    }

}