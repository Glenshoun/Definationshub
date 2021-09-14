package com.ratedoriginal.definationshub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category.*

class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)


        cvaccounting.setOnClickListener {
            val intent = Intent(this, AccountingActivity::class.java)
            startActivity(intent)
            }

        cvphysicalscience.setOnClickListener {
            val intent = Intent(this, PhysicalScienceActivity::class.java)
            startActivity(intent)
        }


        cvbs.setOnClickListener {
            val intent = Intent(this, BusinessStudiesActivity::class.java)
            startActivity(intent)
        }

    }
}