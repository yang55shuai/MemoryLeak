package com.answer_05.javademo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.answer_05.javademo.adapter.CommonBaseAdapter;
import com.answer_05.javademo.adapter.CommonViewHolder;
import com.answer_05.javademo.anony_calss.AnonyClassActivity;
import com.answer_05.javademo.anony_calss.AnonyImproveActivity;
import com.answer_05.javademo.handlerLeak.HandlerActivity;
import com.answer_05.javademo.handlerLeak.HandlerImproveActivity;
import com.answer_05.javademo.innerclass_static.InnerImproveStactivity;
import com.answer_05.javademo.innerclass_static.InnerStactivity;
import com.answer_05.javademo.singleton.FirstActivity;

import java.util.ArrayList;

/**
 * @creator : answer_05
 * @create-time : 2017/11/21 上午08：10
 * @description :首页
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_main;
    private ArrayList<String> mArrayList;
    private CommonBaseAdapter<String> commonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_main = findViewById(R.id.rv_main);
        mArrayList = new ArrayList<>();
        mArrayList.add("Handler泄漏");
        mArrayList.add("Handler泄漏修改");
        mArrayList.add("Singleton泄漏");
        mArrayList.add("Singleton泄漏修改");
        mArrayList.add("InnerClass泄漏");
        mArrayList.add("InnerClass泄漏修改");
        mArrayList.add("AnnoyClass泄漏");
        mArrayList.add("AnnoyClass泄漏修改");
        mArrayList.add("Atttt");
        initView();

    }

    private void initView() {


        commonAdapter = new CommonBaseAdapter<String>(this, mArrayList) {
            @Override
            protected void convert(CommonViewHolder holder, String item, int position) {
                holder.setText(R.id.btn_item, mArrayList.get(position));
            }

            @Override
            protected int getItemViewLayoutId(int position, String item) {
                return R.layout.item_main;
            }
        };
        rv_main.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        rv_main.setAdapter(commonAdapter);
        commonAdapter.setOnItemClickListener(new CommonBaseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, Object item, int position) {

                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, HandlerActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, HandlerImproveActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, FirstActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, FirstActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, InnerStactivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, InnerImproveStactivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, AnonyClassActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this, AnonyImproveActivity.class));
                        break;
                    case 8:
                        //startActivity(new Intent(MainActivity.this, TestStaticActivity.class));
                        break;
                }
            }
        });


    }

    public void btn_Anr(View view) {
        try {
            Thread.sleep(20 * 1000);
            Toast.makeText(this, "jlksdlsd", Toast.LENGTH_SHORT).show();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
