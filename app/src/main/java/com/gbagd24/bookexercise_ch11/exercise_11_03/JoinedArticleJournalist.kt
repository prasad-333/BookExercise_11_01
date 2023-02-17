package com.gbagd24.bookexercise_ch11.exercise_11_03

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "joined_article_journalist",
    primaryKeys = ["article_id", "journalist_id"],
    foreignKeys = [ForeignKey(
        entity = Article::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("article_id"),
        onDelete = ForeignKey.CASCADE
    ), ForeignKey(
        entity = Journalist::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("journalist_id"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class JoinedArticleJournalist(
    @ColumnInfo(name = "article_id") val articleId: Long,
    @ColumnInfo(name = "journalist_id") val journalistId: Long
)
