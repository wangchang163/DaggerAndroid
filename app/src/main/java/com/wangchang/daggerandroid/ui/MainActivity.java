package com.wangchang.daggerandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wangchang.daggerandroid.R;
import com.wangchang.daggerandroid.di.component.DaggerActivityComponent;
import com.wangchang.daggerandroid.di.module.ActivityModule;
import com.wangchang.daggerandroid.utils.Test;
import com.wangchang.daggerandroid.utils.Test2;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    Test test;
    @Inject
    Test2 test2;
    @Inject
    MainPresenter presenter;
    private TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder()
                .activityModule(new ActivityModule((BaseView) this))
                .build()
                .inject(this);
        initView();
    }

    private void initView() {
        presenter.showMsg();
        text= (TextView) findViewById(R.id.tv_text);
        text.setText(test.getStr());
        text2= (TextView) findViewById(R.id.tv_text2);
        text2.setText(test2.getStr());
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}