package com.example.tugas4mobileprogramming

import android.content.Intent
import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = listOf("LinearLayout","RelativeLayout","FrameLayout","TableLayout", "ListView", "GridView")
        ini_list.adapter = ArrayAdapter(this, simple_list_item_1, data)

        ini_list.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                intent = Intent(this, LinearLayout::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                intent = Intent(this, RelativeLayout::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                intent = Intent(this, FrameLayout::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                intent = Intent(this, TableLayout::class.java)
                startActivity(intent)
            }
            if (position == 4) {
                intent = Intent(this, ListView::class.java)
                startActivity(intent)
            }
            if (position == 5) {
                intent = Intent(this, GridView::class.java)
                startActivity(intent)
            }
        }
    }
}