package com.example.saopauloapp.ui

import androidx.lifecycle.ViewModel
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.SPUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SPViewModel: ViewModel() {



    private val _uiState =
        MutableStateFlow(SPUiState(categoryItems = DataSource.getRestauranteData(), currentPlace = DataSource.getRestauranteData()[0]))
    val uiState: StateFlow<SPUiState> = _uiState.asStateFlow()

    fun uodateCurrentList(currentCategory: List<Local>){
        _uiState.update {
            it.copy(categoryItems = currentCategory)
        }
    }

    fun updateCurrentDetail(selectedPlace: Local) {
        _uiState.update {
            it.copy(currentPlace = selectedPlace)
        }
    }
}
