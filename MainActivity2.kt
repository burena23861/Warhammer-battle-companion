package com.example.warhammer40kbattlecompanion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val stratagemsButton = findViewById<View>(R.id.stratagemsButton)
        stratagemsButton.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }

        val ordersGivenButton = findViewById<View>(R.id.ordersGivenButton)
        ordersGivenButton.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity4::class.java)
            startActivity(intent)
        }

        val battleShockedButton = findViewById<View>(R.id.battleShockedButton)
        battleShockedButton.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}