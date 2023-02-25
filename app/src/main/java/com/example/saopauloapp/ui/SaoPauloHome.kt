package com.example.saopauloapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.saopauloapp.ui.theme.SaoPauloAppTheme


@Composable
fun SaoPauloApp(){
    SaoPauloHomeScreen()
}

@Preview
@Composable
fun SaoPauloPreview(){
    SaoPauloAppTheme {
        SaoPauloApp()
    }
}



