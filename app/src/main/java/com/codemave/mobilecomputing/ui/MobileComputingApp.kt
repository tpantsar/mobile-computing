package com.codemave.mobilecomputing.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codemave.mobilecomputing.data.entity.Profile
import com.codemave.mobilecomputing.ui.home.Home
import com.codemave.mobilecomputing.ui.login.Login
import com.codemave.mobilecomputing.ui.maps.PaymentLocationMap
import com.codemave.mobilecomputing.ui.payment.Payment
import com.codemave.mobilecomputing.ui.payment.Profile

@Composable
fun MobileComputingApp(
    context: Context,
    appState: MobileComputingAppState = rememberMobileComputingAppState()
) {
    NavHost(
        navController = appState.navController,
        startDestination = "login"
    ) {

        composable(route = "login") {
            Login(navController = appState.navController, context)
        }

        composable(route = "home") {
            Home(navController = appState.navController)
        }

        /*composable(route = "profile") {
            Profile(navController = appState.navController, context)
        }*/

        composable(route = "profile") {
            Profile(onBackPress = appState::navigateBack, navController = appState.navController)
        }

        composable(route = "payment") {
            Payment(onBackPress = appState::navigateBack, navController = appState.navController)
        }

        composable(route = "map") {
            PaymentLocationMap(navController = appState.navController)
        }

    }
}