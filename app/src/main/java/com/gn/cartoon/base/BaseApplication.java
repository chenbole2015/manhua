package com.gn.cartoon.base;

import android.app.Application;
import android.content.Context;

import com.gn.cartoon.AppConfig;
import com.gn.cartoon.utils.CrashHandler;
import com.gn.cartoon.utils.OkGoConfig;


/**
 * Created by FYJ on 2018/2/23.
 */

public class BaseApplication extends Application {



    private Context mContext;

    private static BaseApplication mBaseApplication;

    public Context getContext() {
        return mContext;
    }

    public static BaseApplication getInstance(){
        return  mBaseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
        mBaseApplication=this;
        OkGoConfig.init(this);
        if(!AppConfig.isShowLog){
            CrashHandler crashHandler = CrashHandler.getInstance();
            crashHandler.init(getApplicationContext());
        }
    }
}
