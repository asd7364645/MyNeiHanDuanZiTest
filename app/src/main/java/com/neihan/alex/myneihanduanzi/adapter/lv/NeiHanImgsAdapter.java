package com.neihan.alex.myneihanduanzi.adapter.lv;

import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.neihan.alex.myneihanduanzi.R;
import com.neihan.alex.myneihanduanzi.bean.NeiHanImgsBean;

import java.util.List;

import static com.neihan.alex.myneihanduanzi.R.layout.item_neihan_imgs;

/**
 * Created by Alex on 2017/6/19.
 * Alex
 */

public class NeiHanImgsAdapter extends BaseQuickAdapter<NeiHanImgsBean, NeiHanImgsAdapter.ImgsHolder> {

    private static final int SOME_IMG_TYPE = 0;
    private static final int ONEC_IMG_TYPE = 1;
    private static final int GIF_IMG_TYPE = 2;

    public static final int SHOW_GIF = 0;

    private PointF pointF;

//    private SimpleDraweeView item_neihan_icon,
//            item_neihan_imgs_img;
//    private ImageView item_neihan_close, item_neihan_imgs_gif_img;
//    private TextView item_neihan_tv,
//            item_neihan_name,
//            item_neihan_zan_count,
//            item_neihan_cai_count,
//            item_neihan_pinglun_count,
//            item_neihan_shared_count;
//    private ProgressBar item_neihan_imgs_gif_progress;

    public NeiHanImgsAdapter(@Nullable List<NeiHanImgsBean> data) {
        super(item_neihan_imgs, data);
        pointF = new PointF(0.5f, 0);
    }

    @Override
    protected void convert(final ImgsHolder baseViewHolder, NeiHanImgsBean neiHanImgsBean) {
        baseViewHolder.addOnClickListener(R.id.item_neihan_imgs_gif_img);
        //头像
        baseViewHolder.item_neihan_icon.setImageURI(Uri.parse(neiHanImgsBean.getGroup().getUser().getAvatar_url()));
        //用户名字
        baseViewHolder.item_neihan_name.setText(neiHanImgsBean.getGroup().getUser().getName());
        //文字内容
        baseViewHolder.item_neihan_tv.setText(neiHanImgsBean.getGroup().getText());
        if (neiHanImgsBean.getGroup().getText().isEmpty()) {
            baseViewHolder.item_neihan_tv.setVisibility(View.GONE);
        } else {
            baseViewHolder.item_neihan_tv.setVisibility(View.VISIBLE);
        }
//        digg_count->点赞数
        baseViewHolder.item_neihan_zan_count.setText(String.valueOf(neiHanImgsBean.getGroup().getDigg_count()));
//        bury_count->点踩数
        baseViewHolder.item_neihan_cai_count.setText(String.valueOf(neiHanImgsBean.getGroup().getBury_count()));
//        comment_count->评论数
        baseViewHolder.item_neihan_pinglun_count.setText(String.valueOf(neiHanImgsBean.getGroup().getComment_count()));
//        share_count->分享数
        baseViewHolder.item_neihan_shared_count.setText(String.valueOf(neiHanImgsBean.getGroup().getShare_count()));
        switch (getItemImgType(neiHanImgsBean)) {
            case GIF_IMG_TYPE:
                baseViewHolder.item_neihan_imgs_img.setVisibility(View.VISIBLE);
                hideGifViews(baseViewHolder, false);
                changeCommonOnceImg(baseViewHolder.item_neihan_imgs_img, neiHanImgsBean);
                break;
            case SOME_IMG_TYPE:
                baseViewHolder.item_neihan_imgs_img.setVisibility(View.GONE);
                hideGifViews(baseViewHolder, true);
                break;
            case ONEC_IMG_TYPE:
                baseViewHolder.item_neihan_imgs_img.setVisibility(View.VISIBLE);
                hideGifViews(baseViewHolder, true);
                changeCommonOnceImg(baseViewHolder.item_neihan_imgs_img, neiHanImgsBean);
                break;

        }
        baseViewHolder.item_neihan_imgs_img.setAspectRatio((float) neiHanImgsBean.getGroup().getMin_screen_width_percent());
    }

    @Override
    protected void convertByPosition(ImgsHolder helper, NeiHanImgsBean item, Object paylod) {
        super.convertByPosition(helper, item, paylod);
        switch ((int) paylod) {
            case SHOW_GIF:
                showGif(helper, item);
                break;
        }
    }

