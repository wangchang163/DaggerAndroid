package com.wangchang.daggerandroid.di.component;

import com.wangchang.daggerandroid.di.module.ApplicationModule;
import com.wangchang.daggerandroid.di.module.ServiceModule;
import com.wangchang.daggerandroid.service.MyService;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/4.
 */
@Component(modules = ServiceModule.class)
public interface ServiceComponent {
    void inject(MyService myService);
}
