package com.example.aplicativosala.dataset

import android.net.Uri
import com.example.aplicativosala.R
import com.example.aplicativosala.model.Informations

class Datasource {

    fun mydatasource(): List<Informations> {

        return listOf<Informations> (
            Informations(R.string.title_1, Uri.parse(""))
        )

    }

}