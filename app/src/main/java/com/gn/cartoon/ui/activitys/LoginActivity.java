package com.gn.cartoon.ui.activitys;

import android.Manifest;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.utils.PermissionUtils;

import butterknife.BindView;
import butterknife.OnClick;

import static android.Manifest.permission.READ_CONTACTS;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.email)
    AutoCompleteTextView mEmailView;
    @BindView(R.id.password)
    EditText mPasswordView;

    @Override
    protected int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        setImageViewVisity(View.INVISIBLE);
        setTextViewContent(getString(R.string.title_login), null);
        PermissionUtils.requestPermissions(mContext,0,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},null);
    }

    @OnClick({R.id.dm_login_btn, R.id.dm_login_register, R.id.dm_login_find_pwd, R.id
            .dm_login_qq_login, R.id.dm_login_wechat_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dm_login_btn:
                startActivity(new Intent(mContext,MainActivity.class));
                finish();
                break;
            case R.id.dm_login_register:
                startActivity(new Intent(mContext,RegisterActivity.class));
                break;
            case R.id.dm_login_find_pwd:
                startActivity(new Intent(mContext,FindPwdActivity.class));
                break;
            case R.id.dm_login_qq_login:
                showToast("QQ登录");
                break;
            case R.id.dm_login_wechat_login:
                showToast("微信登录");
                break;
        }
    }


}

