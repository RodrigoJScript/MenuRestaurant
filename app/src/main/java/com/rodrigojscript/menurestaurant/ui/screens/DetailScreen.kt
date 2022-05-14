package com.rodrigojscript.menurestaurant.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.rodrigojscript.menurestaurant.R
import com.rodrigojscript.menurestaurant.ui.components.CustomAppBar
import com.rodrigojscript.menurestaurant.ui.components.CustomButton
import com.rodrigojscript.menurestaurant.ui.theme.BaseAppTheme

@Composable
fun DetailScreen() {
    BaseAppTheme {
        Scaffold(topBar = {
            CustomAppBar(title = "Details", icon = Icons.Default.ArrowBack)
        }, content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.one),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
                )
                Text(
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    text = "Pol, a bene zelus, pes! The lover has uniqueness, but not everyone avoids it. For a quartered tender frittata, add some ice water and rosemary."
                )
                Text(modifier = Modifier.padding(20.dp), text = "00:00")
                CustomButton(title = "Order", onClick = {/*Todo*/ })
            }

        })
    }
}