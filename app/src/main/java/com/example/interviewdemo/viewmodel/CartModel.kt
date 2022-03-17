package com.example.interviewdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartModel : ViewModel() {
    var shoppingItemLiveData = MutableLiveData<ShoppingItem>()

    fun loadShoppingItems() {

    }
}

data class ShoppingItem(
    var name: String?,
    var id: String?,
    var imgUrl: String?
)