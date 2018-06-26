package com.gn.cartoon.ui.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.TransationDetailAdapter;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.TransationDetailBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/6/8.
 */

public class TransationDetailFragment extends BaseFragment {
    public static final String TRANSATION_KEY="transation_key";


    @BindView(R.id.mine_attention_recycler_view)
    RecyclerView mRecyclerView;

    private boolean isPay=false;


    private TransationDetailAdapter mTransationDetailAdapter;
    private List<TransationDetailBean> mTransationDetailBeans=new ArrayList<>();
    @Override
    protected int setContentLayout() {
        return R.layout.fragment_mine_attention_layout;
    }

    @Override
    protected void init() {
        Bundle argumentsTemp = getArguments();
        if(argumentsTemp!=null)
        isPay= argumentsTemp.getBoolean(TRANSATION_KEY,false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mTransationDetailBeans.add(new TransationDetailBean("2018-03-14 12:12:03",200,"支付宝充值","购买《一人之下》第234话\n东山再起","dsn2018020145242222"));
        mTransationDetailBeans.add(new TransationDetailBean("2018-03-14 12:12:03",400,"微信充值","购买《一人之下》第234话\n东山再起","dsn2018020145242222"));
        mTransationDetailBeans.add(new TransationDetailBean("2018-03-14 12:12:03",5,"支付宝充值","购买《一人之下》第234话\n东山再起","dsn2018020145242222"));
        mTransationDetailBeans.add(new TransationDetailBean("2018-03-14 12:12:03",700,"微信充值","购买《一人之下》第234话\n东山再起","dsn2018020145242222"));
        mRecyclerView.setAdapter(mTransationDetailAdapter=new TransationDetailAdapter(mTransationDetailBeans,isPay));
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }
}
