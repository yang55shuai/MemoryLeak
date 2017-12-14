package com.answer_05.javademo.handlerLeak;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.answer_05.javademo.R;

import java.lang.ref.WeakReference;

/**
 * @creator : answer_05
 * @create-time : 2017/11/21 上午11：10
 * @description :Handler引发的内存的泄漏
 */
public class HandlerImproveActivity extends AppCompatActivity {

    Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        mHandler= new ImproveHandler(HandlerImproveActivity.this);
    }

    public void sendMessage(View view) {
        mHandler.sendEmptyMessageDelayed(1,1000*30);

    }

    private static class ImproveHandler extends Handler{

        private WeakReference<HandlerImproveActivity> mActivity;

        public ImproveHandler(HandlerImproveActivity improveActivity) {
            this.mActivity = new WeakReference<HandlerImproveActivity>(improveActivity);
        }


        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (mActivity != null && mActivity.get() != null) {
                mActivity.get().show();
            }
        }
    }

    public void show(){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mHandler != null){
            mHandler.removeCallbacksAndMessages(null);
        }

    }
}
