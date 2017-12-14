package com.answer_05.javademo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * @creator : answer_05
 * @create-time : 2017/11/20 下午1:33
 * @description :
 */

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

}
