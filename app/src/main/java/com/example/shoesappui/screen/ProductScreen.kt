package com.example.shoesappui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.shoesappui.R
import com.example.shoesappui.models.Product
import com.example.shoesappui.screen.components.ProductItem

@Composable
fun ProductScreen() {
    val products = remember {
        getProductList()
    }
    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(16.dp)) {
        items(products){
            ProductItem(product = it)
        }
    }
}

fun getProductList(): List<Product> {
    return listOf(
        Product(
            id = "1",
            name = "Nike Pink",
            color = Color.Magenta,
            price = 1300.0f,
            discountPrice = 1000.0f,
            size = 8,
            rating = 4.7f,
            imageRes = R.drawable.s_1
        ),
        Product(
            id = "2",
            name = "Nike Blue",
            color = Color.Blue,
            price = 1500.0f,
            discountPrice = 1299.0f,
            size = 7,
            rating = 4.0f,
            imageRes = R.drawable.s_2
        ),
        Product(
            id = "3",
            name = "Nike Shoe",
            color = Color.Blue,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 10,
            rating = 4.5f,
            imageRes = R.drawable.s_3
        ),
        Product(
            id = "4",
            name = "Nike Shoe",
            color = Color.Gray,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 8,
            rating = 4.5f,
            imageRes = R.drawable.s_4
        ),
        Product(
            id = "5",
            name = "Nike Shoe",
            color = Color.Cyan,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 6,
            rating = 4.5f,
            imageRes = R.drawable.s_5
        ),
        Product(
            id = "6",
            name = "Nike Shoe",
            color = Color.DarkGray,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 10,
            rating = 4.5f,
            imageRes = R.drawable.s_6
        ),
        Product(
            id = "7",
            name = "Nike Shoe",
            color = Color.Cyan,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 9,
            rating = 4.5f,
            imageRes = R.drawable.s_7
        ),
        Product(
            id = "8",
            name = "Nike Shoe",
            color = Color.Magenta,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 7,
            rating = 4.5f,
            imageRes = R.drawable.s_8
        ),
        Product(
            id = "9",
            name = "Nike Shoe",
            color = Color.Yellow,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 9,
            rating = 4.5f,
            imageRes = R.drawable.s_9
        ),
        Product(
            id = "10",
            name = "Nike Show",
            color = Color.LightGray,
            price = 1300.0f,
            discountPrice = 900.0f,
            size = 9,
            rating = 4.5f,
            imageRes = R.drawable.s_10
        ),

        )
}