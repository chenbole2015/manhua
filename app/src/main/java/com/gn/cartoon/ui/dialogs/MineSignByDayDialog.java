package com.gn.cartoon.ui.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.MineSignAdapter;
import com.gn.cartoon.base.BaseDialog;
import com.gn.cartoon.bean.MineSignBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FYJ on 2018/6/7.
 */

public class MineSignByDayDialog extends BaseDialog {
    private RecyclerView mRecyclerView;


    public MineSignByDayDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    public int getContentLayout() {
        return R.layout.item_dm_mine_sign_dialog;
    }

    @Override
    public void initView(View view) {
        mRecyclerView=view.findViewById(R.id.item_dm_mine_sign_recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(mContext,4));
         List<MineSignBean> mMineSignBeans=new ArrayList<>();
        mMineSignBeans.add(new MineSignBean(1,true,"10看币"));
        mMineSignBeans.add(new MineSignBean(2,true,"13看币"));
        mMineSignBeans.add(new MineSignBean(3,true,"15看币"));
        mMineSignBeans.add(new MineSignBean(4,false,"16看币"));
        mMineSignBeans.add(new MineSignBean(5,false,"19看币"));
        mMineSignBeans.add(new MineSignBean(6,false,"30看币"));
        mMineSignBeans.add(new MineSignBean(7,false,"40看币(最多)"));
        mRecyclerView.setAdapter(new MineSignAdapter(mMineSignBeans));
    }
}
