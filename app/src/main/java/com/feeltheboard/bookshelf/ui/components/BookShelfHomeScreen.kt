package com.feeltheboard.bookshelf.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BookShelfHomeScreen(
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier
    ) {
    Column(
        modifier = Modifier.fillMaxSize(),
        ) {
            Text("Welcome to BookShelf!")
        }
    }