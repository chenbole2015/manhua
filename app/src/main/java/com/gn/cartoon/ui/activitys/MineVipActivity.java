package com.gn.cartoon.ui.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineVipAdapter;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.bean.MineVipBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MineVipActivity extends BaseActivity implements View.OnClickListener,
        BaseQuickAdapter.OnItemChildClickListener {
    @BindView(R.id.mine_vip_recycler_view)
    RecyclerView mRecyclerView;

    @BindView(R.id.mine_vip_spinner_pay)
    Spinner mSpinner;

    @BindView(R.id.mine_vip_pay_total)
    TextView mTextViewPayTotal;

    private MineVipAdapter mMineVipAdapter;

    private List<MineVipBean> mMineVipBeans=new ArrayList<>();

    @Override
    protected int setLayout() {
        return R.layout.activity_mine_vip;
    }

    @Override
    protected void init() {
        setTextViewContent(getString(R.string.mine_vip_title), null);
        setTextViewContentSub(getString(R.string.mine_vip_sub_title), this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager
                .HORIZONTAL, false));
        ArrayAdapter arrayAdapterTemp=new ArrayAdapter(mContext,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.minePayTitle));
        mSpinner.setAdapter(arrayAdapterTemp);
        mMineVipBeans.add(new MineVipBean(1,1,5,"送300看币\n1张月票",true,10));
        mMineVipBeans.add(new MineVipBean(0,1,18,"送300看币\n1张月票",false,20));
        mMineVipBeans.add(new MineVipBean(0,1,30,"送300看币\n1张月票",false,120));
        mMineVipBeans.add(new MineVipBean(0,1,100,"送300看币\n1张月票",false,200));
        mMineVipAdapter=new MineVipAdapter(mMineVipBeans);
        mRecyclerView.setAdapter(mMineVipAdapter);
        mMineVipAdapter.setOnItemChildClickListener(this);
    }


    @OnClick({R.id.mine_vip_pay_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mine_vip_pay_tv:
                startActivity(new Intent(mContext,PayFinishActivity.class));
                break;
            case R.id.title_content_sub:
                startActivity(new Intent(mContext,TransactionDetailActivity.class));
                break;
        }
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        for(int i=0;i<mMineVipBeans.size();i++){
            if(position==i){
                mMineVipBeans.get(position).setSelect(true);
                mTextViewPayTotal.setText("实付："+mMineVipBeans.get(position).getMoney()+"元");
            }else{
                mMineVipBeans.get(i).setSelect(false);
            }
        }
        mMineVipAdapter.notifyDataSetChanged();
    }
}
