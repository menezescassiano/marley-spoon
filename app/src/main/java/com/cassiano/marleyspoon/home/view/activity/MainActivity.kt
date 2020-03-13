package com.cassiano.marleyspoon.home.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableBoolean
import com.cassiano.marleyspoon.R
import com.cassiano.marleyspoon.home.viewmodel.MainViewModel
import com.cassiano.marleyspoon.network.RetrofitClient
import com.cassiano.starwars.extension.saveMainThread


class MainActivity : AppCompatActivity() {

    private val running = ObservableBoolean(false)
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
