package com.example.saopauloapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SaoPauloTopBar(backButton: Boolean = false, titulo: String, onBackClicked: () -> Unit = {}){

    if(backButton) {
        IconButton(onClick = onBackClicked) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "voltar")
        }
    } else{
        Spacer(modifier = Modifier.width(25.dp))
    }
        Text(
            text = titulo, style =
            TextStyle(
                color = MaterialTheme.colors.onBackground,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ), modifier = Modifier.padding(start = 5.dp)

        )


    }

