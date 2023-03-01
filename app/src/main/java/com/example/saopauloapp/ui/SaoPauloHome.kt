package com.example.saopauloapp.ui

import android.provider.ContactsContract.Data
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.SPUiState
import com.example.saopauloapp.ui.theme.SaoPauloAppTheme


enum class Dest {
    HOME, LISTBIB, DETAILSBIB, LISTPAR, DETAILSPAR,LISTSHO, DETAILSSHO, LISTRES, DETAILSRES
}


@Composable
fun SaoPauloApp(){

    val navController = rememberNavController()

    val viewModel: SPViewModel = viewModel()
    val bibState by viewModel.bibState.collectAsState()

    SaoPauloAppTheme() {


        NavHost(navController = navController, startDestination = Dest.HOME.name) {
            composable(Dest.HOME.name) {
                SaoPauloHomeScreen(navController = navController)
            }

            composable(Dest.LISTBIB.name) {
                SaoPauloListScreen(
                    tipo = DataSource.getBibliotecaData(),
                    titulo = "Bibliotecas",
                    onLocationClicked = {
                        viewModel.updateCurrentBib(it)
                        navController.navigate(Dest.DETAILSBIB.name)
                    },
                    onBackClicked = { navController.navigateUp() },
                )
            }
            composable(Dest.LISTPAR.name) {
                SaoPauloListScreen(
                    tipo = DataSource.getParqueData(),
                    titulo = "Parques",
                    onLocationClicked = {
                        viewModel.updateCurrentPar(it)
                        navController.navigate(Dest.DETAILSPAR.name)
                    },
                    onBackClicked = { navController.navigateUp() },

                    )
            }
            composable(Dest.LISTRES.name) {
                SaoPauloListScreen(
                    tipo = DataSource.getRestauranteData(),
                    titulo = "Restaurantes",
                    onLocationClicked = {
                        viewModel.updateCurrentRes(it)
                        navController.navigate(Dest.DETAILSRES.name)
                    },
                    onBackClicked = { navController.navigateUp() },

                    )
            }
            composable(Dest.LISTSHO.name) {
                SaoPauloListScreen(
                    tipo = DataSource.getShoppingData(),
                    titulo = "Shoppings",
                    onLocationClicked = {
                        viewModel.updateCurrentSho(it)
                        navController.navigate(Dest.DETAILSSHO.name)
                    },
                    onBackClicked = { navController.navigateUp() },

                    )
            }


            composable(Dest.DETAILSRES.name) {
                SaoPauloDetailsScreen(
                    selecinado = viewModel.resState.collectAsState().value.currentPlace,
                    titulo = viewModel.resState.collectAsState().value.currentPlace.nome,
                    onBackClicked = { navController.navigateUp() }
                )
            }
            composable(Dest.DETAILSPAR.name) {
                SaoPauloDetailsScreen(
                    selecinado = viewModel.parState.collectAsState().value.currentPlace,
                    titulo = viewModel.parState.collectAsState().value.currentPlace.nome,
                    onBackClicked = { navController.navigateUp() }
                )
            }
            composable(Dest.DETAILSSHO.name) {
                SaoPauloDetailsScreen(
                    selecinado = viewModel.shoState.collectAsState().value.currentPlace,
                    titulo = viewModel.shoState.collectAsState().value.currentPlace.nome,
                    onBackClicked = { navController.navigateUp() }
                )
            }
            composable(Dest.DETAILSBIB.name) {
                SaoPauloDetailsScreen(
                    selecinado = bibState.currentPlace,
                    titulo = bibState.currentPlace.nome,
                    onBackClicked = { navController.navigateUp() }
                )
            }
        }
    }
}







