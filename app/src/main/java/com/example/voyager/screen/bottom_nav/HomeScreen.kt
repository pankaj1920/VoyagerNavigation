package com.example.voyager.screen.bottom_nav

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object HomeScreen :Tab{


    override val options: TabOptions
        @Composable
        get() {
            val title ="Home"
            val icon = rememberVectorPainter(Icons.Default.Home)
            return remember {
                TabOptions(0u,"Home",icon)

            }
        }

    @Composable
    override fun Content() {

        Text(text = "Hello Home")
    }
}