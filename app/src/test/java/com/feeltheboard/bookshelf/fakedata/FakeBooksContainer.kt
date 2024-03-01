package com.feeltheboard.bookshelf.fakedata

import com.feeltheboard.bookshelf.data.BookShelfContainer
import com.feeltheboard.bookshelf.data.BooksRepository

class FakeBookShelfContainer : BookShelfContainer {
    override val booksRepository: BooksRepository = FakeBooksRepository()
}