package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.MineAttentionArtBean;
import com.gn.cartoon.bean.MineAttentionWriterBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineAttentionWriterAdapter extends BaseQuickAdapter<MineAttentionWriterBean,BaseViewHolder> {

    public MineAttentionWriterAdapter(@Nullable List<MineAttentionWriterBean> data) {
        super(R.layout.item_dm_mine_attention_writer_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineAttentionWriterBean item) {
        helper.setText(R.id.item_dm_mine_attention_name,item.getNickName()+"");
        helper.setText(R.id.item_dm_mine_attention_info,item.getUserInfo()+"");
        helper.addOnClickListener(R.id.item_dm_mine_attention_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_mine_attention_img);
        Glide.with(mContext).load(item.getImagePath()).into(imageViewTemp);
    }
}
