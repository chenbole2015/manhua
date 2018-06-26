package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.CommunityListAdapter;
import com.gn.cartoon.adapter.HomeFocusAdapter;
import com.gn.cartoon.adapter.HomeHotAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.CommunityListBean;
import com.gn.cartoon.bean.HomeFocusBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/15.
 */

public class HomeFocusFragment extends BaseFragment {
    @BindView(R.id.home_focus_list_recycler_view)
    RecyclerView mRecyclerView;

    private List<HomeFocusBean> mHomeFocusBeans=new ArrayList<>();
    private HomeFocusAdapter mHomeFocusAdapter;

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_home_focus_layout;
    }

    @Override
    protected void init() {
        mHomeFocusBeans.add(new HomeFocusBean("今晚吃鸡，大吉大利","第400话","15566","http://pic.58pic.com/58pic/15/14/97/23G58PICtVh_1024.jpg"));
        mHomeFocusBeans.add(new HomeFocusBean("今晚吃鸡，大吉大利","第400话","15566","http://image.tianjimedia.com/uploadImages/2014/348/58/69HYFVT5E6TE.jpg"));
        mHomeFocusBeans.add(new HomeFocusBean("今晚吃鸡，大吉大利","第400话","15566","http://pic.58pic.com/58pic/15/14/97/23G58PICtVh_1024.jpg"));
        mHomeFocusBeans.add(new HomeFocusBean("今晚吃鸡，大吉大利","第400话","15566","http://image.tianjimedia.com/uploadImages/2014/064/5K0GO577YBSU.jpg"));
        mHomeFocusBeans.add(new HomeFocusBean("今晚吃鸡，大吉大利","第400话","15566","http://pic.58pic.com/58pic/15/36/75/95458PICiSm_1024.jpg"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mHomeFocusAdapter=new HomeFocusAdapter(mHomeFocusBeans);
        mRecyclerView.setAdapter(mHomeFocusAdapter);
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }
}
