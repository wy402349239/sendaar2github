package com.wy.util.aar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * @Description:
 * @Author: jx_wy
 * @Date: 4/22/21 6:10 PM
 */
public class AarUtil {

    public static void toastMsg(Context context, String msg){
        if (context == null || TextUtils.isEmpty(msg)){
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}