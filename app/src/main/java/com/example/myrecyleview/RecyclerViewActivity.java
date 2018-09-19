package com.example.myrecyleview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;


public class RecyclerViewActivity extends AppCompatActivity {
     HomeAdapter homeAdapter;
     private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        RecyclerView mRecyclerView=this.findViewById(R.id.id_recyclerview);
        //设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //设置item增加和删除时的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(RecyclerViewActivity.this,
                DividerItemDecoration.VERTICAL_LIST));
        HomeAdapter homeAdapter=new HomeAdapter(this,mList);
        mRecyclerView.setAdapter(homeAdapter);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation();
    }

}
