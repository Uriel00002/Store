package com.example.stores2


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete


@Dao
interface StoreDao {

    @Query { "SELECT * FROM StoreEntity"}
    fun getAllStores() : MutableList<StoreEntity>

    @Insert
    fun addStore (storeEntity : StoreEntity)

    @Update
    fun updateStore (storeEntity : StoreEntity)

    @Delete
    fun deleteStore (storeEntity : StoreEntity)

}