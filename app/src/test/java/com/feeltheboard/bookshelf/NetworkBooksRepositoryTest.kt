package com.feeltheboard.bookshelf

import com.feeltheboard.bookshelf.data.NetworkBooksRepository
import com.feeltheboard.bookshelf.fakedata.FakeApiService
import com.feeltheboard.bookshelf.fakedata.FakeDataSource
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkBooksRepositoryTest {
    @Test
    fun networkBooksRepository_getData_verifyList() {
        runTest {
            // Arrange
            val booksRepository = NetworkBooksRepository(FakeApiService())
            // Act
            val books = booksRepository.getBooks()
            // Assert
            assertEquals(FakeDataSource.books, books.items)
        }
    }

}