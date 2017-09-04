package com.wangchang.daggerandroid.di.component;


import com.wangchang.daggerandroid.MyApplication;
import com.wangchang.daggerandroid.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/4.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
   void inject(MyApplication myApplication);
}
