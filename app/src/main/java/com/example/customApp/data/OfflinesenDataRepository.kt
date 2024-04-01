package com.example.customApp.data

import kotlinx.coroutines.flow.Flow

class OfflinesenDataRepository(private val senDataDao : senDataDao) : senDataRepository {
    override fun getAllItemsStream(): Flow<List<sensorData>> = senDataDao.getAllData()

    override fun getItemStream(id: Int): Flow<sensorData?> = senDataDao.getData(id)

    override suspend fun insertItem(item: sensorData) = senDataDao.insert(item)

    override suspend fun deleteItem(item: sensorData) = senDataDao.delete(item)

    override suspend fun updateItem(item: sensorData) = senDataDao.update(item)
}