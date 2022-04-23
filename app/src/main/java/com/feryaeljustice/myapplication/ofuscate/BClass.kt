package com.feryaeljustice.myapplication.ofuscate

import androidx.annotation.Keep

@Keep sealed class BClass{
    var hellooo = "aaaaa"
    fun hello(){
        hellooo = "B"
    }
    fun bye(){
        hellooo="bye"
    }
}
