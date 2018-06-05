package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.BooksHistoryBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class BooksHistoryAdapter extends BaseQuickAdapter<BooksHistoryBean,BaseViewHolder> {

    public BooksHistoryAdapter(@Nullable List<BooksHistoryBean> data) {
        super(R.layout.item_dm_books_history_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BooksHistoryBean item) {
        helper.setText(R.id.item_dm_books_his_title,item.getTitle()+"");
        helper.setText(R.id.item_dm_books_his_sub,item.getTitleSub()+"");
        helper.setText(R.id.item_dm_books_his_time,item.getReadTime()+"");
        helper.setText(R.id.item_dm_books_his_logo,item.getPageRead()+"");
        helper.addOnClickListener(R.id.item_dm_books_his_root);
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_books_his_img);
        Glide.with(mContext).load(item.getImagePath()).into(imageViewTemp);
    }
}
