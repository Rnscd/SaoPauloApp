package com.example.saopauloapp.ui

import android.provider.ContactsContract.Data
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
    HOME, LISTBIB, DETAILSBIB, LISTPAR, DETAILSPAR,LISTSHO, DETAILSSHO,LISTRES, DETAILSRES
}


@Composable
fun SaoPauloApp(){
 //   SaoPauloListScreen(tipo = bibliotecas)
    val navController = rememberNavController()

    val viewModel: SPViewModel = viewModel()
    val bibState by viewModel.bibState.collectAsState()

    NavHost(navController = navController, startDestination = Dest.HOME.name) {
        composable(Dest.HOME.name){
            SaoPauloHomeScreen(navController = navController)
        }

        composable(Dest.LISTBIB.name){
            SaoPauloListScreen(tipo = DataSource.getBibliotecaData(),
                titulo = "Bibliotecas",
                onLocationClicked = {navController.navigate(Dest.DETAILSBIB.name)},
                onBackClicked = {navController.navigateUp()},
                onItemClicked = {
                    viewModel.navigateToBibDetailsPage()
                                },
                places = bibState.currentPlace,
                viewModel = viewModel
                )
        }
        composable(Dest.LISTPAR.name){
            SaoPauloListScreen(tipo = DataSource.getParqueData(),
                titulo = "Parques",
                viewModel = viewModel,
                onLocationClicked = {navController.navigate(Dest.DETAILSPAR.name)},
                onBackClicked = {navController.navigateUp()},
                onItemClicked = {
                    viewModel.updateCurrentPar(it)
                    },
                places = bibState.currentPlace
            )
        }
        composable(Dest.LISTRES.name){
            SaoPauloListScreen(tipo = DataSource.getRestauranteData(),
                titulo = "Restaurantes",
                onLocationClicked = {navController.navigate(Dest.DETAILSRES.name)},
                onBackClicked = {navController.navigateUp()},
                onItemClicked = {
                    viewModel.updateCurrentRes(it)
                  },
                places = bibState.currentPlace,
                viewModel = viewModel
            )
        }
        composable(Dest.LISTSHO.name){
            SaoPauloListScreen(tipo = DataSource.getShoppingData(),
                titulo = "Shoppings",
                onLocationClicked = {navController.navigate(Dest.DETAILSBIB.name)},
                onBackClicked = {navController.navigateUp()},
                onItemClicked = {
                    viewModel.updateCurrentSho(it)
                    },
                places = bibState.currentPlace,
                viewModel = viewModel
            )
        }








        composable(Dest.DETAILSRES.name){
            viewModel.navigateToResDetailsPage()
            SaoPauloDetailsScreen(
                selecinado = viewModel.resState.collectAsState().value.currentPlace,
                titulo = viewModel.resState.collectAsState().value.currentPlace.nome,
                onBackClicked = {navController.navigateUp()}
            )
        }
        composable(Dest.DETAILSPAR.name){
            viewModel.navigateToParDetailsPage()
            SaoPauloDetailsScreen(
                selecinado = viewModel.parState.collectAsState().value.currentPlace,
                titulo = viewModel.parState.collectAsState().value.currentPlace.nome,
                onBackClicked = {navController.navigateUp()}
            )
        }
        composable(Dest.DETAILSSHO.name){
            viewModel.navigateToShoDetailsPage()
            SaoPauloDetailsScreen(
                selecinado = viewModel.shoState.collectAsState().value.currentPlace,
                titulo = viewModel.shoState.collectAsState().value.currentPlace.nome,
                onBackClicked = {navController.navigateUp()}
            )
        }
        composable(Dest.DETAILSBIB.name){
            viewModel.navigateToBibDetailsPage()
            SaoPauloDetailsScreen(
                selecinado = bibState.currentPlace,
                titulo = bibState.currentPlace.nome,
                onBackClicked = {navController.navigateUp()}
            )
        }
    }
}

/*
composable(Dest.DETAILRES.name){
            viewModel.navigateToResDetailsPage()
            SaoPauloDetailsScreen(
                selecinado = DataSource.getShoppingData()[1],
                titulo = DataSource.getShoppingData()[1].nome,
                onBackClicked = {navController.navigateUp()}
            )
        }
    }
 */






