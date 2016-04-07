package com.example.zengchengjie.mylisviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zengchengjie on 2016/4/7.
 */
public class SimpleAdapter extends AppCompatActivity{
    private ListView mlistview;
    private List<String> mlist;
    private ImageView mimageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_test);
        mlistview = (ListView) findViewById(R.id.list_item);
        mlist = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("icon",R.mipmap.ic_launcher);
            map.put("text","第" + i + "条数据");
//            mlist.add(map);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mlist);
        mlistview.setAdapter(adapter);
    }
}
