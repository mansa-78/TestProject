package com.example.learnandgrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var fabOpen = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Assign image to the imageView
        imageView2.setImageResource(R.drawable.download)

        /**
        * Add navigation listener to "bottomNavigationView" in "bottomAppBar"
        * so that when the menu item is clicked this will get triggered.
        * */
        menuitems.setOnNavigationItemSelectedListener { menuItem ->
            // Bottom Navigation Drawer menu item clicks
            when (menuItem!!.itemId) {
                R.id.login -> {
                    Toast.makeText(this, "This goes to Login Screen", Toast.LENGTH_LONG).show()
                }
                R.id.signup -> Toast.makeText(this, "This goes to Signup Screen", Toast.LENGTH_LONG).show()
                R.id.mainpage -> {
                    //opens "Grade Content" activity in next screen after this menu item is clicked.
                    var intent = Intent(this@MainActivity,GradeContent::class.java)
                    startActivity(intent)
                }
            }
            true
        }
        /**
        * Add button click listener to "floatingActionButton"
        * so that when clicked it will toggle "Youtube" and "Trigger" FAB button.
        * */
        floatingActionButton.setOnClickListener {
            if(fabOpen)
                hideFabMenu()
            else showFabMenu()
        }
        //Hide both "Youtube" and "Trigger" FAB button on load.
        hideFabMenu()

        /**
       * Add button click listener to "fabYouTube"
       * so that when clicked it will show message stating this is link to Youtube.com.
       * */
        fabYouTube.setOnClickListener {
            Toast.makeText(this, "Link To Youtube.com", Toast.LENGTH_LONG).show()
        }
        /**
       * Add button click listener to "fabTwitter"
       * so that when clicked it will show message stating this is link to Twitter.com.
       * */
        fabTwitter.setOnClickListener {
            Toast.makeText(this, "Link To Twitter.com", Toast.LENGTH_LONG).show()
        }
    }
    /**
    * This function shows the "Youtube" and "Trigger" FAB button
    * */
    private fun showFabMenu(){
        fabYouTube.isVisible = true;
        fabTwitter.isVisible = true;
        fabOpen = true
    }
    /**
    * This function hides the "Youtube" and "Trigger" FAB button
    * */
    private fun hideFabMenu(){
        fabYouTube.isVisible = false;
        fabTwitter.isVisible = false;
        fabOpen = false
    }

}