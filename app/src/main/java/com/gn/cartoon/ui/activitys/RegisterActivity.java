package com.gn.cartoon.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;

public class RegisterActivity extends BaseActivity {

    @Override
    protected int setLayout() {
        return R.layout.activity_register;
    }

    @Override
    protected void init() {
      setTextViewContent(getString(R.string.title_register),null);
    }


}
