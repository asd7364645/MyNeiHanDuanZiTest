package com.neihan.alex.myneihanduanzi.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

public class ToastUtils {

    private static Toast toast;

    private static Handler handler = new Handler(Looper.getMainLooper());

    private ToastUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isShow = true;

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
        if (isShow)
            showToast(context, message, Toast.LENGTH_SHORT);
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message) {
        if (isShow)
            showToast(context, String.valueOf(message), Toast.LENGTH_SHORT);
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
        if (isShow)
            showToast(context, message, Toast.LENGTH_LONG);
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message) {
        if (isShow)
            showToast(context, String.valueOf(message), Toast.LENGTH_LONG);
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration) {
        if (isShow)
            showToast(context, message, duration);
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int duration) {
        if (isShow)
            showToast(context, String.valueOf(message), duration);
    }

    private static void showToast(final Context context, final CharSequence message, final int time) {
        //判断如果在后台就不显示
        if (!AppUtils.isAppOnForeground(context))
            return;
        //为了防止在子线程中不小心调用崩溃，所以控制在主线程中，安全调用
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(context, message, time);
                } else {
                    toast.setDuration(time);
                    toast.setText(message);
                }
                toast.show();
            }
        });
    }


}