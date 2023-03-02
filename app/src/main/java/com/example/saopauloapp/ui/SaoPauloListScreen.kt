package com.example.saopauloapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.ui.theme.SaoPauloAppTheme

@Composable
fun SaoPauloListScreen(
    tipo: List<Local>,
    titulo: String = "Sao Paulo",
    onLocationClicked: (Local) -> Unit = {},
    onBackClicked: () -> Unit = {},
){

    Scaffold(
        topBar ={ TopAppBar(backgroundColor = MaterialTheme.colors.surface) {
            SaoPauloTopBar(backButton = true  , titulo = titulo, onBackClicked = onBackClicked)
        }
        }
    ) {

        LazyColumn() {
            items(tipo) { places ->
                LocaisRow(tipos = places, onLocationClicked ={ onLocationClicked(places)} )
            }
        }
    }
}

@Composable
fun LocaisRow(tipos: Local, onLocationClicked: () -> Unit){

    Card(elevation = 4.dp, modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .clickable(onClick = onLocationClicked)
        ) {


        Row(modifier = Modifier.padding(horizontal = 2.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = tipos.foto), contentDescription = null,
                modifier = Modifier.size(170.dp), contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = tipos.nome, style = MaterialTheme.typography.body2)
        }
    }
}

