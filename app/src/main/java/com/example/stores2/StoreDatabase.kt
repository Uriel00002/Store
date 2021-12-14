package com.cursosant.android.stores2

import androidx.room.Database
import androidx.room.RoomDatabase

/****
 * Proyecto: Stores
 *
 *
 * Daniel Fernandez Guarneros 4°A
 *
 * Desarrollo de Software Multiplataforma
 *
 * Diseño para Apps
 ***/
@Database(entities = arrayOf(StoreEntity::class), version = 1)
abstract class StoreDatabase : RoomDatabase() {
    abstract fun storeDao(): StoreDao
}