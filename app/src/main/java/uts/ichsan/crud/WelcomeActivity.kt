package uts.ichsan.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btnlogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        btn.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
            finish()
        }
    }
}
    }
}