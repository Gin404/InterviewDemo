package com.example.interviewdemo.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData

object FragLiveData: MutableLiveData<String>() {

    override fun onActive() {
        super.onActive()
        Log.d("zangjin", "FragLiveData: onActive: $value")
    }

    override fun onInactive() {
        super.onInactive()
        Log.d("zangjin", "FragLiveData: onInactive: $value")
    }
}