package com.example.aplicativosala.model

import android.net.Uri
import androidx.annotation.StringRes

data class Informations(
    @StringRes val titleName: Int,
    val uriParse: Uri
)
