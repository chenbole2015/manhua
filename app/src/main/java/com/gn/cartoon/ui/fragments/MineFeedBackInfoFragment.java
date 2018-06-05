package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineFeedBackInfoAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.MineFeedBackInfoBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/17.
 */

public class MineFeedBackInfoFragment extends BaseFragment {
    @BindView(R.id.mine_feed_back_recycler_view)
    RecyclerView mRecyclerView;


    private MineFeedBackInfoAdapter mMineFeedBackInfoAdapters;

    private List<MineFeedBackInfoBean> mMineFeedBackInfoBeans=new ArrayList<>();


    @Override
    protected int setContentLayout() {
        return R.layout.fragment_mine_feed_back_2_layout;
    }


    @Override
    public boolean getUseTitle() {
        return false;
    }

    @Override
    protected void init() {
        mMineFeedBackInfoBeans.add(new MineFeedBackInfoBean("反馈内容：","有些内容反馈没有信息.","2018-06-01"));
        mMineFeedBackInfoBeans.add(new MineFeedBackInfoBean("反馈内容：","有些内容反馈没有信息.","2018-06-01"));
        mMineFeedBackInfoBeans.add(new MineFeedBackInfoBean("反馈内容：","有些内容反馈没有信息.","2018-06-01"));
        mMineFeedBackInfoBeans.add(new MineFeedBackInfoBean("反馈内容：","有些内容反馈没有信息.","2018-06-01"));
        mMineFeedBackInfoBeans.add(new MineFeedBackInfoBean("反馈内容：","有些内容反馈没有信息.","2018-06-01"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mMineFeedBackInfoAdapters=new MineFeedBackInfoAdapter(mMineFeedBackInfoBeans);
        mRecyclerView.setAdapter(mMineFeedBackInfoAdapters);
    }
}
