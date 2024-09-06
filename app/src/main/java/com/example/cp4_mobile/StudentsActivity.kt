package com.example.cp4_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StudentsActivity: AppCompatActivity() {
    private lateinit var btnStart: Button
    private lateinit var btnSearch: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)

        btnStart = findViewById(R.id.btn_start)
        btnSearch = findViewById(R.id.btn_search)

        btnStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
        btnSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}