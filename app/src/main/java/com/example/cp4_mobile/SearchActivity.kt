package com.example.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SearchActivity: AppCompatActivity() {
    private lateinit var btnStart: Button
    private lateinit var btnStudents: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        btnStart = findViewById(R.id.btn_start)
        btnStudents = findViewById(R.id.btn_search)

        btnStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
        btnStudents.setOnClickListener {
            val intent = Intent(this, StudentsActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}