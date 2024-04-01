package com.example.customApp.data
import androidx.room.Database
import androidx.room.RoomDatabase
import android.content.Context
import androidx.room.Room


@Database(entities = [sensorData::class], version = 1, exportSchema = false)
abstract class sensorDataDatabase : RoomDatabase() {
    abstract fun sensorDataDao(): senDataDao

    companion object{
        @Volatile
        private var Instance: sensorDataDatabase? = null

        fun getDatabase(context: Context) : sensorDataDatabase{
            return Instance ?: synchronized(this){
                Room.databaseBuilder(context, sensorDataDatabase::class.java, "sensor_data_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}
