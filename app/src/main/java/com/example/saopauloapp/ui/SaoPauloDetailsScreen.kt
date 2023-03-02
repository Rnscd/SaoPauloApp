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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.SPUiState

@Composable
fun SaoPauloDetailsScreen(selecinado: Local, titulo: String = "Sao Paulo", onBackClicked: () -> Unit = {}){

    Scaffold(
        topBar ={ TopAppBar(backgroundColor = MaterialTheme.colors.surface) {
            SaoPauloTopBar(backButton = true, titulo = titulo, onBackClicked = onBackClicked)
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

    Column(modifier = Modifier
        .fillMaxHeight(), ) {

        Card(elevation = 1.dp, modifier = Modifier.fillMaxHeight()) {

            Column(modifier = Modifier.fillMaxHeight()) {

                Image(
                    painter = painterResource(id = detail.foto),
                    contentDescription = "",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Fit,
                    alignment = Alignment.Center
                )

                Text(text = detail.endereço, textAlign = TextAlign.Center,  modifier = Modifier.padding(start = 6.dp), style = MaterialTheme.typography.h4)
            }
        }

            Spacer(modifier = Modifier.height(10.dp))
        Card(elevation = 1.dp) {

            Text(text = stringResource(id = detail.sobre),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(6.dp),
                style = MaterialTheme.typography.body2
            )
        }
            
        }
    }

@Preview
@Composable
fun DetailsPreview(){
    SaoPauloDetailsScreen(DataSource.getRestauranteData()[1])

}
