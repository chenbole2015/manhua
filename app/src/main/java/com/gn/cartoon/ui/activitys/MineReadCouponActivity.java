package com.gn.cartoon.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineReadCouponAdapter;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.bean.MineReadCouponBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MineReadCouponActivity extends BaseActivity {
    @BindView(R.id.mine_read_coupon_recycler)
    RecyclerView mRecyclerView;

    private List<MineReadCouponBean> mMineReadCouponBeans = new ArrayList<>();
    private MineReadCouponAdapter mMineReadCouponAdapter;

    @Override
    protected int setLayout() {
        return R.layout.activity_mine_read_coupon;
    }

    @Override
    protected void init() {
        mMineReadCouponBeans.add(new MineReadCouponBean("消费一张优惠卷 购买了《狮子王》第100话","2018-06-15 20：12"));
        mMineReadCouponBeans.add(new MineReadCouponBean("消费一张优惠卷 购买了《狮子王》第100话","2018-06-15 20：12"));
        mMineReadCouponBeans.add(new MineReadCouponBean("消费一张优惠卷 购买了《狮子王》第100话","2018-06-15 20：12"));
        mMineReadCouponBeans.add(new MineReadCouponBean("消费一张优惠卷 购买了《狮子王》第100话","2018-06-15 20：12"));
        mMineReadCouponBeans.add(new MineReadCouponBean("消费一张优惠卷 购买了《狮子王》第100话","2018-06-15 20：12"));
        mMineReadCouponBeans.add(new MineReadCouponBean("消费一张优惠卷 购买了《狮子王》第100话","2018-06-15 20：12"));
        setTextViewContent(getString(R.string.mine_read_coupon_title), null);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mMineReadCouponAdapter = new MineReadCouponAdapter(mMineReadCouponBeans);
        mRecyclerView.setAdapter(mMineReadCouponAdapter);
    }

}
