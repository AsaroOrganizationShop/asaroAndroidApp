package com.example.asaroshop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asaroshop.R
import com.example.asaroshop.fragments.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager.beginTransaction();
        transaction.add(R.id.container, LoginFragment());
        transaction.commit();

    }
}