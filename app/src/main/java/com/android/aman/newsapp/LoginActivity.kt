package com.android.aman.newsapp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 5000

    //Variables
    var backgroundImage: ImageView? = null


    //Animation
    var sideAnim: Animation? = null
    var bottomAnim: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //fullscreen view
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_login)

        startActivity(Intent(this,MainActivity::class.java))




    }
}
