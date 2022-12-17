package com.example.asaroshop.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.asaroshop.R
import com.example.asaroshop.fragments.BuyFragment
import com.example.asaroshop.fragments.ProfileFragment
import com.example.asaroshop.fragments.ShopCartFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {

    private val buyFragment = BuyFragment();
    private val shopCartFragment = ShopCartFragment();
    private val profileFragment = ProfileFragment();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        replaceFragment(buyFragment)
        val selection = findViewById<BottomNavigationView>(R.id.NavButton);

        selection.setOnItemSelectedListener {
            when(it.itemId){
                R.id.ic_buy -> replaceFragment(buyFragment)
                R.id.ic_shopCart -> replaceFragment(shopCartFragment)
                R.id.ic_profile -> replaceFragment(profileFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction();
            transaction.replace(R.id.frag_Container, fragment);
            transaction.commit();

        }

    }
}