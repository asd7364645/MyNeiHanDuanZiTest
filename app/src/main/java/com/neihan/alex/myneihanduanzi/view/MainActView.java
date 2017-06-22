package com.neihan.alex.myneihanduanzi.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import com.example.alex.mvplibrary.view.MvpBaseView;
import com.neihan.alex.myneihanduanzi.R;
import com.neihan.alex.myneihanduanzi.adapter.lv.NeiHanImgsAdapter;
import com.neihan.alex.myneihanduanzi.bean.NeiHanImgsBean;
import com.neihan.alex.myneihanduanzi.presenter.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2017/6/15.
 * Alex
 */

public class MainActView extends MvpBaseView<MainActivity> {
    private FrameLayout topbar;
    private RecyclerView main_recycler;
    private NeiHanImgsAdapter neiHanImgsAdapter;
    private ArrayList<NeiHanImgsBean> neiHanImgsBeens;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void findMvpViews() {
        topbar = findViewById(R.id.topbar);
        main_recycler = findViewById(R.id.main_recycler);
    }

    @Override
    protected void setData(Bundle savedInstanceState) {
        super.setData(savedInstanceState);
        neiHanImgsBeens = new ArrayList<>();
        neiHanImgsAdapter = new NeiHanImgsAdapter(neiHanImgsBeens);
    }

    @Override
    public void bindEvent() {
        super.bindEvent();
        neiHanImgsAdapter.setOnItemChildClickListener(presenter);
    }

    @Override
    protected void setView() {
        super.setView();
        main_recycler.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false));
        main_recycler.setAdapter(neiHanImgsAdapter);
    }

    public void setDatas(List<NeiHanImgsBean> neiHanImgsBeens) {
        this.neiHanImgsBeens.clear();
        this.neiHanImgsBeens.addAll(neiHanImgsBeens);
        neiHanImgsAdapter.notifyDataSetChanged();
    }

    public FrameLayout getTopbar() {
        return topbar;
    }

    public void showGif(int posi) {
        neiHanImgsAdapter.notifyItemChanged(posi, NeiHanImgsAdapter.SHOW_GIF);
    }
}
