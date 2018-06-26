package com.gn.cartoon.adapter;

import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.bean.HomeFocusBean;
import com.gn.cartoon.bean.MineVipBean;

import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class MineVipAdapter extends BaseQuickAdapter<MineVipBean,BaseViewHolder> {

    public MineVipAdapter(@Nullable List<MineVipBean> data) {
        super(R.layout.item_dm_mine_vip_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineVipBean item) {
        helper.setText(R.id.item_mine_vip_mouth,item.getMouth()+"个月\n¥"+item.getMoney());
        helper.setText(R.id.item_mine_vip_gp,"¥"+item.getGrice()+"");
        helper.setText(R.id.item_mine_vip_free,""+item.getFreeThings());
       TextView textViewTemp= helper.itemView.findViewById(R.id.item_mine_vip_gp);
       textViewTemp.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        helper.setVisible(R.id.item_dm_mine_vip_hot,item.getIsHot()==1);
        helper.setVisible(R.id.item_dm_mine_vip_select,item.isSelect());
        helper.addOnClickListener(R.id.item_mine_vip_root);
        RelativeLayout relativeLayoutTemp =helper.getView(R.id.item_mine_vip_rl);
        relativeLayoutTemp.setSelected(item.isSelect());
    }
}
