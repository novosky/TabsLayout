package com.oghenovo.tabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oghenovo.findmyage.R
import com.oghenovo.findmyage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var whatsAppAdapter: WhatsAppAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bindingmainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView (bindingmainActivity.root)

        whatsAppAdapter = WhatsAppAdapter(supportFragmentManager)
        bindingmainActivity.pager.adapter = whatsAppAdapter
        bindingmainActivity.tabLayout.setupWithViewPager(bindingmainActivity.pager)
    }
}