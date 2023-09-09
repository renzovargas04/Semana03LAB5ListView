package com.example.semana03lab5listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Android", "Iphone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSistemasOperativos: ListView = findViewById(R.id.lsvSO)
        val adaptador: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)

        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext, "La posición seleccionada es: $position", Toast.LENGTH_SHORT
            ).show()
        }

    }
}


