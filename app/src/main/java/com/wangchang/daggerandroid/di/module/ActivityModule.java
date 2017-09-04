package com.wangchang.daggerandroid.di.module;

import android.support.v7.app.AppCompatActivity;

import com.wangchang.daggerandroid.ui.BaseView;
import com.wangchang.daggerandroid.ui.MainView;
import com.wangchang.daggerandroid.utils.Test2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/4.
 */
@Module
public class ActivityModule {

    @Provides
    Test2 provideTest() {
        return new Test2();
    }
    private  BaseView view;

    public ActivityModule(BaseView view){
        this.view = view ;
    }

    @Provides
    BaseView provideILogView(){
        return view ;
    }

    private AppCompatActivity activity;

   }