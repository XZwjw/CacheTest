package com.example.wangjiawang.cachetest.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Description:网络工具类
 * Created by wangjiawang on 2018/7/11.
 * complete
 */

public class NetworkUtil {

    /**
     * 判断网络是否存在
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if(manager == null) {
            return false;
        }
        NetworkInfo info = manager.getActiveNetworkInfo();
        if(info == null || !info.isAvailable()) {
            return false;
        }

        return true;
    }
}
