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


    private val CURRENT_BALANCE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun goToChange(view: View){
        val intentToChange = Intent(this, ChangeActivity::class.java)
        startActivityForResult(intentToChange, CURRENT_BALANCE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode== CURRENT_BALANCE){
            if(resultCode== Activity.RESULT_OK){
                //Do something here

            }
        }
    }
}
