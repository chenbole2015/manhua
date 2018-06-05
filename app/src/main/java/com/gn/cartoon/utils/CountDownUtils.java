package com.gn.cartoon.utils;


import android.graphics.Color;
import android.os.CountDownTimer;
import android.widget.TextView;

public class CountDownUtils extends CountDownTimer {

    private TextView mText;

    public CountDownUtils(TextView text, long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
        mText = text;
    }


    @Override
    public void onTick(long millisUntilFinished) {
        mText.setClickable(false);
        mText.setText(millisUntilFinished / 1000 + "秒后可重新发送");
        mText.setTextColor(Color.rgb(249, 43, 53));
    }

    @Override
    public void onFinish() {
        mText.setClickable(true);
        mText.setText("重新获取验证码");
        mText.setTextColor(Color.rgb(112, 112, 115));
    }
}
