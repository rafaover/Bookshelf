package com.feeltheboard.bookshelf.data

import com.feeltheboard.bookshelf.network.BooksApiService
import com.feeltheboard.bookshelf.network.model.Books

interface BooksRepository {
    suspend fun getBooks(): Books
}

class NetworkBooksRepository(
    private val booksApiService: BooksApiService
): BooksRepository {
    override suspend fun getBooks(): Books {
        return booksApiService.getBooks()
    }
}