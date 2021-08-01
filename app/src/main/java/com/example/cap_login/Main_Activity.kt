//package com.example.cap_login
//// 협업 이대호 test
//import android.content.Intent
//import android.os.Bundle
//import android.os.PersistableBundle
//import android.view.MenuItem
//import android.widget.Button
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.GravityCompat
//import com.google.android.material.navigation.NavigationView
//import kotlinx.android.synthetic.main.main.*
//import kotlinx.android.synthetic.main.signup.*
//
//
//class Main : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.login)
//
//        //login창 - btnlogin버튼.
//        val btnLogin = findViewById<Button>(R.id.btn_login)
//        val btnSignup = findViewById<Button>(R.id.btn_signup)
//
//        btnLogin.setOnClickListener {
//            setContentView(R.layout.main)
//
//            imageButton.setOnClickListener{ layout_drawer.openDrawer(GravityCompat.START) }
//            naviView.setNavigationItemSelectedListener(this)
//        }
//        btnSignup.setOnClickListener{
//            setContentView(R.layout.signup)
//        }
//
//    }
//
//    // 네비게이터 구현.
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        when(item.itemId) {
//            R.id.info -> println("내 정보")
//            R.id.device -> println("디바이스")
//            R.id.deviceAdd -> println("장치 추가")
//        }
//        layout_drawer.closeDrawers()
//        return false
//    }
//
//    // 네비게이터에서 뒤로가기 키 눌렀을 때.
//    override fun onBackPressed() {
//        if (layout_drawer.isDrawerOpen(GravityCompat.START))
//        {
//            layout_drawer.closeDrawers()
//        }
//        else
//        {
//            startActivity(Intent(this, Main::class.java))
//            finish()
//
//        }
//    }
//}
package com.example.cap_login

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.main.*

class Main_Activity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        imageButton.setOnClickListener{
            layout_drawer.openDrawer(GravityCompat.START) // 메뉴바를 눌렀을때
        }
        naviView.setNavigationItemSelectedListener(this) // 메뉴바에 클릭 속성을 부여함
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 메뉴 부분
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
        else {
            startActivity(Intent(this, Login_Activitiy::class.java))
            finish()
        }

    }
}