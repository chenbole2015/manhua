package com.gn.cartoon.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;

public class FindPwdActivity extends BaseActivity {

    @Override
    protected int setLayout() {
        return R.layout.activity_find_pwd;
    }

    @Override
    protected void init() {
        setTextViewContent(getString(R.string.title_find_pws),null);
    }

}
