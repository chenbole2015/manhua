package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.MineMeanBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineMenuAdapter extends BaseQuickAdapter<MineMeanBean,BaseViewHolder> {

    public MineMenuAdapter( @Nullable List<MineMeanBean> data) {
        super(R.layout.item_dm_mine_menu_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineMeanBean item) {
        helper.setText(R.id.item_dm_flag_text,item.getTextMenu());
        helper.addOnClickListener(R.id.item_dm_mine_menu_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_flag_img);
        Glide.with(mContext).load(item.getIconMenu()).into(imageViewTemp);
    }
}
