package com.answer_05.javademo.singleton;

import android.content.Context;

/**
 * @creator : answer_05
 * @create-time : 2017/11/20 下午1:48
 * @description :测试内存泄漏的单例Class
 */

public class TestLeak {

    private Context context;
    private static  TestLeak mInstance;

    public TestLeak(Context context) {

        this.context = context;

    }

    public static TestLeak getInstance(Context context){

        if(mInstance == null){
            mInstance = new TestLeak(context);
        }
            return mInstance;

    }



}
