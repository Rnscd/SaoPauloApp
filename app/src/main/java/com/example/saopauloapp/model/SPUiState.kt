package com.example.saopauloapp.model

import com.example.saopauloapp.data.DataSource


data class SPUiState(

    val categoryItems: List<Local> = listOf(),
    val currentPlace: Local = DataSource.getBibliotecaData()[0]

)