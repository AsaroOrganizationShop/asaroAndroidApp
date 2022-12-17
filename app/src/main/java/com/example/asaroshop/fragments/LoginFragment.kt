package com.example.asaroshop.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.asaroshop.R
import com.example.asaroshop.activities.MenuActivity


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val loginButton : Button = view.findViewById(R.id.button)
        loginButton.setOnClickListener{
            val intent = Intent(view.context, MenuActivity::class.java)
            startActivity(intent)
        }
        return view
    }

}