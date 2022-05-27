package com.example.signupui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        txtView= findViewById(R.id.txtview)
        txtView.setOnClickListener{
            val intent = Intent(this, AnotherActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

       //        linktextview.findViewById(R.id.textView4);
//        linktextview.setMovementMethod((LinkMovementMethod.getInstance()));
    }
}

