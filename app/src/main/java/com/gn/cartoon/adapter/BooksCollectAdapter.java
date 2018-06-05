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

public class BooksCollectAdapter extends BaseQuickAdapter<BooksCollectBean,BaseViewHolder> {

    public BooksCollectAdapter(@Nullable List<BooksCollectBean> data) {
        super(R.layout.item_dm_books_collect_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BooksCollectBean item) {
        helper.setText(R.id.item_dm_books_collect_title,item.getTitle()+"");
        helper.setText(R.id.item_dm_books_collect_sub,item.getPageTotal()+"");
        helper.addOnClickListener(R.id.item_dm_books_collect_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_books_collect_img);
        Glide.with(mContext).load(item.getImagePath()).into(imageViewTemp);
    }
}
