package com.example.saopauloapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.data.DataSource.bibliotecas
import com.example.saopauloapp.data.DataSource.shoppings
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.Local.ShoppingLocal
import com.example.saopauloapp.model.SPUiState

@Composable
fun SaoPauloDetailsScreen(selecinado: Local, titulo: String = "Sao Paulo", onBackClicked: () -> Unit = {}){

    Scaffold(
        topBar ={ TopAppBar() {
            IconButton(onClick = onBackClicked) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "voltar")
            }
            Text(text = titulo, style =
            TextStyle(color = MaterialTheme.colors.onBackground, fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center )
            )
        }
        }
    ) {
        LazyColumn(){
            item {
                DetailColumn(detail = selecinado)
            }
        }
    }
}

@Composable
fun DetailColumn(detail: Local ){

    Column(modifier = Modifier.padding(horizontal = 2.dp)) {
            Image(
                painter = painterResource(id = detail.foto), contentDescription = "",
                modifier = Modifier.size(width = 350.dp, height = 280.dp), contentScale = ContentScale.Fit,
                alignment = Alignment.Center
            )

            Text(text = "Endereço:", fontWeight = FontWeight.Bold, textAlign = TextAlign.Left)


            Text(text = detail.endereço, textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Sobre:", fontWeight = FontWeight.Bold , textAlign = TextAlign.Start)


            Text(text = stringResource(id = detail.sobre), textAlign = TextAlign.Center)
            
        }
    }
