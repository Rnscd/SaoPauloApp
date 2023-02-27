package com.example.saopauloapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.saopauloapp.data.DataSource.bibliotecas
import com.example.saopauloapp.data.DataSource.restaurantes
import com.example.saopauloapp.data.DataSource.shoppings
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.SPUiState
import com.example.saopauloapp.ui.theme.SaoPauloAppTheme


enum class Dest {
    HOME, LIST, DETAILS
}


@Composable
fun SaoPauloApp(){
 //   SaoPauloListScreen(tipo = bibliotecas)
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Dest.HOME.name) {
        composable(Dest.HOME.name){
            SaoPauloHomeScreen(onCategoryClicked = { navController.navigate(Dest.LIST.name) })
        }
        composable(Dest.LIST.name){
            SaoPauloListScreen(tipo = restaurantes,
                titulo = "Shoppings",
                onLocationClicked = {navController.navigate(Dest.DETAILS.name)},
                onBackClicked = {navController.navigateUp()}
                )
        }
        composable(Dest.DETAILS.name){
            SaoPauloDetailsScreen(
                selecinado = shoppings[1],
                titulo = shoppings[1].nome,
                onBackClicked = {navController.navigateUp()}
            )
        }
    }

}




