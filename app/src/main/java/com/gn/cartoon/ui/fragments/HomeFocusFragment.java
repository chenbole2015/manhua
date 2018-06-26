package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.CommunityListAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.CommunityListBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/15.
 */

public class CommunityFragment extends BaseFragment {
    @BindView(R.id.community_list_recycler_view)
    RecyclerView mRecyclerView;

    private List<CommunityListBean> mCommunityListBeans=new ArrayList<>();
    private CommunityListAdapter mCommunityListAdapter;

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_community_layout;
    }

    @Override
    protected void init() {
        List<String> stringsTemp=new ArrayList<>();
        stringsTemp.add("http://pic.58pic.com/58pic/15/14/97/23G58PICtVh_1024.jpg");
        stringsTemp.add("http://image.tianjimedia.com/uploadImages/2014/348/58/69HYFVT5E6TE.jpg");
        stringsTemp.add("http://image.tianjimedia.com/uploadImages/2014/064/5K0GO577YBSU.jpg");
        stringsTemp.add("http://pic.58pic.com/58pic/15/36/75/95458PICiSm_1024.jpg");
        mCommunityListBeans.add(new CommunityListBean("http://pic4.nipic.com/20091113/2847083_105626034638_2.jpg","今晚打老虎",1,"紧外你凯撒大帝很快就打法",stringsTemp,"21小时前","2342","23"));
        mCommunityListBeans.add(new CommunityListBean("http://pic4.nipic.com/20091113/2847083_105626034638_2.jpg","今晚打老虎",1,"紧外你凯撒大帝很快就打法",stringsTemp,"21小时前","2342","23"));
        mCommunityListBeans.add(new CommunityListBean("http://pic4.nipic.com/20091113/2847083_105626034638_2.jpg","今晚打老虎",1,"紧外你凯撒大帝很快就打法",stringsTemp,"21小时前","2342","23"));
        mCommunityListBeans.add(new CommunityListBean("http://pic4.nipic.com/20091113/2847083_105626034638_2.jpg","今晚打老虎",1,"紧外你凯撒大帝很快就打法",stringsTemp,"21小时前","2342","23"));
        mCommunityListBeans.add(new CommunityListBean("http://pic4.nipic.com/20091113/2847083_105626034638_2.jpg","今晚打老虎",1,"紧外你凯撒大帝很快就打法",stringsTemp,"21小时前","2342","23"));
        setTextViewContent(getString(R.string.title_community),null);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mCommunityListAdapter=new CommunityListAdapter(mCommunityListBeans);
        mRecyclerView.setAdapter(mCommunityListAdapter);
    }
}
