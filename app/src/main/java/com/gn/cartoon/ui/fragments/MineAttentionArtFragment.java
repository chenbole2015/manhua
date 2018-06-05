package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineAttentionArtAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.MineAttentionArtBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/16.
 */

public class MineAttentionArtFragment extends BaseFragment {
    @BindView(R.id.mine_attention_recycler_view)
    RecyclerView mRecyclerView;

    private List<MineAttentionArtBean> mMineAttentionBeans=new ArrayList<>();
    private MineAttentionArtAdapter mBooksHistoryAdapter;

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_mine_attention_layout;
    }

    @Override
    protected void init() {
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mMineAttentionBeans.add(new MineAttentionArtBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类","更新至：第200话 我与人类的故事"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mBooksHistoryAdapter=new MineAttentionArtAdapter(mMineAttentionBeans);
        mRecyclerView.setAdapter(mBooksHistoryAdapter);
    }


    @Override
    public boolean getUseTitle() {
        return false;
    }
}
