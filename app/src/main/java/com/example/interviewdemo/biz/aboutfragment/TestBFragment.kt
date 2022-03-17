package com.example.interviewdemo.biz.aboutfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interviewdemo.R
import com.example.interviewdemo.base.BaseFragment

class TestBFragment : BaseFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_b, container, false)
    }

    companion object {
        val TAG = TestBFragment::class.java.simpleName

        fun newInstance() =
            TestBFragment()
    }
}