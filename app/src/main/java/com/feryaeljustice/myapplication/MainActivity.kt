package com.feryaeljustice.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sentence = "App metadata: "
        when (BuildConfig.BUILD_TYPE) {
            "debug" -> {
                println("debug")
                sentence += "debug"
            }
            "release" -> {
                print("release")
                // Inicializar Admob
                sentence += "release"
            }
            else -> {
                print("")
                sentence += " "
            }
        }
        sentence += " "
        when (BuildConfig.FLAVOR) {
            "premium" -> {
                println("premium")
                // Start Activity
                sentence += "premium"
            }
            "free" -> {
                print("free")
                // Mostrar dialogo para que pague
                sentence += "free"
            }
            else -> {
                print("")
                sentence += " "
            }
        }
        sentence+=" "

        if (BuildConfig.FER_CRACK) {
            // Siempre lo es
            print("fer crack")
            sentence += "fer es un crack"
        }else{
            sentence += "fer no es un crack"
        }

        val myURL = BuildConfig.URL
        sentence += myURL

        sentence+="."

        Toast.makeText(this, sentence, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.textView).text = sentence
    }
}