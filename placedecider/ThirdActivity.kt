package com.example.placedecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val layoutManager = LinearLayoutManager(this)
        recycle.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.activities)
        recycle.adapter = adapter

    }
}