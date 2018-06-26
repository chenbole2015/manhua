package com.gn.cartoon.ui.activitys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flyco.tablayout.SlidingTabLayout;
import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.ui.fragments.MineFeedBackInfoFragment;
import com.gn.cartoon.ui.fragments.MineFeedBackSubmitFragment;
import com.gn.cartoon.ui.fragments.TransationDetailFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class TransactionDetailActivity extends BaseActivity {

    @BindView(R.id.feed_back_view_pager)
    ViewPager mViewPager;

    @BindView(R.id.feed_back_title)
    SlidingTabLayout mSlidingTabLayout;


    private ArrayList mArrayList = new ArrayList<Fragment>();

    @Override
    protected int setLayout() {
        return R.layout.activity_transaction_detail;
    }

    @Override
    protected void init() {
        setTextViewContent(getString(R.string.mine_vip_sub_title), null);
        TransationDetailFragment transationDetailFragmentTemp1 = new TransationDetailFragment();
        Bundle bundleTemp = new Bundle();
        bundleTemp.putBoolean(TransationDetailFragment.TRANSATION_KEY, true);
        transationDetailFragmentTemp1.setArguments(bundleTemp);
        mArrayList.add(transationDetailFragmentTemp1);
        mArrayList.add(new TransationDetailFragment());
        mSlidingTabLayout.setViewPager(mViewPager, getResources().getStringArray(R.array
                .payRecordTitle), (FragmentActivity) mContext, mArrayList);
    }

}
