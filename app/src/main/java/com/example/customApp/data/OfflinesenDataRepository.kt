package com.example.customApp.data

import androidx.lifecycle.LiveData


class OfflinesenDataRepository(private val senDataDao : senDataDao) : senDataRepository {
    override fun getAllItemsStream(): LiveData<List<sensorData>> = senDataDao.getAllData()

    override fun getItemStream(id: Int): LiveData<sensorData?> = senDataDao.getData(id)

    override suspend fun insertItem(item: sensorData) = senDataDao.insert(item)

    override suspend fun deleteItem(item: sensorData) = senDataDao.delete(item)

    override suspend fun updateItem(item: sensorData) = senDataDao.update(item)
}