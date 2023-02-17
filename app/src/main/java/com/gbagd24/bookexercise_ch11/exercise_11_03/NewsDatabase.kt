package com.gbagd24.bookexercise_ch11.exercise_11_03

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Article::class, Journalist::class, JoinedArticleJournalist::class],
    version = 1
)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
    abstract fun journalistDao(): JournalistDao
    abstract fun joinedArticleJournalistDao(): JoinedArticleJournalistDao
}
