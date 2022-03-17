package com.example.interviewdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.interviewdemo.R
import com.example.interviewdemo.base.BaseFragment
import com.example.interviewdemo.databinding.FragmentClassifyBinding

class ClassifyFragment : BaseFragment() {

    private lateinit var mBinding: FragmentClassifyBinding

    companion object {
        fun newInstance() = ClassifyFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_classify, container, false)
        return mBinding.root
    }
}