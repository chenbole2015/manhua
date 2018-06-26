package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.HomeFocusBean;
import com.gn.cartoon.bean.MineSignBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineSignAdapter extends BaseQuickAdapter<MineSignBean,BaseViewHolder> {

    public MineSignAdapter(@Nullable List<MineSignBean> data) {
        super(R.layout.item_dm_mine_sign_day_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineSignBean item) {
        helper.setText(R.id.item_dm_mine_sign_day,item.getDay()+"天");
        helper.setText(R.id.item_dm_mine_sign_ed_prize,item.getPrize()+"");
        helper.setVisible(R.id.item_dm_mine_sign_ed,item.isSign());
    }
}
