package com.georgehigbie.getweathernow2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.georgehigbie.getweathernow2.Services.apiKey

class MainActivity : AppCompatActivity() {

    var darkSkyUrlBase = "https://api.darksky.net/forecast/"
    var longitude:String = ""
    var lattitude:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeHTTPRequest(){
        val apiKeyImport = apiKey

    }

}
