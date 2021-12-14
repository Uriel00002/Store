package com.example.stores2

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.stores2.databinding.FragmentEditStoreBinding

class EditStoreFragment : Fragment() {

    private lateinit var mBinding: FragmentEditStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = FragmentEditStoreBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as? MainActivity
        Activity?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        Activity?.supportActionBar?.title = getString(R.string.el_pepe)
    }

}