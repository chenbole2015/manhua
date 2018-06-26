package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.BooksCollectBean;
import com.gn.cartoon.bean.HomeFocusBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class HomeFocusAdapter extends BaseQuickAdapter<HomeFocusBean,BaseViewHolder> {

    public HomeFocusAdapter(@Nullable List<HomeFocusBean> data) {
        super(R.layout.item_dm_home_focus_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeFocusBean item) {
        helper.setText(R.id.item_dm_home_focus_tv_page,item.getReadPage()+"   "+item.getTitle());
        helper.setText(R.id.item_dm_home_focus_tv_pause,item.getPauseNum()+"");
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_home_focus_image);
        Glide.with(mContext).load(item.getImagePath()).into(imageViewTemp);
    }
}
