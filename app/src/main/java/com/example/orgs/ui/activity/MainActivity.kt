package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerView.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val view = TextView(this)
        //view.setText("Amamos Gatinhos")
        setContentView(R.layout.activity_main)
        //Toast.makeText(this,"Bem vindo(a) ao Orgs!", Toast.LENGTH_SHORT).show()
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter( this, listOf(
            Produto(nome = "teste",
                descricao = "teste desc",
                valor = BigDecimal("19.99")
            ),
            Produto(nome = "teste 1",
                descricao = "teste desc 1",
                valor = BigDecimal("29.99")
            ),
            Produto(nome = "teste 2",
                descricao = "teste desc 2",
                valor = BigDecimal("39.99")
            ),
        ))

        //recyclerView.layoutManager = LinearLayoutManager(this)


    }

}