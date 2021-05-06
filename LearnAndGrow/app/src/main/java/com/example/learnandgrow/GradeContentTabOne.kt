package com.example.learnandgrow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_grade_content.*
import kotlinx.android.synthetic.main.grade_content_tab1.*
class GradeContentTabOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //buttonOne.setOnClickListener { Toast.makeText(context,"Link to URL",Toast.LENGTH_LONG).show() }
        return inflater!!.inflate(R.layout.grade_content_tab1, container, false)
    }
}