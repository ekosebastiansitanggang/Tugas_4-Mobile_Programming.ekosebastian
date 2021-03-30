package com.example.tugas4mobileprogramming

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val data = listOf("a","b","c","d")
        ini_list.adapter = ArrayAdapter(this, simple_list_item_1, data)

        ini_list.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih: ${data[position]}",
                Toast.LENGTH_SHORT).show()
        }
    }
}