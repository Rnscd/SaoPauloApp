package com.example.saopauloapp

import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.ui.SPViewModel
import junit.framework.Assert.assertEquals
import org.junit.Test

class SaoPauloViewModelTest {
    private val viewModel = SPViewModel()

    @Test
    fun saoPauloViewModel_currentState(){

        val currentLocalDetailNome = viewModel.parState.value.currentPlace.nome
        assertEquals(currentLocalDetailNome, "Parque do Ibirapuera")

    }
    @Test
    fun saopauloViewModel_updateState(){

        viewModel.updateCurrentPar(DataSource.getParqueData()[1])

        val newLocalDetailNome = viewModel.parState.value.currentPlace.nome

        assertEquals(newLocalDetailNome, "Parque Trianon")
    }

}