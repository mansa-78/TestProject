package com.example.learnandgrow

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_questionnaire.*

class Questionnaire : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnaire)
        /**
         * Add button click listener to "btnSubmit"
         * so that when clicked it will go to next activity.
         */
        btnSubmit.setOnClickListener {
            //opens "Results" activity in next screen after a button is clicked.
            var intent = Intent(this@Questionnaire,Results::class.java)
            startActivity(intent)
        }
    }
    /**
     * create menu items from "main_menu"
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
    /**
     * Add handler when a menu item is selected from the menu items
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.home -> {
                var intent = Intent(
                    this@Questionnaire,
                    MainActivity::class.java
                )//opens "Main"" activity in next screen after a button is clicked.
                startActivity(intent)
            }
            R.id.logout -> Toast.makeText(this, "This is to login", Toast.LENGTH_LONG).show()
        }
        return true
    }
}