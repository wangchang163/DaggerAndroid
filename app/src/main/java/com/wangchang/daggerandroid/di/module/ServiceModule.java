package com.wangchang.daggerandroid.di.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by Administrator on 2017/9/4.
 */
@Module
public class ServiceModule {
    private Service service;

    public ServiceModule(Service service) {
        this.service = service;
    }
}
