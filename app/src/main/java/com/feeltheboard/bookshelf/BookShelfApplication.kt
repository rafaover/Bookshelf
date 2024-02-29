package com.feeltheboard.bookshelf

import android.app.Application
import com.feeltheboard.bookshelf.data.BookShelfContainer
import com.feeltheboard.bookshelf.data.BookShelfContainerImpl
import com.feeltheboard.bookshelf.ui.BookShelfViewModel

class BookShelfApplication: Application() {
    private lateinit var bookShelfContainer: BookShelfContainer
    lateinit var bookShelfViewModel: BookShelfViewModel
    override fun onCreate() {
        super.onCreate()
        bookShelfContainer = BookShelfContainerImpl()

        val booksRepository = bookShelfContainer.booksRepository
        bookShelfViewModel = BookShelfViewModel(booksRepository)
    }
}