package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeActivity(view: View) {

        val name = editTextTextPersonName.editableText.toString()

        val intent = Intent(this,BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.NAME_EXTRA,name)
        startActivity(intent)
    }
}