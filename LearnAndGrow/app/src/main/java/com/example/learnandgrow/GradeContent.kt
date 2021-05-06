package com.example.learnandgrow

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.MediaController
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_grade_content.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.grade_content_tab1.*


class GradeContent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade_content)
        /**
         * fragment adapter to link to tab viewer so that we can switch between different fragment
         * when corresponding tab is clicked
         */
        val fragmentAdapter = GradeContentPagerAdapter(this)
        tab_viewpager.adapter = fragmentAdapter
        /**
         * media controller for video view to show raw video
         *
         */
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //generate url for the video
        val onlineUrl = Uri.parse("https://cdn.videvo.net/videvo_files/video/free/2013-09/small_watermarked/DNAStrandRotateLoopVidevo_preview.webm")
        val offlineUrl= Uri.parse("android.resource://"+ packageName + "/" + R.raw.science)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUrl )
        videoView.requestFocus()
        videoView.start()

        /**
         * Add button click listener to "buttonTakeTest"
         * so that when clicked it will go to next activity.
         */
        buttonTakeTest.setOnClickListener {
            //opens "Questionnaire" activity in next screen after a button is clicked.
            var intent = Intent(this@GradeContent,Questionnaire::class.java)
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
                        this@GradeContent,
                        MainActivity::class.java
                )//opens Main activity in next screen after a button is clicked.
                startActivity(intent)
            }
            R.id.logout -> Toast.makeText(this, "This is to login", Toast.LENGTH_LONG).show()
        }
        return true
    }
}