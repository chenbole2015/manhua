package com.gn.cartoon.http.request;

import com.gn.cartoon.http.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.HttpParams;



public class BaseRequest {
    protected void getStringResponse(String url, HttpParams params, StringCallback callback) {
        OkGo.<String>post(url).params(params).execute(callback);

    }

    protected <T> void getModelResponse(String url, HttpParams params, JsonCallback<T> callback) {
        OkGo.<T>post(url).params(params).execute(callback);
    }

}
