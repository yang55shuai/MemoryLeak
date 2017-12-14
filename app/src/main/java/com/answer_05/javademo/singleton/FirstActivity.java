package com.answer_05.javademo.singleton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.answer_05.javademo.R;
/**
 * @creator : answer_05
 * @create-time : 2017/11/20 下午1:48
 * @description :测试内存泄漏的单例Class,也包括未正确的使用Context对象。
 */
public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void toSecondActivity(View view) {

        startActivity(new Intent(FirstActivity.this,SecondActivity.class));
    }
}
