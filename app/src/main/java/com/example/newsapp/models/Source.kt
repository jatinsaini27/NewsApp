package com.example.newsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Source(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val name: String
)