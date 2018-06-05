package com.gn.cartoon.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.gn.cartoon.R;
import com.gn.cartoon.utils.EventBusUtils;


import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    protected View mView;

    public Context mContext;

    private ImageView mImageView;

    private TextView mTextViewContent;

    private TextView mTextViewContentSub;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        mView = setUseTitle();
        return mView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity();
        ButterKnife.bind(this, view);
        init();
    }


    /**
     * @return true 使用标题   false  不使用标题
     */
    public boolean getUseTitle() {
        return true;
    }

    private View setUseTitle() {
        if (getUseTitle()) {
            LinearLayout linearLayoutTemp = new LinearLayout(getActivity());
            linearLayoutTemp.setOrientation(LinearLayout.VERTICAL);
            linearLayoutTemp.setBackgroundColor(getResources().getColor(R.color.split_color));
            linearLayoutTemp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout
                    .LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            View viewTemp = getView(R.layout.base_title_layout);
            mImageView = viewTemp.findViewById(R.id.title_back);
            mTextViewContent = viewTemp.findViewById(R.id.title_content);
            mTextViewContentSub = viewTemp.findViewById(R.id.title_content_sub);
            mImageView.setVisibility(View.INVISIBLE);
            linearLayoutTemp.addView(viewTemp);
            linearLayoutTemp.addView(getView(setContentLayout()));
           return linearLayoutTemp;
        } else {
           return getView(setContentLayout());
        }
    }
    private View getView(int layoutId){
        View viewTemp= LayoutInflater.from(getActivity()).inflate(layoutId,null,false);
        return viewTemp;
    }

    protected abstract int setContentLayout();

    protected abstract void init();

    protected void showToast(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    protected void showToast(int msgId) {
        Toast.makeText(getContext(), msgId, Toast.LENGTH_SHORT).show();
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


    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBusUtils.unRegister(this);
    }


    //底部弹出
    protected void slideBottomLogin(Intent intentArp) {
        startActivity(intentArp);
        getActivity().overridePendingTransition(R.anim.login_activity_in, R.anim.login_activity_out);
    }
}
