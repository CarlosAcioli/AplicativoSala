package com.example.aplicativosala.dataset

import com.example.aplicativosala.R
import com.example.aplicativosala.model.IntroItem

class IntroList {

    fun loadIntroList(): List<IntroItem>{

        return listOf<IntroItem>(
            IntroItem(R.drawable.img_education_1, R.string.intro_title_1, R.string.dp_1),
            IntroItem(R.drawable.img_education_3, R.string.intro_title_2, R.string.dp_2),
            IntroItem(R.drawable.img_education_2, R.string.intro_title_3, R.string.dp_3)
        )

    }

}