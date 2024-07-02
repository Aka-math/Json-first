package com.example.jsonfirst

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    fun getJson(view: View) {
        getMarsPhotos()
    }

    private fun getMarsPhotos() {
        GlobalScope.launch {
            val listResult = MarsApi.retrofitService.getPhotos()
            Log.i("HomeActivity",listResult)
        }
    }
}