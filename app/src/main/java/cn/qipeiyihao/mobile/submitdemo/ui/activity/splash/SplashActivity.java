package cn.qipeiyihao.mobile.submitdemo.ui.activity.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.qipeiyihao.mobile.submitdemo.R;
import cn.qipeiyihao.mobile.submitdemo.base.BaseActivity;
import cn.qipeiyihao.mobile.submitdemo.services.manager.AppManager;
import cn.qipeiyihao.mobile.submitdemo.ui.activity.main.MainActivity;

public class SplashActivity extends BaseActivity {

    @Override
    public void widgetClick(View v) {

    }



    @Override
    public void initParms(Bundle parms) {

    }

    @Override
    public View bindView() {
        return View.inflate(this,R.layout.activity_splash,null);
    }

    @Override
    public int bindLayout() {
        return 0;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void setListener() {

    }

    @Override
    public void doBusiness(Context mContext) {
        Intent mIntent = new Intent(SplashActivity.this, MainActivity.class);

        startActivity(mIntent);



    }
}
