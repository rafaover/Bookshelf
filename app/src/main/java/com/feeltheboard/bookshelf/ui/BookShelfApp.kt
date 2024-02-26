package com.feeltheboard.bookshelf.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
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
            val booksViewModel: BookShelfViewModel = viewModel()
            BookShelfHomeScreen(
                books = booksViewModel.bookShelfState,
                contentPadding = it
            )
        }
    }
}