package com.codemave.mobilecomputing.ui

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.codemave.mobilecomputing.ui.login.SharedPreferences
import com.codemave.mobilecomputing.ui.theme.MobileComputingTheme
// import android.content.SharedPreferences

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Correct username and password are stored in SharedPreferences class
        val credentials = SharedPreferences(this)
        credentials.saveCredentials("matti", "123")

        setContent {
            MobileComputingTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MobileComputingApp(context = applicationContext)
                }
            }
        }
    }
}
