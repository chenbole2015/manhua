package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.BooksCollectAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.BooksCollectBean;
import com.gn.cartoon.utils.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/16.
 */

public class BooksCollectFragment extends BaseFragment {

    @BindView(R.id.books_history_recycler_view)
    RecyclerView mRecyclerView;

    private BooksCollectAdapter mBooksCollectAdapter;
    private List<BooksCollectBean> mBooksCollectBeans=new ArrayList<>();

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_books_history_layout;
    }

    @Override
    protected void init() {
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mBooksCollectBeans.add(new BooksCollectBean("http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","第3话/共200话","狮子王"));
        mRecyclerView.setLayoutManager(new GridLayoutManager(mContext,3));
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(mContext));
        mBooksCollectAdapter=new BooksCollectAdapter(mBooksCollectBeans);
        mRecyclerView.setAdapter(mBooksCollectAdapter);
    }


    @Override
    public boolean getUseTitle() {
        return false;
    }
}
