package com.example.aplicativosala

import android.media.MediaController2
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.aplicativosala.databinding.ActivityMainBinding
import com.example.aplicativosala.dataset.Datasource
import com.example.aplicativosala.model.Informations

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.VideoTest)

        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.funny_video}")
        binding.VideoTest.setMediaController(mediaController)
        binding.VideoTest.setVideoURI(offlineUri)


    }
}



