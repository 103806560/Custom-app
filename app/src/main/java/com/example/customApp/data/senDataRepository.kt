package com.example.customApp.data
import kotlinx.coroutines.flow.Flow

/**
 * Repository that provides insert, update, delete, and retrieve of [Item] from a given data source.
 */
interface senDataRepository {
    /**
     * Retrieve all the items from the given data source.
     */
    fun getAllItemsStream(): Flow<List<sensorData>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getItemStream(id: Int): Flow<sensorData?>

    /**
     * Insert item in the data source
     */
    suspend fun insertItem(item: sensorData)

    /**
     * Delete item from the data source
     */
    suspend fun deleteItem(item: sensorData)

    /**
     * Update item in the data source
     */
    suspend fun updateItem(item: sensorData)
}