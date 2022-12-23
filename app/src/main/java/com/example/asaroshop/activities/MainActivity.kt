package com.example.asaroshop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asaroshop.R
import com.example.asaroshop.fragments.LoginFragment
import com.example.asaroshop.fragments.RegisterFragment
import com.example.asaroshop.interfaces.Callback

class MainActivity : AppCompatActivity(), Callback{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment()

    }

    private fun addFragment(){
        val fragment = LoginFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, fragment)
        transaction.commit()

    }

    public fun replaceFragment(){
        val fragment = RegisterFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.addToBackStack(null);
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

    override fun changeFragment() {
        replaceFragment()
    }
}