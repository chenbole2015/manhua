package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.HomeFocusBean;
import com.gn.cartoon.bean.TransationDetailBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class TransationDetailAdapter extends BaseQuickAdapter<TransationDetailBean,BaseViewHolder> {
    private  boolean  isPay=false;

    public TransationDetailAdapter(@Nullable List<TransationDetailBean> data,boolean isPayArp) {
        super(R.layout.item_dm_transation_detail_adapter, data);
        this.isPay=isPayArp;
    }

    @Override
    protected void convert(BaseViewHolder helper, TransationDetailBean item) {
        helper.setText(R.id.item_dm_transation_title,isPay?item.getPayMode()+"":item.getTitle()+"");
        helper.setText(R.id.item_dm_transation_values,(isPay?"+":"-")+item.getValues()+"");
        helper.setText(R.id.item_dm_transation_time,item.getTime()+"");
        helper.setText(R.id.item_dm_transation_order_num,"订单号："+item.getOrderNum()+"");
        helper.setVisible(R.id.item_dm_transation_order_num,isPay);
    }
}
