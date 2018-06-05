package com.gn.cartoon.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.SuperKotlin.pictureviewer.ImagePagerActivity;
import com.SuperKotlin.pictureviewer.PictureConfig;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseApplication;
import com.gn.cartoon.bean.BooksCollectBean;
import com.gn.cartoon.bean.CommunityListBean;
import com.gn.cartoon.ui.activitys.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FYJ on 2018/5/15.
 */

public class CommunityListAdapter extends BaseQuickAdapter<CommunityListBean,BaseViewHolder> {

    public CommunityListAdapter(@Nullable List<CommunityListBean> data) {
        super(R.layout.item_dm_community_list_adapter, data);
    }

    private CommunityPhotoAdapter mCommunityPhotoAdapter;

    @Override
    protected void convert(BaseViewHolder helper, final CommunityListBean item) {
        helper.setText(R.id.item_dm_community_list_nickname,item.getNickName()+"");
        helper.setText(R.id.item_dm_community_list_content,item.getConect()+"");
        helper.setText(R.id.item_dm_community_list_comment,item.getCommectNum()+"");
        helper.setText(R.id.item_dm_community_list_prove,item.getProveNum()+"");
        helper.setText(R.id.item_dm_community_list_time,item.getTime()+"");
        RecyclerView recyclerViewTemp=helper.itemView.findViewById(R.id.item_dm_community_list_recycler_view);
        recyclerViewTemp.setLayoutManager(new GridLayoutManager(mContext,2));
        recyclerViewTemp.setAdapter(mCommunityPhotoAdapter=new CommunityPhotoAdapter(item.getPhoto()));

        final PictureConfig.Builder builderTemp = new PictureConfig.Builder();
        builderTemp  .setListData((ArrayList<String>) item.getPhoto())	//图片数据List<String> list
                    .setDownloadPath("pictureviewer")	//图片下载文件夹地址
                  .setIsShowNumber(true)//是否显示数字下标
                  .needDownload(true)	//是否支持图片下载
                 .setPlacrHolder(R.mipmap.ic_launcher);	//占位符图片（图片加载完成前显示的资源图片，来源drawable或者mipmap）
        mCommunityPhotoAdapter.setOnItemChildClickListener(new OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                builderTemp.setPosition(position);	//图片下标（从第position张图片开始浏览）
                ImagePagerActivity.startActivity(mContext, builderTemp.build());
            }
        });
       ImageView imageViewTemp= helper.itemView.findViewById(R.id.item_dm_community_list_img);
        Glide.with(mContext).load(item.getImagePath()).into(imageViewTemp);
    }
}
