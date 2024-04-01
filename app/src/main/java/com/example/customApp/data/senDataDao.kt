package com.example.customApp.data
import androidx.room.Dao
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Insert
import androidx.lifecycle.LiveData
@Dao
interface senDataDao {

    @Query("SELECT * from items ORDER BY id ASC")
    fun getAllData(): LiveData<List<sensorData>>

    @Query("SELECT * from items WHERE id = :id")
    fun getData(id: Int): LiveData<sensorData?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(sensorData: sensorData)

    @Update
    suspend fun  update(sensorData: sensorData)

    @Delete
    suspend fun delete(sensorData: sensorData)
}