package com.example.rerngchin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.main_frame, investFrag()).commit()
        bottomNavi.setNavigationChangeListener { _, position ->
            var select_Fragment: Fragment = investFrag()
            when(position){
                0 -> select_Fragment = investFrag()
                1 -> select_Fragment =  investFrag()

            }
            supportFragmentManager.beginTransaction().replace(R.id.main_frame, select_Fragment).commit()
        }


    }
}