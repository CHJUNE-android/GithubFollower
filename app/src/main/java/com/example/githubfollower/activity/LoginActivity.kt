package com.example.githubfollower.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.githubfollower.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up.idEditText
import kotlinx.android.synthetic.main.activity_sign_up.joinButton
import kotlinx.android.synthetic.main.activity_sign_up.passwordEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener{
            if(idEditText.text.isEmpty()||passwordEditText.text.isEmpty()){
                Toast.makeText(this,"빈칸 채워주세요", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this@LoginActivity,
                    MainActivity::class.java)
                intent.putExtra("idText",idEditText.text.toString())
                startActivity(intent)

            }
        }
        joinButton.setOnClickListener{
            val intent = Intent(this@LoginActivity,
                SignUpActivity::class.java)
            startActivityForResult(intent,100)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==100&&resultCode== Activity.RESULT_OK){
            idEditText.setText(data?.getStringExtra("idText"))
            passwordEditText.setText(data?.getStringExtra("passwordText"))
        }
    }
}
