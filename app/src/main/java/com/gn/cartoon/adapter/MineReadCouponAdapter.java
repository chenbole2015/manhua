package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.HomeHotBooksBean;
import com.gn.cartoon.bean.MineReadCouponBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineReadCouponAdapter extends BaseQuickAdapter<MineReadCouponBean,BaseViewHolder> {

    public MineReadCouponAdapter(@Nullable List<MineReadCouponBean> data) {
        super(R.layout.item_dm_mine_read_coupon_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineReadCouponBean item) {
        helper.setText(R.id.item_mine_read_info,item.getReadInfo()).setText(R.id.item_mine_read_time,item.getTime());
        helper.addOnClickListener(R.id.mine_read_coupon_root);
    }
}
