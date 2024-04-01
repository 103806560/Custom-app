package com.example.customApp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity data class represents a single row in the database.
 */
@Entity(tableName = "items")
data class sensorData(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val temperature: String,
    val humidity: String,
    val light: String,
    val sound: String
)
