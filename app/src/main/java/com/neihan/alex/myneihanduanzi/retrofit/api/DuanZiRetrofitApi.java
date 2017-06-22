package com.neihan.alex.myneihanduanzi.retrofit.api;

import com.neihan.alex.myneihanduanzi.bean.NeiHanBaseBean;
import com.neihan.alex.myneihanduanzi.bean.NeiHanImgsBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Alex on 2017/6/15.
 * Alex
 */

public interface DuanZiRetrofitApi {
    @GET("?mpic=1" +
            "&webp=1" +
            "&essence=1" +
            "&message_cursor=-1" +
            "&channel=360" +
            "&count=20" +
            "&double_col_mode=0" +
            "&aid=7" +
            "&app_name=joke_essay" +
            "&device_platform=android" +
            "&ssmix=a")
    Observable<NeiHanBaseBean<NeiHanImgsBean>> getNeiHanImgs(@QueryMap Map<String, Object> queryMap);

}
