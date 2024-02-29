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
            /** 2. CompositionLocalProvider is used to provide the view model to the entire app
             * using the LocalBookShelfViewModel CompositionLocal created on the
             * BookShelfApplication class.
             * */
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