package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.HomeHotBooksBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class HomeHotAdapter extends BaseQuickAdapter<HomeHotBooksBean,BaseViewHolder> {

    public HomeHotAdapter(@Nullable List<HomeHotBooksBean> data) {
        super(R.layout.item_dm_home_hot_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeHotBooksBean item) {
        helper.setText(R.id.item_dm_flag_title,item.getTitle()).setText(R.id.item_dm_flag_detail,item.getDetailInfo());
        helper.addOnClickListener(R.id.item_dm_home_hot_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_flag_img);
        Glide.with(mContext).load(item.getLogoPath()).into(imageViewTemp);
    }
}
