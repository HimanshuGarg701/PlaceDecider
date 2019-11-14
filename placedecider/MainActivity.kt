package com.example.placedecider

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val placeList = mutableListOf<String>("India", "Hong Kong","Bangladesh", "America")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val input = Random()
            val destiny = input.nextInt(placeList.size)
            place.text = placeList[destiny]

        }

        submitBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val country = addPlace.text.toString()
            placeList.add(country)
            intent.putExtra("code", country)
            addPlace.text.clear()
            startActivity(intent)
        }

        placeLocator.setOnClickListener {
            val destiny = Intent(this,ThirdActivity::class.java)
            startActivity(destiny)
        }
    }
}
