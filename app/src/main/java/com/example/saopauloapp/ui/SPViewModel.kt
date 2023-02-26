package com.example.saopauloapp.ui

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import com.example.saopauloapp.model.SPUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SPViewModel: ViewModel(){

    private val _uiState = MutableStateFlow(SPUiState())
    val uiState: StateFlow<SPUiState> = _uiState.asStateFlow()

}