package com.example.latestmovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.networksdk.NetworkSDK
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // here will start our project work
        setContentView(R.layout.activity_main)

        val networkSDK = NetworkSDK()

        CoroutineScope(Dispatchers.IO).launch {
            val latestMovies = networkSDK.fetchLatestMovies("909594533c98883408adef5d56143539")
//            val popularMovies = networkSDK.fetchPopularMovies("909594533c98883408adef5d56143539")

            withContext(Dispatchers.Main) {
                Log.e("latestMovies response:","$latestMovies")
                // Update UI with latest and popular movies
                // For example, set text to TextViews
            }

        }
    }
}