package com.example.hello0

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hello0.databinding.ActivitySixthBirdBinding
import com.squareup.picasso.Picasso

class SixthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySixthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySixthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnprev.setOnClickListener {
            finish()
        }

        binding.btnnext2.setOnClickListener {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1551085254-e96b210db58a?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YmlyZHxlbnwwfHwwfHx8MA%3D%3D").into(binding.imageView)
    }
}
