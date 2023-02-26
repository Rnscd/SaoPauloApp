package com.example.saopauloapp.data

import com.example.saopauloapp.R
import com.example.saopauloapp.model.Local.BibliotecaLocal
import com.example.saopauloapp.model.Local.RestauranteLocal
import com.example.saopauloapp.model.Local.ParquesLocal
import com.example.saopauloapp.model.Local.ShoppingLocal


object DataSource {
    val restaurantes = listOf<RestauranteLocal>(
        RestauranteLocal("Mocotó", R.drawable.restaurant, "Av. Nossa Sra do Loreto, 1100 – Vila Medeiros", R.string.smocoto),
        RestauranteLocal("A casa do porco", R.drawable.restaurant, "Av. São Luiz 140, 4º andar – República", R.string.scasadoporco),
        RestauranteLocal("Figueira Rubaiyat", R.drawable.restaurant, " Rua Haddock Lobo, 1738 – Jardim Paulista", R.string.safiguieira),
        RestauranteLocal("Seu Oswaldo", R.drawable.restaurant, "Rua Bom Pastor, 1659 – Ipiranga", R.string.sseuoswaldo),
        RestauranteLocal("Tandoor", R.drawable.restaurant, "Rua Mário Amaral, 559 – Paraíso", R.string.standor)

    )

    val parques = listOf<ParquesLocal>(
        ParquesLocal("Parque do Ibirapuera", R.drawable.ibirapuera, "Av. Pedro Álvares Cabral – Vila Mariana", R.string.spqibirapuera),
        ParquesLocal("Parque Trianon", R.drawable.trianon, "Rua Peixoto Gomide, 949 – Cerqueira César", R.string.spqtrianon),
        ParquesLocal("Parque Augusta Prefeito Bruno Covas", R.drawable.augustaprefeitobrunocovas, "Rua Peixoto Gomide, 949 – Cerqueira César", R.string.spqaugusta),
        ParquesLocal("Parque da Água Branca", R.drawable.aguabranca, "Av. Francisco Matarazzo, 455 – Água Branca", R.string.spqagua),
        ParquesLocal("Parque Villa Lobos", R.drawable.villalobos, "Av. Prof. Fonseca Rodrigues, 2001 – Alto de Pinheiros", R.string.spqvilla)

    )

    val shoppings = listOf<ShoppingLocal>(
        ShoppingLocal("Bourbon Shopping São Paulo", R.drawable.bourbon, "Rua Palestra Itália, 500, Perdizes", R.string.sshbourbon),
        ShoppingLocal("Morumbi Shopping", R.drawable.morumbi, "Av. Roque Petroni Júnior, 1089, Jardim das Acácias", R.string.sshmorumbi),
        ShoppingLocal("Shopping Iguatemi", R.drawable.iguatemi, "Av. Brig. Faria Lima, 2232, Jd. Paulistano", R.string.sshiguatemi),
        ShoppingLocal("Shopping Eldorado", R.drawable.eldorado, "Av. Rebouças, 3970, Pinheiros", R.string.ssheldorado),
        ShoppingLocal("Shopping Center Norte", R.drawable.centernorte, "Travessa Casalbuono, 120, Vila Guilherme", R.string.sshcenter)

    )

    val bibliotecas = listOf<BibliotecaLocal>(
        BibliotecaLocal("Biblioteca de São Paulo", R.drawable.desaopaulo, "Av. Cruzeiro do Sul, 2630 - Santana", R.string.smocoto),
        BibliotecaLocal("Biblioteca do Parque Villa-Lobos", R.drawable.bibdoparquevillalobos, "Av. Prof. Fonseca Rodrigues, 2001 - Alto de Pinheiros", R.string.scasadoporco),
        BibliotecaLocal("Biblioteca Alceu Amoroso Lima", R.drawable.bibalceuamorosolima, "ua Henrique Schaumann, 777 - Pinheiros", R.string.safiguieira),
        BibliotecaLocal("Biblioteca Mário de Andrade", R.drawable.mariodeandrade, " Rua da Consolação, 94, Consolação", R.string.sseuoswaldo),
        BibliotecaLocal("Bibliotecas do Centro Cultural de São Paulo", R.drawable.bibdocentroculturaldesaopaulo, "Rua Vergueiro, 1000 - Paraíso", R.string.standor)

    )

}