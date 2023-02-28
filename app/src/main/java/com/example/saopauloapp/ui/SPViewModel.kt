package com.example.saopauloapp.ui

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.SPUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SPViewModel: ViewModel() {

    private val _bibState =
        MutableStateFlow(SPUiState(categoryItems = DataSource.getBibliotecaData()))
    val bibState: StateFlow<SPUiState> = _bibState.asStateFlow()

    private val _parState =
        MutableStateFlow(SPUiState(categoryItems = DataSource.getParqueData()))
    val parState: StateFlow<SPUiState> = _parState.asStateFlow()

    private val _resState =
        MutableStateFlow(SPUiState(categoryItems = DataSource.getRestauranteData()))
    val resState: StateFlow<SPUiState> = _resState.asStateFlow()

    private val _shoState =
        MutableStateFlow(SPUiState(categoryItems = DataSource.getShoppingData()))
    val shoState: StateFlow<SPUiState> = _shoState.asStateFlow()



    fun updateCurrentBib(selectedPlace: Local) {
        _bibState.update {
            it.copy(currentPlace = selectedPlace)
        }
    }

    fun navigateToBibDetailsPage() {
            _bibState.update {
                it.copy()
            }


        }

    fun updateCurrentPar(selectedPlace: Local) {
        _parState.update {
            it.copy(currentPlace = selectedPlace)
        }
    }

    fun navigateToParDetailsPage() {
        _parState.update {
            it.copy()
        }

    }

    fun updateCurrentRes(selectedPlace: Local) {
        _resState.update {
            it.copy(currentPlace = selectedPlace)
        }
    }

    fun navigateToResDetailsPage() {
        _resState.update {
            it.copy()
        }


    }

    fun updateCurrentSho(selectedPlace: Local) {
        _shoState.update {
            it.copy(currentPlace = selectedPlace)
        }
    }

    fun navigateToShoDetailsPage() {
        _shoState.update {
            it.copy()
        }


    }
    }
