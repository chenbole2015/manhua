package com.gn.cartoon.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.gn.cartoon.R;
import com.gn.cartoon.utils.ActivityCollector;
import com.gn.cartoon.utils.EventBusUtils;
import com.gn.cartoon.utils.OkGoConfig;
import com.gn.cartoon.utils.StatusBarUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by FYJ on 2018/2/23.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private ImageView mImageView;

    private TextView mTextViewContent;

    private TextView mTextViewContentSub;

    public Context mContext;


    protected abstract int setLayout();

    protected abstract void init();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUseTitle();
        mContext=this;
        ButterKnife.bind(this);
        StatusBarUtils.statusBarLightMode(this,false);
        ActivityCollector.addActivity(this);
        init();
    }

    /**
     *
     * @return true 使用标题   false  不使用标题
     */
    public boolean getUseTitle() {
       return true;
    }

    private void setUseTitle(){
        if(getUseTitle()){
            LinearLayout linearLayoutTemp =new LinearLayout(this);
            linearLayoutTemp.setOrientation(LinearLayout.VERTICAL);
            linearLayoutTemp.setBackgroundColor(getResources().getColor(R.color.split_color));
            linearLayoutTemp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
            View viewTemp = getView(R.layout.base_title_layout);
            mImageView=viewTemp.findViewById(R.id.title_back);
            mTextViewContent=viewTemp.findViewById(R.id.title_content);
            mTextViewContentSub=viewTemp.findViewById(R.id.title_content_sub);
            linearLayoutTemp.addView(viewTemp);
            linearLayoutTemp.addView(getView(setLayout()));
            setContentView(linearLayoutTemp);
            if(mImageView!=null)
            mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }else{
            setContentView(setLayout());
        }
   }

   private View getView(int layoutId){
        View viewTemp= LayoutInflater.from(this).inflate(layoutId,null,false);
        return viewTemp;
   }

    protected void showToast(int msgId) {
        Toast.makeText(this, msgId, Toast.LENGTH_SHORT).show();
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


    public void setTextViewContent(String content, View.OnClickListener clickListenerArp){
       if(mTextViewContent!=null){
           mTextViewContent.setText(content+"");
           if(clickListenerArp!=null){
               mTextViewContent.setOnClickListener(clickListenerArp);
           }
       }
    }

    public void setTextViewContentSub(String content, View.OnClickListener clickListenerArp){
       if(mTextViewContentSub!=null){
           mTextViewContentSub.setVisibility(View.VISIBLE);
           mTextViewContentSub.setText(content+"");
           if(clickListenerArp!=null){
               mTextViewContentSub.setOnClickListener(clickListenerArp);
           }
       }
    }

    public void setImageViewVisity(int viewVisityArp){
        mImageView.setVisibility(viewVisityArp);
        if(viewVisityArp!=View.VISIBLE)
        mImageView.setOnClickListener(null);
    }

    public void setImageViewVisity(View.OnClickListener onClickListenerArp){
        mImageView.setOnClickListener(onClickListenerArp);
    }






    @Override
    protected void onDestroy() {
        super.onDestroy();
        OkGoConfig.cancelCall(this);
        EventBusUtils.unRegister(this);
        ActivityCollector.removeActivity(this);
    }
}
