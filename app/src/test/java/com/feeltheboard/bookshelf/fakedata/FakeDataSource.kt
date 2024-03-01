package com.feeltheboard.bookshelf.fakedata

import com.feeltheboard.bookshelf.network.model.BookImageLinks
import com.feeltheboard.bookshelf.network.model.BookItems
import com.feeltheboard.bookshelf.network.model.BookVolumeInfo

object FakeDataSource {
    val books = fakeBooksList
}

val fakeImageLinks = BookImageLinks(
    thumbnail = "https://fakeurl.com/thumbnail.jpg"
)

val fakeVolumeInfo = BookVolumeInfo(
    title = "Fake Book Title",
    imageLinks = fakeImageLinks
)

val fakeBookItems = BookItems(
    id = "fakeId",
    volumeInfo = fakeVolumeInfo
)

val fakeBooksList = listOf(
    fakeBookItems
)