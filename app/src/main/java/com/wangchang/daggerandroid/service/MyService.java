package com.wangchang.daggerandroid.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.wangchang.daggerandroid.MyApplication;
import com.wangchang.daggerandroid.di.component.DaggerServiceComponent;
import com.wangchang.daggerandroid.di.component.ServiceComponent;
import com.wangchang.daggerandroid.di.module.ApplicationModule;

public class MyService extends Service {

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ServiceComponent component= DaggerServiceComponent.builder()
                .build();
        component.inject(this);
    }
}
