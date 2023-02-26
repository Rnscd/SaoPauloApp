package com.example.saopauloapp.model

data class SPUiState(
    val biblioteca: Local.BibliotecaLocal? = null,
    val parque: Local.ParquesLocal? = null,
    val shopping: Local.ShoppingLocal? = null,
    val restaurante: Local.RestauranteLocal? = null
)