package com.cassiano.marleyspoon.home.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableInt
import androidx.lifecycle.AndroidViewModel
import com.cassiano.marleyspoon.network.RetrofitClient
import com.cassiano.starwars.extension.saveMainThread

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val running = ObservableBoolean(false)
    val progressVisibility = ObservableInt(0)

    @SuppressLint("CheckResult")
    fun getData() {
        RetrofitClient.getInstance().model.getData()
            .saveMainThread()
            .doOnSubscribe {
                running.set(true)
                /*setShowProgressBar()*/
            }
            .doFinally {
                running.set(false)
                //setShowProgressBar()
            }
            .subscribe(
                { response ->
                    response.listItem
                    for (item in response.listItem) {
                    }
                    /*list = response as ArrayList<PilotData>
                    responseData.postValue(true)*/
                    running.set(false)
                }, {
                    /*responseError.postValue(true)*/
                    running.set(false)
                })
    }

    private fun setShowProgressBar() {
        if (running.get()) {
            progressVisibility.set(View.VISIBLE)
        } else {
            progressVisibility.set(View.GONE)
        }
    }
}