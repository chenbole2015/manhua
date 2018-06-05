package com.gn.cartoon.ui.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.flyco.tablayout.SlidingTabLayout;
import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/15.
 */

public class BooksFragment extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.books_title)
    SlidingTabLayout mSlidingTabLayout;

    @BindView(R.id.books_view_pager)
    ViewPager mViewPager;

    private ArrayList<Fragment> mBooksHisFragments=new ArrayList<>();

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_books_layout;
    }

    @Override
    protected void init() {
        setTextViewContent(getString(R.string.title_books), null);
        setTextViewContentSub(getString(R.string.sub_title_books),this);
        initTitle();
    }

    private void initTitle() {
        mBooksHisFragments.add(new BooksHisFragment());
        mBooksHisFragments.add(new BooksCollectFragment());
        mSlidingTabLayout.setViewPager(mViewPager,getResources().getStringArray(R.array.booksTitle),getActivity(), mBooksHisFragments);
    }



    public void onClick(View v) {
        showToast("编辑");
    }
}
