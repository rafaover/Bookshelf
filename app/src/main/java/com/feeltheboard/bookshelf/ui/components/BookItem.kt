package com.feeltheboard.bookshelf.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.bookshelf.R

@Composable
fun BookItem(
    modifier: Modifier = Modifier,
    image: Painter,
    description: String
) {
    Box {
        Image(
            painter = image,
            contentDescription = description
        )
    }
}

@Preview
@Composable
fun BookItemPreview() {
    BookItem(image = painterResource(R.drawable.bookcover), description = "Book Cover")
}