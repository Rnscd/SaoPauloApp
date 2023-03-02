package com.example.saopauloapp.data

import com.example.saopauloapp.R
import com.example.saopauloapp.model.Local


object DataSource {

    fun getRestauranteData(): List<Local> {
        return listOf<Local>(
            Local(
                "Mocotó",
                R.drawable.mocoto,
                "Av. Nossa Sra do Loreto, 1100 – Vila Medeiros",
                R.string.smocoto
            ),
            Local(
                "A casa do porco",
                R.drawable.acasadoporco,
                "Av. São Luiz 140, 4º andar – República",
                R.string.scasadoporco
            ),
            Local(
                "Figueira Rubaiyat",
                R.drawable.figueirarubaiyat,
                " Rua Haddock Lobo, 1738 – Jardim Paulista",
                R.string.safiguieira
            ),
            Local(
                "Seu Oswaldo",
                R.drawable.seuoswaldotwo,
                "Rua Bom Pastor, 1659 – Ipiranga",
                R.string.sseuoswaldo
            ),
            Local(
                "Tandoor",
                R.drawable.tandoortwo,
                "Rua Mário Amaral, 559 – Paraíso",
                R.string.standor
            )
        )
    }

    fun getParqueData(): List<Local> {
        return listOf<Local>(
            Local(
                "Parque do Ibirapuera",
                R.drawable.ibirapuera,
                "Av. Pedro Álvares Cabral – Vila Mariana",
                R.string.spqibirapuera
            ),
            Local(
                "Parque Trianon",
                R.drawable.trianon,
                "Rua Peixoto Gomide, 949 – Cerqueira César",
                R.string.spqtrianon
            ),
            Local(
                "Parque Augusta Prefeito Bruno Covas",
                R.drawable.augustaprefeitobrunocovas,
                "Rua Peixoto Gomide, 949 – Cerqueira César",
                R.string.spqaugusta
            ),
            Local(
                "Parque da Água Branca",
                R.drawable.aguabranca,
                "Av. Francisco Matarazzo, 455 – Água Branca",
                R.string.spqagua
            ),
            Local(
                "Parque Villa Lobos",
                R.drawable.parqvillalobos,
                "Av. Prof. Fonseca Rodrigues, 2001 – Alto de Pinheiros",
                R.string.spqvilla
            )

        )
    }

        fun getShoppingData(): List<Local> {
            return listOf<Local>(
                Local(
                    "Bourbon Shopping São Paulo",
                    R.drawable.bourbon,
                    "Rua Palestra Itália, 500, Perdizes",
                    R.string.sshbourbon
                ),
                Local(
                    "Morumbi Shopping",
                    R.drawable.morumbi,
                    "Av. Roque Petroni Júnior, 1089, Jardim das Acácias",
                    R.string.sshmorumbi
                ),
                Local(
                    "Shopping Iguatemi",
                    R.drawable.iguatemi,
                    "Av. Brig. Faria Lima, 2232, Jd. Paulistano",
                    R.string.sshiguatemi
                ),
                Local(
                    "Shopping Eldorado",
                    R.drawable.eldorado,
                    "Av. Rebouças, 3970, Pinheiros",
                    R.string.ssheldorado
                ),
                Local(
                    "Shopping Center Norte",
                    R.drawable.centernorte,
                    "Travessa Casalbuono, 120, Vila Guilherme",
                    R.string.sshcenter
                )

            )
        }
            fun getBibliotecaData(): List<Local> {
                return listOf<Local>(
                    Local(
                        "Biblioteca de São Paulo",
                        R.drawable.desaopaulo,
                        "Av. Cruzeiro do Sul, 2630 - Santana",
                        R.string.sbibsaopaulo
                    ),
                    Local(
                        "Biblioteca do Parque Villa-Lobos",
                        R.drawable.bibdoparquevillalobos,
                        "Av. Prof. Fonseca Rodrigues, 2001 - Alto de Pinheiros",
                        R.string.sbibvilla
                    ),
                    Local(
                        "Biblioteca Alceu Amoroso Lima",
                        R.drawable.bibalceuamorosolima,
                        " Rua Henrique Schaumann, 777 - Pinheiros",
                        R.string.safiguieira
                    ),
                    Local(
                        "Biblioteca Mário de Andrade",
                        R.drawable.mariodeandrade,
                        " Rua da Consolação, 94, Consolação",
                        R.string.sseuoswaldo
                    ),
                    Local(
                        "Bibliotecas do Centro Cultural de São Paulo",
                        R.drawable.bibdocentroculturaldesaopaulo,
                        "Rua Vergueiro, 1000 - Paraíso",
                        R.string.standor
                    )

                )
            }
}