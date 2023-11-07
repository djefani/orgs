package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        //view.setText("Amamos Gatinhos")
        setContentView(R.layout.activity_main)
        //Toast.makeText(this,"Bem vindo(a) ao Orgs!", Toast.LENGTH_SHORT).show()
    }

}