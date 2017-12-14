package com.answer_05.javademo.anony_calss;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.answer_05.javademo.R;

/**
 * @creator : answer_05
 * @create-time : 2017/11/22 上午9:29
 * @description :匿名内部类也会持有外部类实例的引用
 */

public class AnonyImproveActivity extends AppCompatActivity{

    private Button btn_setup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anony_class);
        btn_setup =  findViewById(R.id.btn_setup);
        btn_setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                excuteStart();
                finish();
            }
        });
    }

    void excuteStart(){
        new MyAsyncTask().execute();
    }

    private static class MyAsyncTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            while (true){

            }
        }
    }


}
