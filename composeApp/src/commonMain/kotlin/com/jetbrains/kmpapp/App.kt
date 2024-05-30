package com.jetbrains.kmpapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.jetbrains.kmpapp.di.initKoin
import com.jetbrains.kmpapp.screens.list.ListScreen

@Composable
fun App() {
    initKoin()
    MaterialTheme {
        Navigator(ListScreen)
    }
}
