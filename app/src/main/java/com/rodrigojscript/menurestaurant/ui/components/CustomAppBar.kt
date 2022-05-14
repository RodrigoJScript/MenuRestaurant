package com.rodrigojscript.menurestaurant.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun CustomAppBar(title: String, icon: ImageVector? = null) {
    TopAppBar {
        IconButton(onClick = { /*TODO*/ }) {
            if (icon != null) {
                Icon(imageVector = icon, contentDescription = null)
            }
        }
        Text(text = title)
    }
}