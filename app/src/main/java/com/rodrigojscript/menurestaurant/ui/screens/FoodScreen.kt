package com.rodrigojscript.menurestaurant.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rodrigojscript.menurestaurant.R
import com.rodrigojscript.menurestaurant.R.drawable
import com.rodrigojscript.menurestaurant.ui.components.CustomAppBar
import com.rodrigojscript.menurestaurant.ui.components.CustomImage
import com.rodrigojscript.menurestaurant.ui.theme.BaseAppTheme

@Composable
fun FoodScreen() {
    BaseAppTheme {
        Scaffold(topBar = {
            CustomAppBar(title = "Food", icon = Icons.Default.ArrowBack)
        }, content = {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(modifier = Modifier.padding(20.dp)) {
                    CustomImage(image = R.drawable.one, onClick = { /*TODO*/ })
                    CustomImage(image = R.drawable.one, onClick = { /*TODO*/ })
                }

                Row(modifier = Modifier.padding(20.dp)) {
                    CustomImage(image = R.drawable.one, onClick = { /*TODO*/ })
                    CustomImage(image = R.drawable.one, onClick = { /*TODO*/ })
                }
            }
        })
    }
}