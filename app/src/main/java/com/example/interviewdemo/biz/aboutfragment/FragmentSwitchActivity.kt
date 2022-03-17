package com.example.interviewdemo.biz.aboutfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.interviewdemo.R
import com.example.interviewdemo.databinding.ActivityFragmentSwitchBinding

/**
 *
 */
class FragmentSwitchActivity : AppCompatActivity() {
    private val mBinding: ActivityFragmentSwitchBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_fragment_switch)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.apply {
            supportFragmentManager.beginTransaction()
                .add(R.id.layout_fragment, TestAFragment.newInstance(), TestAFragment.TAG)
                //.addToBackStack("frag1")
                .commit()

            btnAddB.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .add(R.id.layout_fragment, TestBFragment.newInstance(), TestBFragment.TAG)
                    //.addToBackStack("frag2")
                    .commit()
            }

            btnReplaceB.setOnClickListener {

                supportFragmentManager.beginTransaction()
                    .replace(R.id.layout_fragment, TestBFragment.newInstance(), TestBFragment.TAG)
                    //.addToBackStack("frag2")
                    .commit()
            }

            btnRemoveB.setOnClickListener {
                val fragB = supportFragmentManager.findFragmentByTag(TestBFragment.TAG)
                fragB?.apply {
                    supportFragmentManager.beginTransaction()
                        .remove(this)
                        .commit()
                }
            }

            btnShowFragExist.setOnClickListener {
                val fragB = supportFragmentManager.findFragmentByTag(TestBFragment.TAG)
                val fragA = supportFragmentManager.findFragmentByTag(TestAFragment.TAG)
                var existA: Boolean = true
                var existB: Boolean = true
                if (fragA == null) {
                    existA = false
                }

                if (fragB == null) {
                    existB = false
                }

                val alert = "fragA: $existA, \nfragB: $existB"

                Toast.makeText(this@FragmentSwitchActivity, alert, Toast.LENGTH_LONG).show()
            }
        }
    }
}