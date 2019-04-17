package com.foryou.longan_api;

import android.app.Application;
import android.util.Log;

import com.foryou.longan_api.core.LogisticsCenter;

/**
 * Description:
 * Created by liyawei
 * Date:2019/4/11 7:37 PM
 * Email:liyawei@foryou56.com
 */
public class Longan {
    private static final String TAG = "Longan";

    public static void init(Application application){
        Log.i(TAG, "longan init start");
        LogisticsCenter.init();
        Log.i(TAG, "longan init end");
    }
}
