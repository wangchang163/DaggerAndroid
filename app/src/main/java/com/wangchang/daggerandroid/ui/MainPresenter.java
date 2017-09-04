package com.wangchang.daggerandroid.ui;


import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/4.
 */

public class MainPresenter implements BasePresenter{

    private MainView view;
    @Inject
    public MainPresenter(BaseView mainView) {
        view= (MainView) mainView;
    }

    @Override
    public void showMsg() {
        view.showLoading();
      System.out.print("aaaa");
    }
}
