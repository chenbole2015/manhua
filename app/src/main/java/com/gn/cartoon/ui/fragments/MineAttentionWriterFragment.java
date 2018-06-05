package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineAttentionArtAdapter;
import com.gn.cartoon.adapter.MineAttentionWriterAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.MineAttentionArtBean;
import com.gn.cartoon.bean.MineAttentionWriterBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/16.
 */

public class MineAttentionWriterFragment extends BaseFragment {
    @BindView(R.id.mine_attention_recycler_view)
    RecyclerView mRecyclerView;

    private List<MineAttentionWriterBean> mMineAttentionWriterBeans=new ArrayList<>();
    private MineAttentionWriterAdapter mMineAttentionWriterAdapter;

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_mine_attention_layout;
    }

    @Override
    protected void init() {
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mMineAttentionWriterBeans.add(new MineAttentionWriterBean("http://img.taopic.com/uploads/allimg/140804/240388-140P40P33417.jpg","今晚打老虎","人真信息：漫画代表，代表作《狮子王》"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mMineAttentionWriterAdapter=new MineAttentionWriterAdapter(mMineAttentionWriterBeans);
        mRecyclerView.setAdapter(mMineAttentionWriterAdapter);
    }


    @Override
    public boolean getUseTitle() {
        return false;
    }
}
