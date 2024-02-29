package com.feeltheboard.bookshelf.network

import com.feeltheboard.bookshelf.network.model.Books
import retrofit2.http.GET

interface BooksApiService {
    @GET("v1/volumes?q=science+fiction/")
    suspend fun getBooks(): Books
}