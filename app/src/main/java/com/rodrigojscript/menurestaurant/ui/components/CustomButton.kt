package com.rodrigojscript.menurestaurant.ui.components

import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CustomButton(title: String, onClick: () -> Unit) {
    Button(onClick = { onClick }, shape = MaterialTheme.shapes.medium,) {
        Text(text = title)
    }
}