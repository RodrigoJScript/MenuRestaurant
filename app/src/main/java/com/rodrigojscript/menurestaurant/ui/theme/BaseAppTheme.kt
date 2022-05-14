package com.rodrigojscript.menurestaurant.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
fun BaseAppTheme(content: @Composable () -> Unit) {
    MenuRestaurantTheme {
        Surface(color = MaterialTheme.colors.background)
        {
            content()
        }
    }
}