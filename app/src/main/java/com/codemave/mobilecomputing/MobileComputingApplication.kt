package com.codemave.mobilecomputing

import android.app.Application
import com.codemave.mobilecomputing.ui.login.SharedPreferences

/**
 * This application class sets up our dependency [Graph] with a context
 */
class MobileComputingApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val userPreferences = SharedPreferences(this)

        Graph.provide(this)
    }
}