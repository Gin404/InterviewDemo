package com.example.interviewdemo

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.interviewdemo.databinding.ActivityMainBinding
import com.example.interviewdemo.fragments.*
import com.example.interviewdemo.viewmodel.ActLiveData

class MainActivity : FragmentActivity() {

    private val mBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    companion object {
        val TAG = MainActivity::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActLiveData.observe(this) {
            Log.d("zangjin", "MainActivity observe: $it")
        }

        mBinding.apply {
            bottomNavi.setOnItemSelectedListener { item ->
                 when(item.itemId) {
                     R.id.page_home -> {
                         viewPager.setCurrentItem(0, false)
                         true
                     }
                     R.id.page_classify -> {
                         viewPager.setCurrentItem(1, false)
                         true
                     }
                     R.id.page_community -> {
                         viewPager.setCurrentItem(2, false)
                         true
                     }
                     R.id.page_shopping_cart -> {
                         viewPager.setCurrentItem(3, false)
                         true
                     }
                     R.id.page_profile -> {
                         viewPager.setCurrentItem(4, false)
                         true
                     }
                     else -> true
                 }
            }
            viewPager.isUserInputEnabled = false
            viewPager.adapter = object: FragmentStateAdapter(this@MainActivity) {
                override fun getItemCount(): Int {
                    return 5
                }

                override fun createFragment(position: Int): Fragment {
                    Log.d(TAG, "create fragment: position $position")
                    return when(position) {
                        0 -> HomeFragment.newInstance()
                        1 -> ClassifyFragment.newInstance()
                        2 -> CommunityFragment.newInstance()
                        3 -> ShoppingCartFragment.newInstance()
                        4 -> ProfileFragment.newInstance()
                        else -> HomeFragment.newInstance()
                    }
                }
            }
        }
    }
}