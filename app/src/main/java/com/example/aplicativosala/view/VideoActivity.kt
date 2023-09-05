package com.example.aplicativosala.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.aplicativosala.databinding.ActivityVideoBinding

class VideoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uriParse = intent?.extras?.getString("UriParse").toString()
        val themeName = intent?.extras?.getString("themeName").toString()
        val description = intent?.extras?.getString("briefDescription").toString()

        binding.briefText.text = description


        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)

        val uri = Uri.parse(uriParse)

        binding.videoView.setMediaController(mediaController)
        binding.videoView.setVideoURI(uri)
        binding.videoView.start()


    }
}