package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.HomeHotBooksBean;
import com.gn.cartoon.bean.MineFeedBackInfoBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineFeedBackInfoAdapter extends BaseQuickAdapter<MineFeedBackInfoBean,
        BaseViewHolder> {

    public MineFeedBackInfoAdapter(@Nullable List<MineFeedBackInfoBean> data) {
        super(R.layout.item_dm_mine_feed_back_info_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineFeedBackInfoBean item) {
        helper.setText(R.id.item_dm_feed_back_flag, item.getTitleFlag()).setText(R.id
                .item_dm_feed_back_content, item.getContent()).setText(R.id
                .item_dm_feed_back_time, item.getTime());
    }
}
