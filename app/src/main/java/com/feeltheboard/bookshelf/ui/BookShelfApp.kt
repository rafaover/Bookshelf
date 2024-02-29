package com.feeltheboard.bookshelf.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.feeltheboard.bookshelf.BookShelfApplication
import com.feeltheboard.bookshelf.ui.components.BookShelfAppTopBar
import com.feeltheboard.bookshelf.ui.components.BookShelfHomeScreen

@Composable
fun BookShelfApp() {
    Scaffold(
        topBar = {
            BookShelfAppTopBar()
        }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            BookShelfHomeScreen(
                books = (LocalContext.current.applicationContext as BookShelfApplication).bookShelfViewModel.bookShelfState,
                contentPadding = it
            )
        }
    }
}