package ir.ASU24.android.activity

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import ir.android.ASU24.databinding.ActivitySplashBinding
import java.util.jar.Manifest

class Splash : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        if (ContextCompat.checkSelfPermission(
//                this,
//                android.Manifest.permission.INTERNET
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            ActivityCompat.requestPermissions(
//                this,
//                arrayOf(android.Manifest.permission.INTERNET),
//                100
//            )
//        }
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