package com.explore.javamvp.base;

interface BaseResponse<T> {
    public void onDataLoad(T data);

    public void onDataError(int status, String error);
}
