package com.example.cap_login
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.login.*

class Login_Activitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        btn_login.setOnClickListener{
            val intent = Intent(this,Main_Activity::class.java) // Main으로 이동하기 위한 인텐트객체 생성
            startActivity(intent)
        }
        btn_signup.setOnClickListener{
            val signup_intent = Intent(this,Signup_Activity::class.java) // 회원가입 창으로 이동
            startActivity(signup_intent)
        }
    }
    var mBackWait:Long = 0   // 뒤로가기 연속 클릭 대기시간
    override fun onBackPressed() {
        //뒤로가기 버튼 클릭 시
        if(System.currentTimeMillis()-mBackWait >=1500){
            mBackWait = System.currentTimeMillis()
            Toast.makeText(this,"뒤로가기 버튼을 한번 더 누르시면 종료됩니다.",Toast.LENGTH_LONG).show()}
        else {
            ActivityCompat.finishAffinity(this)
            System.runFinalization()
            System.exit(0)
        }
    }
}