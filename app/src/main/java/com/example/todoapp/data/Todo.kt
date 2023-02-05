package com.example.todoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity // room will now this will be table for db
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    @PrimaryKey val id: Int? = null // room will now it's primary key & have to generate unique
)