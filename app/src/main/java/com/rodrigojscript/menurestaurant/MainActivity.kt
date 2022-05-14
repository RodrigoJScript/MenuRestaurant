package com.rodrigojscript.menurestaurant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rodrigojscript.menurestaurant.ui.screens.DetailScreen
import com.rodrigojscript.menurestaurant.ui.screens.FoodScreen
import com.rodrigojscript.menurestaurant.ui.screens.MainScreen
import com.rodrigojscript.menurestaurant.ui.theme.BaseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaseAppTheme {
                MainScreen()
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    DetailScreen()
}


