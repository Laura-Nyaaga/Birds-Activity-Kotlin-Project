package com.example.hello0

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hello0.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprev5.setOnClickListener { finish()}

        Picasso.get().load("https://images.unsplash.com/photo-1560813487-803cbe32d18b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8fA%3D%3D").into(binding.imageView8)
    }
}