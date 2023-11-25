package com.example.voyager.screen.bottom_nav

import BookmarkScreen
import ProfileScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator

class HomePage : Screen {
    @Composable
    override fun Content() {
        Surface {
            TabNavigator(tab = HomeScreen) {
                Scaffold(

                    bottomBar = {
                        BottomNavigation {
                            TabNavigationItem(tab = HomeScreen)
                            TabNavigationItem(tab = BookmarkScreen)
                            TabNavigationItem(tab = ProfileScreen)
                        }
                    }
                ) {
                    Column(modifier = Modifier.padding(it)) {
                        CurrentTab()
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current
    BottomNavigationItem(selected = tabNavigator.current == tab,
        onClick = {
            tabNavigator.current = tab
        }, icon = {
            Icon(painter = tab.options.icon!!, contentDescription = tab.options.title)
        })
}