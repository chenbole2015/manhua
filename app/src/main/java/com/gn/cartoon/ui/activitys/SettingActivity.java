package com.gn.cartoon.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;

public class SettingActivity extends BaseActivity {

    @Override
    protected int setLayout() {
        return R.layout.activity_setting;
    }

    @Override
    protected void init() {
        setTextViewContent(getString(R.string.setting_title),null);

    }


}
