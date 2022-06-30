package com.example.mydaggerdemo

import android.app.Application
import android.widget.Toast

class ToastMaker(val app:Application) {
    fun showToast(message:String){
        Toast.makeText(app,message,Toast.LENGTH_SHORT).show()
    }
}