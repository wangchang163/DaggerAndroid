package com.wangchang.daggerandroid.ui;

import com.wangchang.daggerandroid.di.PerActivity;

/**
 * Created by Administrator on 2017/9/4.
 */

@PerActivity
public interface BasePresenter {
    void showMsg();
}
