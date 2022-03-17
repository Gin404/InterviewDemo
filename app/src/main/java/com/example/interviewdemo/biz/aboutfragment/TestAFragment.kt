package com.example.interviewdemo.biz.aboutfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.interviewdemo.R
import com.example.interviewdemo.base.BaseFragment
import com.example.interviewdemo.databinding.FragmentTestABinding

class TestAFragment : BaseFragment() {
    private lateinit var mBinding: FragmentTestABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_test_a, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        val TAG = TestAFragment::class.java.simpleName

        fun newInstance() =
            TestAFragment()
    }
}