    private int getItemImgType(NeiHanImgsBean neiHanImgsBean) {
        if (neiHanImgsBean.getGroup().getIs_gif() == 1) {
            return GIF_IMG_TYPE;
        } else if (neiHanImgsBean.getGroup().getIs_multi_image() == 1) {
            return SOME_IMG_TYPE;
        } else if (neiHanImgsBean.getGroup().getIs_multi_image() == 0) {
            return ONEC_IMG_TYPE;
        }

        return -1;
    }

    private void changeCommonOnceImg(SimpleDraweeView img, NeiHanImgsBean neiHanImgsBean) {
        setImgWrapHeightMode(img, neiHanImgsBean);
        //设置中心店位置
        img.getHierarchy().setActualImageFocusPoint(pointF);
        img.setImageURI(Uri.parse(neiHanImgsBean.getGroup().getMiddle_image().getUrl_list().get(0).getUrl()));
    }

    /**
     * 设置图片的高度模式
     */
    private void setImgWrapHeightMode(SimpleDraweeView img, NeiHanImgsBean neiHanImgsBean) {
        RelativeLayout.LayoutParams layoutParams;
        if ((float) neiHanImgsBean.getGroup().getMin_screen_width_percent() > (float) 3 / 4) {
            layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, mContext.getResources().getDisplayMetrics()));
        }
        img.setLayoutParams(layoutParams);
    }

    /**
     * 隐藏GIF相关控件
     *
     * @param isHide
     */
    private void hideGifViews(ImgsHolder holder, boolean isHide) {
        if (isHide) {
            holder.item_neihan_imgs_gif_img.setVisibility(View.GONE);
            holder.item_neihan_imgs_gif_progress.setVisibility(View.GONE);
        } else {
            holder.item_neihan_imgs_gif_img.setVisibility(View.VISIBLE);
            holder.item_neihan_imgs_gif_progress.setVisibility(View.VISIBLE);
        }
    }

    private void showGif(final ImgsHolder holder, NeiHanImgsBean neiHanImgsBean) {
        System.out.println("neiHanImgsBean = " + neiHanImgsBean.getGroup().getUser().getName());
        GenericDraweeHierarchy hierarchy = holder.item_neihan_imgs_img.getHierarchy();
        hierarchy.setProgressBarImage(new ProgressBarDrawable());
        DraweeController draweeController = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(neiHanImgsBean.getGroup().getLarge_image().getUrl_list().get(0).getUrl()))
                .setControllerListener(new BaseControllerListener<ImageInfo>() {
                    @Override
                    public void onFinalImageSet(String id, ImageInfo imageInfo, Animatable animatable) {
                        super.onFinalImageSet(id, imageInfo, animatable);
                        hideGifViews(holder, true);
                    }

                    @Override
                    public void onFailure(String id, Throwable throwable) {
                        super.onFailure(id, throwable);
                    }
                })
                .setAutoPlayAnimations(true).build();
        holder.item_neihan_imgs_img.setHierarchy(hierarchy);
        holder.item_neihan_imgs_img.setController(draweeController);
    }

    class ImgsHolder extends BaseViewHolder {

        SimpleDraweeView item_neihan_icon,
                item_neihan_imgs_img;
        ImageView item_neihan_close;
        ImageView item_neihan_imgs_gif_img;
        TextView item_neihan_tv,
                item_neihan_name,
                item_neihan_zan_count,
                item_neihan_cai_count,
                item_neihan_pinglun_count,
                item_neihan_shared_count;
        ProgressBar item_neihan_imgs_gif_progress;

        public ImgsHolder(View view) {
            super(view);
            item_neihan_icon = getView(R.id.item_neihan_icon);
            item_neihan_imgs_img = getView(R.id.item_neihan_imgs_img);
            item_neihan_close = getView(R.id.item_neihan_close);
            item_neihan_imgs_gif_img = getView(R.id.item_neihan_imgs_gif_img);
            item_neihan_tv = getView(R.id.item_neihan_tv);
            item_neihan_name = getView(R.id.item_neihan_name);
            item_neihan_zan_count = getView(R.id.item_neihan_zan_count);
            item_neihan_cai_count = getView(R.id.item_neihan_cai_count);
            item_neihan_pinglun_count = getView(R.id.item_neihan_pinglun_count);
            item_neihan_shared_count = getView(R.id.item_neihan_shared_count);
            item_neihan_imgs_gif_progress = getView(R.id.item_neihan_imgs_gif_progress);
        }
    }

}
