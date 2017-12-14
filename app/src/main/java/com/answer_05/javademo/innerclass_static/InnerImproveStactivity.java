package com.answer_05.javademo.innerclass_static;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.answer_05.javademo.R;

/**
 * @creator : answer_05
 * @create-time : 2017/11/21 上午08：10
 * @description :非静态内部类会持有外部类实例的引用，如果非静态内部类的实例是静态的，就会间接的长期维持着外部类的引用，阻止被系统回收
 *
 */
public class InnerImproveStactivity extends AppCompatActivity {

    private static Object ininerClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_stactivity);

    }

    static class InnerClass{

    }

    public void startInnerClass(){

        ininerClass = new InnerClass();

    }

    /**
     * 创建了InnerClass的静态实例引用
     * @param view
     */
    public void createInner(View view) {

        startInnerClass();

    }
}
