package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.MineAttentionArtBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineAttentionArtAdapter extends BaseQuickAdapter<MineAttentionArtBean,BaseViewHolder> {

    public MineAttentionArtAdapter(@Nullable List<MineAttentionArtBean> data) {
        super(R.layout.item_dm_mine_attention_art_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineAttentionArtBean item) {
        helper.setText(R.id.item_dm_mine_attention_title,item.getTitle()+"");
        helper.setText(R.id.item_dm_mine_attention_sub,item.getTitleSub()+"");
        helper.setText(R.id.item_dm_mine_attention_page,item.getUpdatePage()+"");
        helper.addOnClickListener(R.id.item_dm_mine_attention_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_mine_attention_img);
        Glide.with(mContext).load(item.getImagePath()).into(imageViewTemp);
    }
}
