package com.example.saopauloapp.model

import com.example.saopauloapp.R

sealed class Local(
    open val nome: String,
    open val foto: Int,
    open val endereço: String,
    open val sobre: Int
) {
    data class RestauranteLocal(
        override val nome: String,
        override val foto: Int,
        override val endereço: String,
        override val sobre: Int
    ) :Local(nome, foto, endereço, sobre)

    data class ParquesLocal(
        override val nome: String,
        override val foto: Int,
        override val endereço: String,
        override val sobre: Int
    ) :Local(nome, foto, endereço, sobre)

    data class ShoppingLocal(
        override val nome: String,
        override val foto: Int,
        override val endereço: String,
        override val sobre: Int
    ) :Local(nome, foto, endereço, sobre)

    data class BibliotecaLocal(
        override val nome: String,
        override val foto: Int,
        override val endereço: String,
        override val sobre: Int
    ) :Local(nome, foto, endereço, sobre)



}















/*
val restaurantes = listOf<Local>(
    Local("Mocotó", R.drawable.restaurant, "Av. Nossa Sra do Loreto, 1100 – Vila Medeiros", R.string.smocoto),
    Local("A casa do porco", R.drawable.restaurant, "Av. São Luiz 140, 4º andar – República", R.string.scasadoporco),
    Local("Figueira Rubaiyat", R.drawable.restaurant, " Rua Haddock Lobo, 1738 – Jardim Paulista", R.string.safiguieira),
    Local("Seu Oswaldo", R.drawable.restaurant, "Rua Bom Pastor, 1659 – Ipiranga", R.string.sseuoswaldo),
    Local("Tandoor", R.drawable.restaurant, "Rua Mário Amaral, 559 – Paraíso", R.string.standor)

)

val parques = listOf<Local>(
    Local("Parque do Ibirapuera", R.drawable.ibirapuera, "Av. Pedro Álvares Cabral – Vila Mariana", R.string.spqibirapuera),
    Local("Parque Trianon", R.drawable.trianon, "Rua Peixoto Gomide, 949 – Cerqueira César", R.string.spqtrianon),
    Local("Parque Augusta Prefeito Bruno Covas", R.drawable.augustaprefeitobrunocovas, "Rua Peixoto Gomide, 949 – Cerqueira César", R.string.spqaugusta),
    Local("Parque da Água Branca", R.drawable.aguabranca, "Av. Francisco Matarazzo, 455 – Água Branca", R.string.spqagua),
    Local("Parque Villa Lobos", R.drawable.villalobos, "Av. Prof. Fonseca Rodrigues, 2001 – Alto de Pinheiros", R.string.spqvilla)

)

val shoppings = listOf<Local>(
    Local("Bourbon Shopping São Paulo", R.drawable.bourbon, "Rua Palestra Itália, 500, Perdizes", R.string.sshbourbon),
    Local("Morumbi Shopping", R.drawable.morumbi, "Av. Roque Petroni Júnior, 1089, Jardim das Acácias", R.string.sshmorumbi),
    Local("Shopping Iguatemi", R.drawable.iguatemi, "Av. Brig. Faria Lima, 2232, Jd. Paulistano", R.string.sshiguatemi),
    Local("Shopping Eldorado", R.drawable.eldorado, "Av. Rebouças, 3970, Pinheiros", R.string.ssheldorado),
    Local("Shopping Center Norte", R.drawable.centernorte, "Travessa Casalbuono, 120, Vila Guilherme", R.string.sshcenter)

)

val bibliotecas = listOf<Local>(
    Local("Biblioteca de São Paulo", R.drawable.desaopaulo, "Av. Cruzeiro do Sul, 2630 - Santana", R.string.smocoto),
    Local("Biblioteca do Parque Villa-Lobos", R.drawable.bibdoparquevillalobos, "Av. Prof. Fonseca Rodrigues, 2001 - Alto de Pinheiros", R.string.scasadoporco),
    Local("Biblioteca Alceu Amoroso Lima", R.drawable.bibalceuamorosolima, "ua Henrique Schaumann, 777 - Pinheiros", R.string.safiguieira),
    Local("Biblioteca Mário de Andrade", R.drawable.mariodeandrade, " Rua da Consolação, 94, Consolação", R.string.sseuoswaldo),
    Local("Bibliotecas do Centro Cultural de São Paulo", R.drawable.bibdocentroculturaldesaopaulo, "Rua Vergueiro, 1000 - Paraíso", R.string.standor)

)

 */



