package com.example.cap_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        //setContentView(R.layout.signup)

        // 네비게이터 버튼. R.layout.main에서만 사용가능.
        imageButton.setOnClickListener{ layout_drawer.openDrawer(GravityCompat.START) }
        naviView.setNavigationItemSelectedListener(this)

    }


    // 네비게이터 구현.
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.info -> println("내 정보")
            R.id.device -> println("디바이스")
            R.id.deviceAdd -> println("장치 추가")
        }
        layout_drawer.closeDrawers()
        return false
    }

    // 네비게이터에서 뒤로가기 키 눌렀을 때.
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
