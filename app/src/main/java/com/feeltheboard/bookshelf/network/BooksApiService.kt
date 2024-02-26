package com.feeltheboard.bookshelf.network

import com.feeltheboard.bookshelf.network.model.Books
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL="https://www.googleapis.com/books/"

val retrofit: Retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

object BooksApiClient {
    val retrofitService: BooksApiService by lazy {
        retrofit.create(BooksApiService::class.java)
    }
}

interface BooksApiService {
    @GET("v1/volumes?q=science+fiction/")
    suspend fun getBooks() : Response<Books>
}