package com.gn.cartoon.ui.fragments;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineMenuAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.MineMeanBean;
import com.gn.cartoon.ui.activitys.AttentionActivity;
import com.gn.cartoon.ui.activitys.MineAuthorActivity;
import com.gn.cartoon.ui.activitys.MineFeedBackActivity;
import com.gn.cartoon.ui.activitys.MineReadCouponActivity;
import com.gn.cartoon.ui.activitys.SettingActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineFragment extends BaseFragment implements BaseQuickAdapter
        .OnItemChildClickListener {

    @BindView(R.id.recycler_view_mine)
    RecyclerView mRecyclerView;

    private MineMenuAdapter mMineMenuAdapter;
    private List<MineMeanBean> mMineMeanBeans = new ArrayList<>();

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_mine_layout;
    }

    @Override
    protected void init() {
        initMenu();
    }

    private void initMenu() {
        String[] stringArrayTemp = getResources().getStringArray(R.array.mineMenu);
        TypedArray typedArrayTemp = getResources().obtainTypedArray(R.array.mineMenuIcon);
        for (int iTemp = 0; iTemp < stringArrayTemp.length; iTemp++) {
            mMineMeanBeans.add(new MineMeanBean(typedArrayTemp.getResourceId(iTemp, 0),
                    stringArrayTemp[iTemp]));
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mMineMenuAdapter = new MineMenuAdapter(mMineMeanBeans);
        mMineMenuAdapter.setOnItemChildClickListener(this);
        mRecyclerView.setAdapter(mMineMenuAdapter);
    }

    @OnClick({R.id.mine_read_coupon, R.id.mine_read_money, R.id.mine_read_mouth})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mine_read_coupon: //阅读券
                startActivity(new Intent(mContext, MineReadCouponActivity.class));
                break;
            case R.id.mine_read_money: //看漫币
                break;
            case R.id.mine_read_mouth: //月票
                break;
        }
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        switch (position) {
            case 0:   //成为作者
                startActivity(new Intent(mContext, MineAuthorActivity.class));
                break;
            case 1:  //成为vip会员
                break;
            case 2: //我的消息
                break;
            case 3: //我的关注
                startActivity(new Intent(mContext, AttentionActivity.class));
                break;
            case 4: //意见反馈
                startActivity(new Intent(mContext, MineFeedBackActivity.class));
                break;
            case 5: //我的设置
                startActivity(new Intent(mContext, SettingActivity.class));
                break;
        }
    }
}
