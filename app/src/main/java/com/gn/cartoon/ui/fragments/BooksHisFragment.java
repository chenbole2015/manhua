package com.gn.cartoon.ui.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gn.cartoon.R;
import com.gn.cartoon.adapter.BooksHistoryAdapter;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.bean.BooksHistoryBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/16.
 */

public class BooksHisFragment extends BaseFragment {
    @BindView(R.id.books_history_recycler_view)
    RecyclerView mRecyclerView;

    private List<BooksHistoryBean> mBooksHistoryBeans=new ArrayList<>();
    private BooksHistoryAdapter mBooksHistoryAdapter;

    @Override
    protected int setContentLayout() {
        return R.layout.fragment_books_history_layout;
    }

    @Override
    protected void init() {
        mBooksHistoryBeans.add(new BooksHistoryBean("2018-03-05最新更新","狮子王","狮子勇救人类","http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","续看第200话"));
        mBooksHistoryBeans.add(new BooksHistoryBean("2018-03-05最新更新","狮子王","狮子勇救人类","http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","续看第200话"));
        mBooksHistoryBeans.add(new BooksHistoryBean("2018-03-05最新更新","狮子王","狮子勇救人类","http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","续看第200话"));
        mBooksHistoryBeans.add(new BooksHistoryBean("2018-03-05最新更新","狮子王","狮子勇救人类","http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","续看第200话"));
        mBooksHistoryBeans.add(new BooksHistoryBean("2018-03-05最新更新","狮子王","狮子勇救人类","http://pic.58pic.com/58pic/11/38/96/47g58PICeM9.jpg","续看第200话"));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mBooksHistoryAdapter=new BooksHistoryAdapter(mBooksHistoryBeans);
        mRecyclerView.setAdapter(mBooksHistoryAdapter);
    }


    @Override
    public boolean getUseTitle() {
        return false;
    }
}
