package com.example.interviewdemo.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.interviewdemo.R
import com.example.interviewdemo.base.BaseFragment
import com.example.interviewdemo.databinding.FragmentHomeBinding
import com.example.interviewdemo.viewmodel.FragLiveData

class HomeFragment: BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragLiveData.observe(viewLifecycleOwner
        ) {
            Log.d("zangjin", "HomeFragment observe: $it")
            binding.tvShoppingItem.text = it
        }
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}