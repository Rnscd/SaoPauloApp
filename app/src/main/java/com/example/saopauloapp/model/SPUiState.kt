package com.example.saopauloapp.model

import com.example.saopauloapp.data.DataSource.shoppings

data class SPUiState(

    val categoryItems: List<Local> = listOf(),
    val selectedPlace: Local = shoppings[0]/*
    val biblioteca: Local.BibliotecaLocal? = null,
    val parque: Local.ParquesLocal? = null,
    val shopping: Local.ShoppingLocal? = null,
    val restaurante: Local.RestauranteLocal? = null

     */
)