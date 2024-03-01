package com.feeltheboard.bookshelf.fakedata

import com.feeltheboard.bookshelf.data.BooksRepository
import com.feeltheboard.bookshelf.network.model.Books
import org.junit.Test

class FakeBooksRepository: BooksRepository {
    override suspend fun getBooks(): Books {
        return Books(
            items = FakeDataSource.books
        )
    }
}