package com.example.mydaggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var toastMaker: ToastMaker
    override fun onCreate(savedInstanceState: Bundle?) {
//        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<TextView>(R.id.tv).setOnClickListener {
//            toastMaker.showToast("Hello world")
//        }

    }
}