package com.retrofitclient.alex.alexretrofitclient.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Alex on 2017/4/28.
 * Alex
 */

public class MyNetWorkUtils {

    /**
     * 判断是否有网络
     *
     * @param context
     * @return
     */
    public static boolean isNetworkConn(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager
                    .getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }

}