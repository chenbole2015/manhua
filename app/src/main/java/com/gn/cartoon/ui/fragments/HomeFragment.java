package com.gn.cartoon.ui.fragments;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.gn.cartoon.AppConfig;
import com.gn.cartoon.R;
import com.gn.cartoon.adapter.HomeHotAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.HomeHotBooksBean;
import com.gn.cartoon.utils.DividerGridItemDecoration;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/15.
 */

public class HomeFragment extends BaseFragment {
    @BindView(R.id.fragment_dm_banner)
    Banner mBanner;
    private List<String> mBannerUrl=new ArrayList<>();

    @BindView(R.id.fragment_dm_recycler_hot)
    RecyclerView mRecyclerViewHot;
    private HomeHotAdapter mHomeHotAdapter;
    private List<HomeHotBooksBean> mHomeHotBooksBeans=new ArrayList<>();

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_home_layout;
    }

    @Override
    protected void init() {
        setTextViewContent(getString(R.string.title_home),null);
        initBanner();
        initHot();
    }

    private void initHot() {
        mHomeHotBooksBeans.add(new HomeHotBooksBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类"));
        mHomeHotBooksBeans.add(new HomeHotBooksBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类"));
        mHomeHotBooksBeans.add(new HomeHotBooksBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类"));
        mHomeHotBooksBeans.add(new HomeHotBooksBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","狮子王","狮子勇救人类"));
        mRecyclerViewHot.setLayoutManager(new GridLayoutManager(mContext,2));
        mRecyclerViewHot.addItemDecoration(new DividerGridItemDecoration(mContext));
        mHomeHotAdapter=new HomeHotAdapter(mHomeHotBooksBeans);
        mRecyclerViewHot.setAdapter(mHomeHotAdapter);

    }

    private void initBanner() {
        mBannerUrl.add("https://goss4.vcg.com/creative/vcg/800/new/VCG41N956411558.jpg");
        mBannerUrl.add("https://goss3.vcg.com/creative/vcg/800/new/VCG41N952913262.jpg");
        mBannerUrl.add("https://goss4.vcg.com/creative/vcg/800/new/VCG41N953818692.jpg");
        mBannerUrl.add("https://goss2.vcg.com/creative/vcg/800/new/VCG41N957382998.jpg");
        mBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        });
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        mBanner.setDelayTime(AppConfig.BANNER_TIME);
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        mBanner.setImages(mBannerUrl);
        mBanner.start();
    }

    @Override
    public void onResume() {
        super.onResume();
        mBanner.startAutoPlay();
    }

    @Override
    public void onPause() {
        super.onPause();
        mBanner.stopAutoPlay();
    }
}
