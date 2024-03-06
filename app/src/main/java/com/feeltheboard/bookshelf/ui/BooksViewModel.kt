package com.feeltheboard.bookshelf.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.feeltheboard.bookshelf.data.BooksRepository
import kotlinx.coroutines.launch

class BookShelfViewModel(
    private val booksRepository: BooksRepository
): ViewModel() {
    var bookShelfState: String by mutableStateOf("")
    var bookShelfThumbnail: List<String> by mutableStateOf(emptyList())

    init {
        getBooks()
    }

    private fun getBooks() =
        try {
            viewModelScope.launch {
                val books = booksRepository.getBooks()
                bookShelfState = ("${books.items.size} Books found!")
                bookShelfThumbnail = books.items.map {
                    it.volumeInfo.imageLinks.thumbnail.replace("http", "https")
                }
            }
        } catch (e: Exception) {
                bookShelfState = "Error: ${e.message}"
        }
}