package com.example.stores2

import androidx.room.Entity

@Entity(tableName = "StoreEntity")
data class StoreEntity(@PrimaryKey(autoGenerate = "True") var id: Long = 0,
                       var name: String,
                       var phone: String = "",
                       var website: String = "",
                       var isFavorite: Boolean = false)
