package com.example.saopauloapp

import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.ui.SPViewModel
import junit.framework.Assert.assertEquals
import org.junit.Test

class SaoPauloViewModelTest {
    private val viewModel = SPViewModel()

    @Test
    fun saoPauloViewModel_currentState(){

        val currentLocalDetailNome = viewModel.uiState.value.currentPlace.nome
        assertEquals(currentLocalDetailNome, "Mocotó")

    }
    @Test
    fun saopauloViewModel_updateState(){

        viewModel.updateCurrentDetail(DataSource.getParqueData()[1])

        val newLocalDetailNome = viewModel.uiState.value.currentPlace.nome

        assertEquals(newLocalDetailNome, "Parque Trianon")
    }

}