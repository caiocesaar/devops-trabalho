package com.example.logonrmlocal.devopsjob.Connection

import com.example.logonrmlocal.devopsjob.models.ContatoModel
import retrofit2.http.GET

interface ConnectionService {

    @GET("busca")
    fun getContacts():List<ContatoModel>

}