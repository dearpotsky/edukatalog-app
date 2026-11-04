package com.example.edukatalogapp

import java.io.Serializable

data class Course(
    val title: String,
    val category: String,
    val description: String,
    val imageResId: Int
) : Serializable
