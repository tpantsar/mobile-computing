package com.codemave.mobilecomputing.data.entity

import androidx.room.*
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "profile",
    indices = [
        Index("id", unique = true),
        Index("profile_category_id")
    ],
    foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = ["id"],
            childColumns = ["profile_category_id"],
            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class Profile(
    // @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val paymentId: Long = 0,
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "age") val age: Int
)