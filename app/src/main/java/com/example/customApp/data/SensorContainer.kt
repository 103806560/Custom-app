package com.example.customApp.data

import android.content.Context


interface SensorContainer {
    val senDataRepository : senDataRepository
}

class SensorDataContainer(private val context: Context) : SensorContainer {
    override val senDataRepository : senDataRepository by lazy {
        OfflinesenDataRepository(sensorDataDatabase.getDatabase(context).sensorDataDao())
    }
}