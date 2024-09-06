package com.example.cp4_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnPesquisa: Button
    private lateinit var btnAlunos: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPesquisa = findViewById(R.id.btn_start)
        btnAlunos = findViewById(R.id.btn_search)
        btnPesquisa.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
            this.finish()
        }
        btnAlunos.setOnClickListener {
            val intent = Intent(this, StudentsActivity::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}