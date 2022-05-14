package com.rodrigojscript.menurestaurant.ui.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rodrigojscript.menurestaurant.R

@Composable
fun CustomImage(image: Int, onClick: () -> Unit) {
    Image(
        painterResource(id = image),
        contentDescription = null, modifier = Modifier
            .padding(20.dp)
            .size(width = 100.dp, height = 100.dp)
            .clickable { onClick }
    )
}