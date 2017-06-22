package com.neihan.alex.myneihanduanzi.model;

import android.content.Context;

import com.example.alex.mvplibrary.model.MvpModel;
import com.example.alex.mvplibrary.model.MvpModelCallBack;
import com.google.gson.Gson;
import com.neihan.alex.myneihanduanzi.bean.NeiHanBaseBean;
import com.neihan.alex.myneihanduanzi.bean.NeiHanImgsBean;
import com.neihan.alex.myneihanduanzi.constant.Constant;
import com.neihan.alex.myneihanduanzi.retrofit.api.DuanZiRetrofitApi;
import com.neihan.alex.myneihanduanzi.utils.NetWorkUtils;
import com.neihan.alex.myneihanduanzi.utils.SPUtils;
import com.neihan.alex.myneihanduanzi.utils.ScreenUtils;
import com.retrofitclient.alex.alexretrofitclient.http.RxRetrofitClient;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Created by Alex on 2017/6/15.
 * Alex
 */

public class NeiHanModel extends MvpModel {

    public void getNeiHanImgs(Context context, int type, final MvpModelCallBack<NeiHanBaseBean.DataBean<NeiHanImgsBean>> success, final MvpModelCallBack<String> err) {

        if (!NetWorkUtils.isNetworkConn(context)) {
            sendCallback(err, "没有网络");
            return;
        }

        Observable<NeiHanBaseBean<NeiHanImgsBean>> neiHanImgs = RxRetrofitClient.instance(context, Constant.NEIHAN_URL)
                .buildToGsonFactory(DuanZiRetrofitApi.class)
                .getNeiHanImgs(setNeiHanUrlQueryMap(context, type));
        RxRetrofitClient.execute(neiHanImgs).subscribe(new Consumer<NeiHanBaseBean<NeiHanImgsBean>>() {
            @Override
            public void accept(@NonNull NeiHanBaseBean<NeiHanImgsBean> neiHanImgsBeanNeiHanBaseBean) throws Exception {
                System.out.println(new Gson().toJson(neiHanImgsBeanNeiHanBaseBean));
                if (neiHanImgsBeanNeiHanBaseBean.getMessage().equals("success"))
                    sendCallback(success, neiHanImgsBeanNeiHanBaseBean.getData());
                else
                    sendCallback(err, "获取失败！");
                SPUtils.getInstance().put("min_time", System.currentTimeMillis());
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                sendCallback(err, throwable.getMessage());
            }
        });

    }

    @android.support.annotation.NonNull
    private HashMap<String, Object> setNeiHanUrlQueryMap(Context context, int type) {
        HashMap<String, Object> queryMap = new HashMap<>();
        queryMap.put("content_type", type);
        queryMap.put("am_loc_time", System.currentTimeMillis());

        queryMap.put("count", 20);
        queryMap.put("min_time", SPUtils.getInstance().getLong("min_time"));
        queryMap.put("screen_width", ScreenUtils.getScreenWidth());
        String netType = "";
        if (NetWorkUtils.isMobileConn(context)) {
            netType = "mobile";
        } else if (NetWorkUtils.isWIFIConn(context)) {
            netType = "wifi";
        } else if (NetWorkUtils.is2G(context)) {
            netType = "2G";
        }
        queryMap.put("ac", netType);
        queryMap.put("resolution", ScreenUtils.getScreenWidth() + "*" + ScreenUtils.getScreenHeight());
        queryMap.put("dpi", ScreenUtils.getScreenDPI());
        return queryMap;
    }

}
