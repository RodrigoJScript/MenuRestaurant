package com.rodrigojscript.menurestaurant.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rodrigojscript.menurestaurant.ui.components.CustomAppBar
import com.rodrigojscript.menurestaurant.ui.components.CustomButton
import com.rodrigojscript.menurestaurant.ui.theme.BaseAppTheme


@Composable
fun MainScreen() {
    BaseAppTheme {
        Scaffold(topBar = {
            CustomAppBar("The Restaurant")
        }, content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Welcome to restaurant")
                CustomButton(title = "Food", onClick = { /*TODO*/ })
                CustomButton(title = "About Of", onClick = { /*TODO*/ })
            }
        }
        )
    }

}