package com.gn.cartoon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by FYJ on 2018/6/7.
 */

public class HomeFocusPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    public HomeFocusPageAdapter(FragmentManager fm,List<Fragment> fragmentsArp) {
        super(fm);
        this.mFragments=fragmentsArp;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }


}
