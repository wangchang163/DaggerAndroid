package com.wangchang.daggerandroid.ui.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wangchang.daggerandroid.di.component.ActivityComponent;
import com.wangchang.daggerandroid.di.component.DaggerActivityComponent;
import com.wangchang.daggerandroid.di.module.ActivityModule;
import com.wangchang.daggerandroid.utils.CommonUtils;


/**
 * Created by Administrator on 2017/9/4.
 */

public class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView{

    private ActivityComponent mActivityComponent;
    private ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent= DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();
    }
    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

    @Override
    public void showLoading() {
        hideLoading();
        mProgressDialog = CommonUtils.showLoadingDialog(this);
    }

    @Override
    public void hideLoading() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.cancel();
        }
    }
}
