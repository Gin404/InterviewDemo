package com.example.interviewdemo.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData

object ActLiveData: MutableLiveData<String>() {
    override fun onActive() {
        super.onActive()
        Log.d("zangjin", "ActLiveData: onActive: $value")
    }

    override fun onInactive() {
        super.onInactive()
        Log.d("zangjin", "ActLiveData: onInactive: $value")
    }
}