package com.gn.cartoon.ui.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;

import butterknife.BindView;

public class MineAuthorActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.mine_author_recycler_view)
    RecyclerView mRecyclerView;

    @Override
    protected int setLayout() {
        return R.layout.activity_mine_author;
    }

    @Override
    protected void init() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        setTextViewContent(getString(R.string.mine_author_title),null);
        setTextViewContentSub(getString(R.string.mine_author_sub_title),this);
    }

    @Override
    public void onClick(View v) {
        showToast(getString(R.string.mine_author_sub_title));
    }
}
