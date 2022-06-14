package com.rulhouse.testpractice

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TestObject::class],
    version = 1
)
abstract class TestDataBase : RoomDatabase() {

    abstract val testObjectDao: TestObjectDao

    companion object {
        const val DATABASE_NAME = "test_object_db"
    }
}