package com.wangchang.daggerandroid.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wangchang.daggerandroid.R;
import com.wangchang.daggerandroid.ui.base.BaseActivity;
import com.wangchang.daggerandroid.utils.Test;
import com.wangchang.daggerandroid.utils.Test2;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<MainPresenter> implements MainView{

    @Inject
    Test test;
    @Inject
    Test2 test2;
    private TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        initView();
    }

    private void initView() {
        presenter.sayHello();
        text= (TextView) findViewById(R.id.tv_text);
        text.setText(test.getStr());
        text2= (TextView) findViewById(R.id.tv_text2);
        text2.setText(test2.getStr());
        findViewById(R.id.btn_load).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoading();
            }
        });

    }

    @Override
    public void showMsg() {
        Toast.makeText(this,"测试mvp中Dagger的使用",Toast.LENGTH_SHORT).show();
    }

}
