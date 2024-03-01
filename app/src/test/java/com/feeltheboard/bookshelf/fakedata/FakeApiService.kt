package com.feeltheboard.bookshelf.fakedata

import com.feeltheboard.bookshelf.network.BooksApiService
import com.feeltheboard.bookshelf.network.model.Books

class FakeApiService: BooksApiService {
    override suspend fun getBooks(): Books {
        return Books(
            items = FakeDataSource.books
        )
    }
}