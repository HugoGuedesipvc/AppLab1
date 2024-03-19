package com.example.appl1.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.appl1.data.entities.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM Notes")
    fun getAllNotes(): LiveData<List<Note>>

    @Insert
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)
}