package com.gn.cartoon.base;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by FYJ on 2018/6/7.
 */

public abstract class BaseDialog extends Dialog {
    public Context mContext;

    private View mItemView;

    public BaseDialog(@NonNull Context context) {
        super(context);
        this.mContext=context;
        mItemView= LayoutInflater.from(mContext).inflate(getContentLayout(),null,false);
        setContentView(mItemView);
        initView(mItemView);
    }

    public  abstract  int getContentLayout();

    public abstract  void initView(View view);
}
