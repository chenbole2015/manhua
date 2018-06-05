package com.gn.cartoon.ui.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gn.cartoon.AppConfig;
import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected int setLayout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {

      getWindow().getDecorView().postDelayed(new Runnable() {
          @Override
          public void run() {
              startActivity(new Intent(mContext,LoginActivity.class));
              finish();
          }
      }, AppConfig.SPLASH_TIME);
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }
}
