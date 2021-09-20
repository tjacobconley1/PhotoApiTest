package com.example.photoapitest.viewmodel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.photoapitest.model.remote.Network
import com.example.photoapitest.model.remote.PhotoApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PhotoViewModel: ViewModel() {


    // CO-ROUTINE
    // just to execute network call
    private val networkService: PhotoApi by lazy {
        Network().api
    }

    // Executes immediately after Constructor Invocation
    init{
        // TODO EXECUTE NETWORK CALL
        // TODO CREATE THE livedata
        // TODO UPDATE THE livedata FROM COROUTINE RESPONSE
        CoroutineScope(Dispatchers.IO).launch{
            val response = networkService.getPhotos()
            Log.d(TAG, "Coroutine Response: $response")

        }
    }
}