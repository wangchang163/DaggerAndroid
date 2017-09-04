package com.wangchang.daggerandroid.di.component;

import android.support.v7.app.AppCompatActivity;

import com.wangchang.daggerandroid.di.PerActivity;
import com.wangchang.daggerandroid.di.module.ActivityModule;
import com.wangchang.daggerandroid.ui.base.BaseActivity;
import com.wangchang.daggerandroid.ui.main.MainActivity;


import dagger.Component;

/**
 * Created by Administrator on 2017/9/4.
 */
@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
