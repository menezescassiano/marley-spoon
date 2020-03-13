package com.cassiano.marleyspoon.network

import com.cassiano.marleyspoon.home.model.ContentfulResponse
import io.reactivex.Single
import retrofit2.http.GET

interface IRetrofitService {

    //@GET("kk2bw5ojx476/environments/master/entries?access_token=7ac531648a1b5e1dab6c18b0979f822a5aad0fe5f1109829b8a197eb2be4b84c")
    @GET("kk2bw5ojx476/environments/master/entries?access_token=7ac531648a1b5e1dab6c18b0979f822a5aad0fe5f1109829b8a197eb2be4b84c&content_type=recipe")
    fun getData(): Single<ContentfulResponse>
}