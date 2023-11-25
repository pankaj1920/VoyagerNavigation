package com.example.voyager.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.voyager.screen.bottom_nav.HomePage

data class ThirdScreen(val name :String):Screen{
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){

            Button(onClick = {
                navigator.push(HomePage())
            }) {
                Text(text = "Screen 3 $name ")
            }

        }
    }

}
