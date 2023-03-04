package com.example.saopauloapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.saopauloapp.R

data class Local(
    val categoria: String,
     val nome: String,
    @DrawableRes  val foto: Int,
     val endereço: String,
    @StringRes open val sobre: Int
)


