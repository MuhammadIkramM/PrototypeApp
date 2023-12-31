package com.example.justtesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var botNavView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botBarBind()
        botNavView.selectedItemId = R.id.bottom_home
        botBarHandle()
    }

    private fun botBarHandle() {
        botNavView.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.bottom_home -> {
                    return@setOnItemSelectedListener true
                }

//                R.id.bottom_scan -> {
//                    loadActivities(())
//                    return@setOnItemSelectedListener true
//                }

                R.id.bottom_history -> {
                    loadActivities(HistoryActivity())
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_profile -> {
                    loadActivities(ProfileActivity())
                    return@setOnItemSelectedListener true
                }
            }
            return@setOnItemSelectedListener false
        }
    }


    private fun botBarBind() {
        botNavView = findViewById(R.id.bottomNav)
    }

    private fun loadActivities(activity: AppCompatActivity) {
        startActivity(Intent(applicationContext, activity::class.java))
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        finish()
    }
}