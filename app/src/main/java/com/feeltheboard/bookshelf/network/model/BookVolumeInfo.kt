package com.feeltheboard.bookshelf.network.model

data class BookVolumeInfo(
    val title: String,
    val authors: List<String>,
    val description: String,
    val imageLinks: BookImageLinks
)
