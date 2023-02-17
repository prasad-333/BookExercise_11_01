package com.gbagd24.bookexercise_ch11.exercise_11_03

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface JoinedArticleJournalistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertArticleJournalist(joinedArticleJournalist: JoinedArticleJournalist)
    @Delete
    fun deleteArticleJournalist(joinedArticleJournalist: JoinedArticleJournalist)

}
