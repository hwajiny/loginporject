package net.flow9.thisiskotlin.loginporject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {

    private lateinit var profileImageView: ImageView
    private lateinit var nameTextView: TextView
    private lateinit var ageTextView: TextView
    private lateinit var mbtiTextView: TextView
    private lateinit var signOutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profileImageView = findViewById(R.id.profileImageView)
        nameTextView = findViewById(R.id.nameTextView)
        ageTextView = findViewById(R.id.ageTextView)
        mbtiTextView = findViewById(R.id.mbtiTextView)
        signOutButton = findViewById(R.id.signOutButton)


        val name = "양화진"
        val age = "28"
        val mbti = "IDK"

        nameTextView.text = "이름: $name"
        ageTextView.text = "나이: $age"
        mbtiTextView.text = "MBTI: $mbti"

        signOutButton.setOnClickListener {

            val intent = Intent(this, SignInActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}
