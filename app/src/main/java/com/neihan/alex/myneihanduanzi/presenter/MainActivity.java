package com.neihan.alex.myneihanduanzi.presenter;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.alex.mvplibrary.model.MvpModelCallBack;
import com.example.alex.mvplibrary.presenter.MvpBaseAct;
import com.neihan.alex.myneihanduanzi.R;
import com.neihan.alex.myneihanduanzi.bean.NeiHanBaseBean;
import com.neihan.alex.myneihanduanzi.bean.NeiHanImgsBean;
import com.neihan.alex.myneihanduanzi.model.NeiHanModel;
import com.neihan.alex.myneihanduanzi.utils.AlexStatusBarUtils;
import com.neihan.alex.myneihanduanzi.utils.ToastUtils;
import com.neihan.alex.myneihanduanzi.view.MainActView;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends MvpBaseAct<MainActView, NeiHanModel> implements BaseQuickAdapter.OnItemChildClickListener {

    @Override
    public void create(Bundle saveInstance) {
        super.create(saveInstance);
    }

    @Override
    public void created(Bundle saveInstance) {
        super.created(saveInstance);
        AlexStatusBarUtils.setTransparentStatusBar(this, mvpView.getTopbar());

        mvpModel.getNeiHanImgs(this, -103, new MvpModelCallBack<NeiHanBaseBean.DataBean<NeiHanImgsBean>>() {
            @Override
            public void result(NeiHanBaseBean.DataBean<NeiHanImgsBean> data) {
                removeItemForDatas(data.getData());
                mvpView.setDatas(data.getData());
            }
        }, new MvpModelCallBack<String>() {
            @Override
            public void result(String data) {
                ToastUtils.showShort(MainActivity.this, data);
                System.out.println(data);
            }
        });

//        ArrayList<NeiHanImgsBean> neiHanImgsBeen = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            neiHanImgsBeen.add(new NeiHanImgsBean());
//        }
//        mvpView.setDatas(neiHanImgsBeen);

    }

    private void removeItemForDatas(List<NeiHanImgsBean> imgsBeens) {
        Iterator<NeiHanImgsBean> iterator = imgsBeens.iterator();
        while (iterator.hasNext()) {
            NeiHanImgsBean next = iterator.next();
            if (next.getGroup() == null) {
                iterator.remove();
            }
        }
    }

    @Override
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (view.getId()){
            case R.id.item_neihan_imgs_gif_img:
                System.out.println("i = " + i);
                mvpView.showGif(i);
                break;
        }
    }

    class MAdapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

}
