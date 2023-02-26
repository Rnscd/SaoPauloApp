package com.example.saopauloapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.saopauloapp.data.DataSource
import com.example.saopauloapp.data.DataSource.bibliotecas
import com.example.saopauloapp.data.DataSource.shoppings
import com.example.saopauloapp.model.Local
import com.example.saopauloapp.model.Local.ShoppingLocal

@Composable
fun SaoPauloListScreen(locais: List<Local>) {
    LazyColumn {
        items(locais) { local ->
            LocaisRow(local = local)
        }
    }
}

@Composable
fun LocaisRow(local: Local) {
    Row {
        Image(
            painter = painterResource(id = local.foto),
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = local.nome, fontWeight = FontWeight.Bold)
            Text(text = local.endereço)
            Text(text = stringResource(id = local.sobre))
        }
    }
}
