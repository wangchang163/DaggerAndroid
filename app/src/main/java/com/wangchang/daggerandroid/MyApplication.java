package com.wangchang.daggerandroid;

import android.app.Application;

import com.wangchang.daggerandroid.di.component.ApplicationComponent;
import com.wangchang.daggerandroid.di.component.DaggerApplicationComponent;
import com.wangchang.daggerandroid.di.module.ApplicationModule;


/**
 * Created by Administrator on 2017/9/4.
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent= DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

    }
    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
