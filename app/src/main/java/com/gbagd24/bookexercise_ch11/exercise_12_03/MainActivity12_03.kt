package com.gbagd24.bookexercise_ch11.exercise_12_03

import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.gbagd24.bookexercise_ch11.R
import java.util.concurrent.Executors


class MainActivity12_03 : AppCompatActivity() {
    private val assetFileManager: AssetFileManager by lazy {
        AssetFileManager(applicationContext.assets)
    }
    private val providerFileManager: ProviderFileManager by lazy {

        ProviderFileManager(
            applicationContext,
            FileToUriMapper(),
            Executors.newSingleThreadExecutor()
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12_03)
        findViewById<Button>(R.id.activity_main_file_provider) .setOnClickListener {
            val newFileName = "Copied.txt"
            providerFileManager.writeStream(newFileName, assetFileManager.getMyAppFileInputStream())
        }

        val createDocumentResult =
            registerForActivityResult(ActivityResultContracts.CreateDocument("text/plain")) { uri ->
                uri?.let {
                    val newFileName = "Copied.txt"
                    providerFileManager.writeStreamFromUri(
                        newFileName,
                        assetFileManager.getMyAppFileInputStream(),
                        uri
                    )
                }
            }
        findViewById<Button>(R.id.activity_main_saf).setOnClickListener {
            createDocumentResult.launch("Copied.txt")
        }

    }






}
