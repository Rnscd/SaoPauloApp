package com.example.saopauloapp.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saopauloapp.R
import com.example.saopauloapp.model.Local
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun SaoPauloHomeScreen(
    navController: NavHostController
) {

    Scaffold(
        topBar ={ TopAppBar(backgroundColor = MaterialTheme.colors.surface) {
            SaoPauloTopBar(titulo = "São Paulo")
        }
        }
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 5.dp, vertical = 10.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Box(
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .clickable(onClick = { navController.navigate(Dest.LISTRES.name) }),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.figueirarubaiyat),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()

                )
                Text(
                    text = "Restaurantes", textAlign = TextAlign.Center, style =
                    TextStyle(
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                        shadow = Shadow()
                    )
                )

            }
            Box(
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .clickable(onClick = { navController.navigate(Dest.LISTPAR.name) }),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.parqvillalobos),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()


                )
                Text(
                    text = "Parques", textAlign = TextAlign.Center, style =
                    TextStyle(
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                        shadow = Shadow()
                    )
                )

            }

            Box(
                modifier = Modifier
                    .padding( vertical = 15.dp)
                    .clickable(onClick = { navController.navigate(Dest.LISTSHO.name) }),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homesho),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()

                )
                Text(
                    text = "Shoppings", textAlign = TextAlign.Center, style =
                    TextStyle(
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                        shadow = Shadow()
                    )
                )

            }
            Box(
                modifier = Modifier
                    .padding( vertical = 15.dp)
                    .clickable(onClick = { navController.navigate(Dest.LISTBIB.name) }),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mariodeandrade),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "Bibliotecas", textAlign = TextAlign.Center, style =
                    TextStyle(
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                        shadow = Shadow()
                    )
                )
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
}

