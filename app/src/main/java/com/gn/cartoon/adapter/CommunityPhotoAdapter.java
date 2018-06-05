package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.BooksCollectBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class CommunityPhotoAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public CommunityPhotoAdapter(@Nullable List<String> data) {
        super(R.layout.item_community_photo_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.addOnClickListener(R.id.item_image_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_image_root);
        Glide.with(mContext).load(item).into(imageViewTemp);
    }
}
