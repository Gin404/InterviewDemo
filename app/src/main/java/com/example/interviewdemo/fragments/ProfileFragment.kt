package com.example.interviewdemo.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.interviewdemo.R
import com.example.interviewdemo.base.BaseFragment
import com.example.interviewdemo.biz.aboutfragment.FragmentSwitchActivity
import com.example.interviewdemo.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment() {

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            btnTestFragJump.setOnClickListener {
                val intent = Intent(requireActivity(), FragmentSwitchActivity::class.java)
                startActivity(intent)
            }
        }
    }

}