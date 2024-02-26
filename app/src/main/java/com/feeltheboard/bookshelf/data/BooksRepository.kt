package com.feeltheboard.bookshelf.data

import com.feeltheboard.bookshelf.network.BooksApiClient
import com.feeltheboard.bookshelf.network.model.Books

interface BooksRepository {
    suspend fun getBooks(): List<Books>
}

class NetworkBooksRepository(): BooksRepository {
    override suspend fun getBooks(): List<Books> {
        return BooksApiClient.retrofitService.getBooks()
    }
}