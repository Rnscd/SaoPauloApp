package com.example.saopauloapp.ui

import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.saopauloapp.ui.theme.SaoPauloAppTheme

enum class Dest {
    HOME, LISTSC, DETAILSC
}

@Composable
fun SaoPauloApp(navController: NavHostController = rememberNavController()){

    val viewModel: SPViewModel = viewModel()

    SaoPauloAppTheme() {

        NavHost(navController = navController, startDestination = Dest.HOME.name) {
            composable(Dest.HOME.name) {
                SaoPauloHomeScreen(navController = navController, viewModel = viewModel)
            }

            composable(Dest.LISTSC.name) {
                SaoPauloListScreen(
                    tipo = viewModel.uiState.collectAsState().value.categoryItems,
                    titulo = viewModel.uiState.collectAsState().value.categoryItems[0].categoria,
                    onLocationClicked = {
                        viewModel.updateCurrentDetail(it)
                        navController.navigate(Dest.DETAILSC.name)
                    },
                    onBackClicked = { navController.navigateUp() },

                    )
            }
            composable(Dest.DETAILSC.name) {
                SaoPauloDetailsScreen(
                    selecinado = viewModel.uiState.collectAsState().value.currentPlace,
                    titulo = viewModel.uiState.collectAsState().value.currentPlace.nome,
                    onBackClicked = { navController.navigateUp() }
                )
            }
        }
    }
}







