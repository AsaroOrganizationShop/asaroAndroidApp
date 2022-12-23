package com.example.asaroshop.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.asaroshop.R
import com.example.asaroshop.activities.MenuActivity
import com.example.asaroshop.interfaces.Callback


class LoginFragment : Fragment() {

    private var callback : Callback? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val loginButton : Button = view.findViewById(R.id.loginButton)
        val registerButton : Button = view.findViewById(R.id.registerButton)

        loginButton.setOnClickListener{
            val intent = Intent(view.context, MenuActivity::class.java)
            startActivity(intent)
        }

        registerButton.setOnClickListener {
            callback?.changeFragment()
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Callback){
            callback = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        callback = null
    }

}