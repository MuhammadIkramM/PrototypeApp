package com.example.justtesting.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dummy (
    val name: String,
    val val_date: String,
    val images: Int,
) : Parcelable