package com.example.learnandgrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_results.*

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        /**
         * Adapter for list
         */
        val arrayAdapter: ArrayAdapter<*>
        val questions = arrayOf(
                "Question 1", "Question 2", "Question 3",
                "Question 4"
        )
        arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_checked, questions)
        scorelist.adapter = arrayAdapter
        /**
         * Add button click listener to "btnGoHome"
         * so that when clicked it will go to next activity.
         */
        btnGoHome.setOnClickListener {
            //opens "Grade Content" activity in next screen after "Go Home" button is clicked.
            var intent = Intent(this@Results,GradeContent::class.java)
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
                        this@Results,
                        MainActivity::class.java
                )//opens "main" activity in next screen after a button is clicked.
                startActivity(intent)
            }
            R.id.logout -> {
                var intent = Intent(
                        this@Results,
                        MainActivity::class.java
                )//opens "main" activity in next screen after a button is clicked.
                startActivity(intent)
            }
        }
        return true
    }
}