package com.gn.cartoon.ui.activitys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.ui.fragments.MineAttentionArtFragment;
import com.gn.cartoon.ui.fragments.MineAttentionWriterFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class AttentionActivity extends BaseActivity {
    @BindView(R.id.attention_view_pager)
    ViewPager mViewPager;

    @BindView(R.id.attention_title)
    SlidingTabLayout mSlidingTabLayout;

    private ArrayList mArrayList= new ArrayList<Fragment>();

    @Override
    protected int setLayout() {
        return R.layout.activity_attention;
    }

    @Override
    protected void init() {
       setTextViewContent(getString(R.string.attention_title),null);
        mArrayList.add(new MineAttentionArtFragment());
        mArrayList.add(new MineAttentionWriterFragment());
        mSlidingTabLayout.setViewPager(mViewPager,getResources().getStringArray(R.array.attentionTitle), (FragmentActivity) mContext,mArrayList);
    }

}
