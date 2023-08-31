package com.example.aplicativosala

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.MediaController
import com.example.aplicativosala.databinding.ActivityVideoBinding
import com.example.aplicativosala.model.Informations
import java.io.File

class VideoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uriParse = intent?.extras?.getString("UriParse").toString()
        val themeName = intent?.extras?.getString("themeName").toString()

        binding.themeText.text = themeName



        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)

        val uri = Uri.parse(uriParse)

        binding.videoView.setMediaController(mediaController)
        binding.videoView.setVideoURI(uri)
        binding.videoView.start()


    }
}