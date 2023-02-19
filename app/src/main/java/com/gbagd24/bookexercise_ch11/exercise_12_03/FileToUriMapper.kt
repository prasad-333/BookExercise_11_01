package com.gbagd24.bookexercise_ch11.exercise_12_03

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File

class FileToUriMapper {
    fun getUriFromFile(context: Context, file: File): Uri {
        return FileProvider.getUriForFile(context, "com.android.testable.files", file)
    }
}
