package com.gn.cartoon.ui.fragments;

import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import butterknife.BindView;

/**
 * Created by FYJ on 2018/5/17.
 */

public class MineFeedBackSubmitFragment extends BaseFragment {
    @BindView(R.id.mine_feed_back_spinner)
    Spinner mSpinner;


    @Override
    protected int setContentLayout() {
        return R.layout.fragment_mine_feed_back_1_layout;
    }

    @Override
    protected void init() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.attentionTitle));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(arrayAdapter);
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }
}
