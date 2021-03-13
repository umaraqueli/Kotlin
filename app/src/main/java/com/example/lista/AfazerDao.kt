package com.example.lista

import androidx.room.*

@Dao
interface AfazerDao {

    @Query("SELECT * from Afazer where id = :id")
    fun get(id: Long): Afazer
    @Query("SELECT * from Afazer")
    fun getAll(): List<Afazer>
    @Insert
    fun insert(afazer:Afazer) : Long
    @Delete
    fun delete(afazer: Afazer)
    @Update
    fun update(afazer: Afazer)
    



}
