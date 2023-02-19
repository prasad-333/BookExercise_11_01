package com.gbagd24.bookexercise_ch11.exercise_12_03

import android.content.res.AssetManager

class AssetFileManager(private val assetManager: AssetManager) {
    fun getMyAppFileInputStream() = assetManager.open("my-app-file.txt")
}
