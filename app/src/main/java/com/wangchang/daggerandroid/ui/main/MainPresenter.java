package com.wangchang.daggerandroid.ui.main;


import com.wangchang.daggerandroid.ui.base.BaseView;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/4.
 */

public class MainPresenter implements MainMvpPresenter {

    private MainView view;

    public MainPresenter(BaseView mainView) {
        view= (MainView) mainView;
    }

    @Override
    public void sayHello() {
       view.showMsg();
    }
}
