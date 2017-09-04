package com.wangchang.daggerandroid.utils;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/4.
 */

public class Test {
    private String str;

    @Inject
    public Test() {
        str = "测试Dagger";
    }

    public String getStr() {
        return str;
    }

}
