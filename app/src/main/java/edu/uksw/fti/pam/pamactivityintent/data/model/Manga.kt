package edu.uksw.fti.pam.pamactivityintent.data.model

data class Manga(
    val id: Int,
    val title: String,
    val rating: String,
    val description: String,
    val mangaImageId: Int =0
)