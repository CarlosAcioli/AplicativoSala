package com.example.aplicativosala.view

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.aplicativosala.R
import com.example.aplicativosala.adapter.IntroAdapter
import com.example.aplicativosala.databinding.ActivityIntroScreenBinding
import com.example.aplicativosala.dataset.IntroList
import com.google.android.material.tabs.TabLayoutMediator

class IntroScreen : AppCompatActivity() {

    private lateinit var binding: ActivityIntroScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setAndLoadPreference()

        binding = ActivityIntroScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val introItems = IntroList().loadIntroList()
        val viewPager = binding.ViewPager

        viewPager.adapter = IntroAdapter(this, introItems)

        val tabLayout = binding.tabIndicator

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.icon = ContextCompat.getDrawable(this, R.drawable.indicator_selector)

        }.attach()


        binding.btnNext.setOnClickListener {

            var position = viewPager.currentItem

            if (position < introItems.size) {

                position++
                viewPager.currentItem = position
            }

            if (position == 3) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                savePreferenceData()
                finish()
            }


        }

    }

    private fun setAndLoadPreference() {
        if (gettingPreferenceData()) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun gettingPreferenceData(): Boolean {

        val preference: SharedPreferences = applicationContext.getSharedPreferences(
            "IntroOpened", MODE_PRIVATE
        )

        val isIntroOpened: Boolean = preference.getBoolean("isIntroOpened", false)

        return isIntroOpened

    }

    private fun savePreferenceData() {

        val preference: SharedPreferences = applicationContext.getSharedPreferences(
            "IntroOpened", MODE_PRIVATE
        )

        val editor: SharedPreferences.Editor = preference.edit()
        editor.putBoolean("isIntroOpened", true)
        editor.apply()

    }

}