package com.example.cap_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        //setContentView(R.layout.signup)

        imageButton.setOnClickListener{ layout_drawer.openDrawer(GravityCompat.START) }
        naviView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.info -> println("내 정보")
            R.id.device -> println("디바이스")
            R.id.deviceAdd -> println("장치 추가")
        }
        layout_drawer.closeDrawers()
        return false
    }

    override fun onBackPressed() {
        if (layout_drawer.isDrawerOpen(GravityCompat.START))
        {
            layout_drawer.closeDrawers()
        }
        else
        {
            super.onBackPressed()
        }
    }
}
