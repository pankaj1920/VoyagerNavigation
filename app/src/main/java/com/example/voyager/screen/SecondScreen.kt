package com.example.voyager.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.voyager.screen.bottom_sheet.BottomSheet
import com.example.voyager.screen.bottom_sheet.BottomSheetScreen

object SecondScreen:Screen{
    
    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    override fun Content() {

        BottomSheetNavigator {
            Navigator (screen = BottomSheetScreen)
        }
       /* val navigator = LocalNavigator.currentOrThrow
        val bottomSheetNavigator = LocalBottomSheetNavigator.current

        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){

            Button(onClick = {
                navigator.push(ThirdScreen("Pankaj"))
            }) {
                Text(text = "Screen 2 ")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                bottomSheetNavigator.show(BottomSheet)
            }) {
                Text(text = "BottomSheet")
            }

        }*/
    }

}