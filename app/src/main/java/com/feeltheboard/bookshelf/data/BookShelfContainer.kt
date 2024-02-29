package com.feeltheboard.bookshelf.data

import com.feeltheboard.bookshelf.network.BooksApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface BookShelfContainer {
    val booksRepository: BooksRepository
}

class BookShelfContainerImpl: BookShelfContainer {

    private val baseUrl = "https://www.googleapis.com/books/"
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val retrofitService: BooksApiService by lazy {
        retrofit.create(BooksApiService::class.java)
    }

    override val booksRepository: BooksRepository by lazy {
        NetworkBooksRepository(retrofitService)
    }
}
