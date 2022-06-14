package com.rulhouse.testpractice

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TestObject(
    val name: String,
    @PrimaryKey val id: Int? = null
)
