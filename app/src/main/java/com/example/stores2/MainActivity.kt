package com.example.stores2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.stores2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {


    private lateinit var mBinding: ActivityMainBinding

    private  lateinit var mAdapter: StoreAdapter

    private  lateinit var mGridLayout: GridLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnSave.setOnClickListener{
            val store = StoreEntity(name = mBinding.etName.text.toString().trim())

            Thread {
                StoreApplication.database.storeDao().addStore(store)
            }.start()

            mAdapter.add(store)
        }

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mAdapter = StoreAdapter(mutableListOf(), this )
        mGridLayout = GridLayoutManager(this, 2)

        mBinding.recyclerView.apply{
            setHasFixedSize(true)
            layoutManager = mGridLayout
            adapter = mAdapter
        }
    }

    override fun onClick(storeEntity: StoreEntity){

    }

}