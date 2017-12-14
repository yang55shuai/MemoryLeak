package com.answer_05.javademo.singleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.answer_05.javademo.R;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e("ThirdActivity","onCreate");
        TestLeak testLeak = TestLeak.getInstance(ThirdActivity.this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
