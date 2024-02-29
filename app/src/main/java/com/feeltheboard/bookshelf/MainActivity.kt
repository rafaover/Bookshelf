package com.feeltheboard.bookshelf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.CompositionLocalProvider
import com.feeltheboard.bookshelf.ui.BookShelfApp
import com.feeltheboard.bookshelf.ui.theme.BookshelfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val app = application as BookShelfApplication
        setContent {
            CompositionLocalProvider(LocalBookShelfViewModel provides app.bookShelfViewModel) {
                BookshelfTheme {
                    Surface(
                        color = MaterialTheme.colorScheme.background
                    ) {
                        BookShelfApp()
                    }
                }
            }
        }
    }
}