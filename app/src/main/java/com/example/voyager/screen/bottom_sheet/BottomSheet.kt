package com.example.voyager.screen.bottom_sheet

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator

object BottomSheet:Screen {
    @Composable
    override fun Content() {
        LazyColumn{
            item {
                val bottomSheetNavigator = LocalBottomSheetNavigator.current
                IconButton(onClick = {
                    bottomSheetNavigator.hide()
                }) {
                    Icon( Icons.Default.Close, contentDescription = " close")
                }
            }

            items(10){
                Text(text = "Count $it")
            }
        }
    }
}