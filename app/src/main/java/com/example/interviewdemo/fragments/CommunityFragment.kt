package com.example.interviewdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.interviewdemo.R
import com.example.interviewdemo.base.BaseFragment
import com.example.interviewdemo.databinding.FragmentCommunityBinding

class CommunityFragment : BaseFragment() {

    private lateinit var mBinding: FragmentCommunityBinding

    companion object {
        fun newInstance() =
            CommunityFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_community, container, false)
        return mBinding.root
    }
}