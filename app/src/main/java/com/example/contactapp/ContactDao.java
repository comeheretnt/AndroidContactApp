package com.example.contactapp;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDao {
    @Query("SELECT *  FROM Contact")
    List<Contact> getAll();

    void insert(Contact... contacts); // truyền được nhiều data


}
