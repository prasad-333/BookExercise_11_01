package com.gbagd24.bookexercise_ch11.exercise_12_04

import android.net.Uri
import java.io.File

data class FileInfo(
    val uri: Uri,
    val file: File,
    val name: String,
    val relativePath:String,
    val mimeType:String
)
