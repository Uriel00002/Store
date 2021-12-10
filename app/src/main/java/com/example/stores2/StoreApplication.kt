package com.example.stores2

import android.app.Application

class StoreApplication : Application() {
    companion object{
        lateinit var database: StoreDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this,
        StoreDatabase::class.java
        "StoreDatabase")
            .build()
    }
}