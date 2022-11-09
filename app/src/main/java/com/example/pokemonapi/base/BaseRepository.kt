package com.example.pokemonapi.base

import androidx.lifecycle.liveData
import com.example.pokemonapi.common.Resource
import java.io.IOException

abstract class BaseRepository {
    fun <T> doRequest(result: suspend () -> T) = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(result()))
        } catch (ioException: IOException) {
            emit(Resource.Error(ioException.localizedMessage ?: "error", data = null))
        }
    }
}