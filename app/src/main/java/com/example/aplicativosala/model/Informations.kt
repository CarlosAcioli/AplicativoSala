package com.example.aplicativosala.model

import android.net.Uri
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Informations(
    @DrawableRes val imageProfile: Int,
    @StringRes val titleName: Int,
    @StringRes val themeName: Int,
    @StringRes val studentsName: Int,
    val uriVideoParse: Uri
)
