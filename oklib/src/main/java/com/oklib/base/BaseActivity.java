package com.oklib.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 创建时间：2017/3/11
 * 编写者：黄伟才
 * 功能描述：Activity基类，该类只做业务无关的抽象
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
        initVariable();
        initTitle();
        initView();
        initNet();
    }

    /**
     * 设置layout资源
     * @return
     */
    protected abstract int initLayoutId();

    /**
     * 初始化变量 ，通常intent传值处理
     * @return
     */
    protected abstract void initVariable();

    /**
     * 初始化标题
     * @return
     */
    protected abstract void initTitle();

    /**
     * 初始化视图控件
     * @return
     */
    protected abstract void initView();

    /**
     * 初始化网络操作
     * @return
     */
    protected abstract void initNet();


    /**
     * 通过Id得到view的实例
     * @param viewId
     * @param <T>
     * @return
     */
    protected <T> T findView(int viewId) {
        return (T) findViewById(viewId);
    }

}
