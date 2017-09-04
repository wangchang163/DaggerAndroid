package com.wangchang.daggerandroid.di.module;


import com.wangchang.daggerandroid.ui.base.BaseView;
import com.wangchang.daggerandroid.ui.main.MainPresenter;
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
    MainPresenter provideMainPresenter(){
        return new MainPresenter(view);
    }
}
