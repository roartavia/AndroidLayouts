package com.example.rodolfoartavia.layouts_tutorial

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
//        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
//        rounded.cornerRadius = 30f
//        rounded.isCircular = true
//        logo.setImageDrawable(rounded)

    }
}
