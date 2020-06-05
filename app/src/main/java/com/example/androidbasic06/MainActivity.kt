package com.example.androidbasic06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentFrame, FirstFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        secondButton.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentFrame, SecondFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
