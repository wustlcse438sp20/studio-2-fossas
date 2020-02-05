package com.example.studio2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class MainActivity : AppCompatActivity() {


    private var CURRENT_BALANCE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        CURRENT_BALANCE = intent!!.getIntExtra("total", 0)
    }

    override fun onStart() {
        super.onStart()
        value_display.text = "$" + CURRENT_BALANCE.toString()
    }

    fun goToChange(view: View){
        val intentToChange = Intent(this, ChangeActivity::class.java)
        intentToChange.putExtra("total", CURRENT_BALANCE)
        startActivity(intentToChange)
    }
}
