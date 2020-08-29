package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images= listOf<Int>(R.drawable.ig1,R.drawable.ig2,R.drawable.ig3,R.drawable.ig4)
        val myAdapter=ViewPagerAdapter(images)
        vpViewPager.adapter=myAdapter
        vpViewPager.orientation=ViewPager2.ORIENTATION_VERTICAL
    }
}