package com.gn.cartoon.ui.activitys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.flyco.tablayout.SlidingTabLayout;
import com.gn.cartoon.R;
import com.gn.cartoon.adapter.HomeFocusPageAdapter;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.ui.fragments.HomeFocusFragment;
import com.gn.cartoon.ui.fragments.MineFeedBackInfoFragment;
import com.gn.cartoon.ui.fragments.MineFeedBackSubmitFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeFocusActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    public static final String SELECT_INDEX="SELECT_INDEX";

    @BindView(R.id.home_focus_view_pager)
    ViewPager mViewPager;

    @BindView(R.id.home_focus_one)
    TextView mTextViewFocus;


    @BindView(R.id.home_focus_two)
    TextView mTextViewHot;

    private ArrayList mArrayList = new ArrayList<Fragment>();

    @Override
    protected int setLayout() {
        return R.layout.activity_home_focus;
    }

    @Override
    protected void init() {
        mArrayList.add(new HomeFocusFragment());
        mArrayList.add(new HomeFocusFragment());
        mViewPager.setAdapter(new HomeFocusPageAdapter(getSupportFragmentManager(), mArrayList));
        mViewPager.addOnPageChangeListener(this);
        if(getIntent().getIntExtra(SELECT_INDEX,0)==0){
            mTextViewFocus.setSelected(true);
        }else{
            mTextViewHot.setSelected(true);
            mViewPager.setCurrentItem(1);
        }
    }

    @OnClick({R.id.home_focus_two, R.id.home_focus_one})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_focus_one:
                changeTitlebg(true);
                mViewPager.setCurrentItem(0);
                break;
            case R.id.home_focus_two:
                changeTitlebg(false);
                mViewPager.setCurrentItem(1);
                break;
        }
    }

    private void changeTitlebg(boolean isFocus){
            mTextViewHot.setSelected(!isFocus);
            mTextViewFocus.setSelected(isFocus);
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        changeTitlebg(position==0);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
