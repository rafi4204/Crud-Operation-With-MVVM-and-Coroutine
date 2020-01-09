package com.example.crudoperationwithmvvmandcoroutine.model

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class BaseResponseModel {
    @SerializedName("")
    var item : ArrayList<ResponseModel> = arrayListOf()
}