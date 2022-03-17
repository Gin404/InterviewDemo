package com.example.interviewdemo.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.interviewdemo.R
import com.example.interviewdemo.Utils
import com.example.interviewdemo.base.BaseFragment
import com.example.interviewdemo.databinding.FragmentShoppingCartBinding
import com.example.interviewdemo.viewmodel.FragLiveData

class ShoppingCartFragment : BaseFragment() {

    private lateinit var mBinding: FragmentShoppingCartBinding

    companion object {
        fun newInstance() =
            ShoppingCartFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shopping_cart, container, false)
        FragLiveData.observe(viewLifecycleOwner) {
            Log.d("zangjin", "ShoppingCartFragment observe: $it")
            mBinding.tvCartItem.text = it
        }
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.apply {
            btnChangeAmount.setOnClickListener {
                FragLiveData.postValue(Utils.getRandomInt().toString())
            }

            tvCartItem.text = FragLiveData.value
        }
    }
}