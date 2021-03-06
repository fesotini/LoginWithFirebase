package com.example.loginwithfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        /*
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        */

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración de Firebase Completa")
        analytics.logEvent("InitScreen", bundle)
    }
}