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
import kotlinx.coroutines.launch

class SPViewModel: ViewModel(){

    private val _uiState = MutableStateFlow(SPUiState(categoryItems = categoryItems()))
    val uiState: StateFlow<SPUiState> = _uiState.asStateFlow()

    fun categoryItems(category: String = ""): List<Local> {

        viewModelScope.launch {
            _uiState.value = SPUiState(categoryItems = categoryItems())
        }
        val categoryOptions = mutableListOf<Local>()

        return categoryOptions


    }
}