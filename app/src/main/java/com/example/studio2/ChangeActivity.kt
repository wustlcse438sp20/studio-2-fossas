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
        //this is how we get the information from the main activity
        var bundle :Bundle ?=intent.extras
        var total = bundle!!.getInt("total")

        if(depFrag){
            val withdraw = WithdrawFragment()
            //Sending information over to our fragment
            var bundle = Bundle()
            bundle.putInt("total", total)
            withdraw.arguments = bundle

            //Replacing the view in our change activity with our withdraw fragment
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, withdraw)
            transaction.commit()
            depFrag = false
        } else{
            val deposit = DepositFragment()
            //Sending the info to our fragment
            var bundle = Bundle()
            bundle.putInt("total", total)
            deposit.arguments = bundle

            //Changing our view to the deposit fragment.
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, deposit)
            transaction.commit()
            depFrag = true
        }
    }
}
