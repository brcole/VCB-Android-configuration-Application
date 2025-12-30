package com.vcb.configuration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vcb.configuration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // Initialize the VCB configuration application
        binding.textViewTitle.text = getString(R.string.welcome_message)
    }
}
