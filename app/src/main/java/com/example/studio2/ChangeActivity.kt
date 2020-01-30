package com.example.studio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_change.*

class ChangeActivity : AppCompatActivity() {

    var depFrag = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)

    }

    override fun onStart() {
        super.onStart()
        switchFragment(null)
    }

    fun switchFragment(view: View?){
        if(depFrag){
            val withdraw = WithdrawFragment()
            withdraw.arguments = Bundle()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, withdraw)
            transaction.commit()
            depFrag = false
        } else{
            val deposit = DepositFragment()

            deposit.arguments = Bundle()

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, deposit)
            transaction.commit()
            depFrag = true
        }
    }

    fun deposit(){

    }

    fun withdraw(){

    }
}
