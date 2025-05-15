package br.senai.sp.jandira.rick_morty.model

import android.media.Image

data class Character(
    var id: Int = 0,
    var name: String = "",
    var species: String = "",
    var status: String = "",
    var image: String = ""
)
