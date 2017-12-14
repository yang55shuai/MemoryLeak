package com.answer_05.javademo.singleton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.answer_05.javademo.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("SecondActivity","onCreate");
    }

    public void toThirdActivity(View view) {
        startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
    }

    public void toImproveActivity(View view) {
        startActivity(new Intent(SecondActivity.this,ThirdImproveActivity.class));
    }
}
