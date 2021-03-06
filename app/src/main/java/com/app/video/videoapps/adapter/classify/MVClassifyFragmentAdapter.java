package com.app.video.videoapps.adapter.classify;

import android.widget.ImageView;

import com.app.video.videoapps.R;
import com.app.video.videoapps.bean.VideoItemBean;
import com.app.video.videoapps.utils.GlideUtils;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class MVClassifyFragmentAdapter extends BaseMultiItemQuickAdapter<VideoItemBean, BaseViewHolder> {

    public MVClassifyFragmentAdapter(List<VideoItemBean> data) {
        super(data);
        setDefaultViewTypeLayout(R.layout.item_mv_classify);
    }

    @Override
    protected void convert(final BaseViewHolder holder, final VideoItemBean item) {
        ImageView imageView = holder.getView(R.id.image);
        GlideUtils.loadImagView(mContext, item.getPic(), imageView);

        holder.setText(R.id.tv_name, item.getTitle());

    }

}