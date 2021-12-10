package com.example.stores2


@Database(entities = arrayOf(StoreEntity::class), version = 1)
abstract class StoreDatabase : Room.Database(){

    abstract  fun storeDao(): StoreDao

}