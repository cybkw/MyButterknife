package com.bkw.butterknife.library;

import android.app.Activity;

public class ButterKnife {
    public static void bind(Activity activity) {
        //获取目标Activity的类名拼接需要生成的类名
        String className = activity.getClass().getName() + "$ViewBinder";

        try {
            Class<?> viewBindClass = Class.forName(className);
            ViewBinder instance = (ViewBinder) viewBindClass.newInstance();
            instance.bind(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
