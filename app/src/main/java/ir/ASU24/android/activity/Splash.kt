package ir.ASU24.android.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import ir.android.ASU24.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val handler = Handler()
        handler.postDelayed({
            this.startActivity(
                Intent(
                    this, MainActivity::class.java
                )
            )
            this.finish()
        }, 1000)
    }
}