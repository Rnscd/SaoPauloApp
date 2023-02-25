package com.example.saopauloapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saopauloapp.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun SaoPauloHomeScreen(){
    Scaffold(
        topBar ={ TopAppBar() {
            Text(text = "São Paulo", style =
            TextStyle(color = MaterialTheme.colors.onBackground, fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center ))
        }
        }
    ) {

    }
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 5.dp, vertical = 70.dp)){
        Row() {
            Box(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.restaurant),
                    contentDescription = null,
                    modifier = Modifier.size(170.dp),
                    contentScale = ContentScale.Crop
                )
                Text(text = "Restaurantes", textAlign = TextAlign.Center, style =
                TextStyle(color = Color.White, fontSize = 23.sp, fontWeight = FontWeight.ExtraBold, shadow = Shadow() ))

            }
            Box(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.park),
                    contentDescription = null,
                    modifier = Modifier.size(170.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Parques", textAlign = TextAlign.Center, style =
                TextStyle(color = Color.White, fontSize = 23.sp, fontWeight = FontWeight.ExtraBold, shadow = Shadow() ))

            }
        }
        Row() {
            Box(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.mall),
                    contentDescription = null,
                    modifier = Modifier.size(170.dp),
                    contentScale = ContentScale.Crop
                )
                Text(text = "Shoppings", textAlign = TextAlign.Center, style =
                TextStyle(color = Color.White, fontSize = 23.sp, fontWeight = FontWeight.ExtraBold, shadow = Shadow() ))

            }
            Box(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.libdark),
                    contentDescription = null,
                    modifier = Modifier.size(170.dp),
                    contentScale = ContentScale.Crop
                )
                Text(text = "Bibliotecas", textAlign = TextAlign.Center, style =
                TextStyle(color = Color.White, fontSize = 23.sp, fontWeight = FontWeight.ExtraBold, shadow = Shadow() ))
            }
        }
        /*
        Row() {
            Box() {
                Text(text = "Restaurantes")
                Image(
                    painter = painterResource(id = R.drawable.restaurant),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
            Box() {
                Text(text = "Restaurantes")
                Image(
                    painter = painterResource(id = R.drawable.restaurant),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
                }
         */
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomePreview(){
    SaoPauloHomeScreen()
}