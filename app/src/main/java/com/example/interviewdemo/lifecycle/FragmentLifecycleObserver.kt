package com.example.interviewdemo.lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.interviewdemo.base.BaseFragment

class FragmentLifecycleObserver: DefaultLifecycleObserver {
    companion object {
        val TAG = FragmentLifecycleObserver::class.simpleName
    }

    override fun onCreate(owner: LifecycleOwner) {
        if (owner is BaseFragment) {
            Log.d(TAG, "onCreate ${owner::class.simpleName}")
        }
    }

    override fun onStart(owner: LifecycleOwner) {
        if (owner is BaseFragment) {
            Log.d(TAG, "onStart ${owner::class.simpleName}")
        }
    }

    override fun onStop(owner: LifecycleOwner) {
        if (owner is BaseFragment) {
            Log.d(TAG, "onStop ${owner::class.simpleName}")
        }
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d(TAG, "onPause ${owner::class.simpleName}")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d(TAG, "onResume ${owner::class.simpleName}")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(TAG, "onDestroy ${owner::class.simpleName}")
    }
}