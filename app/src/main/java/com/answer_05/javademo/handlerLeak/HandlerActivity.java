package com.answer_05.javademo.handlerLeak;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.answer_05.javademo.R;

/**
 * @creator : answer_05
 * @create-time : 2017/11/21 上午11：10
 * @description :Handler引发的内存的泄漏
 */
public class HandlerActivity extends AppCompatActivity {

    Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        mHandler= new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                show();
            }
        };
    }

    public void sendMessage(View view) {
        mHandler.sendEmptyMessageDelayed(1,1000*30);
        finish();
    }

    public void show(){

    }

}
