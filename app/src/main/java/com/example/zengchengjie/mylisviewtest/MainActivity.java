package com.example.zengchengjie.mylisviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.adapter_test, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void initFruit() {
        Fruit apple = new Fruit("苹果", R.mipmap.ic_launcher);
        fruitList.add(apple);
        Fruit banana = new Fruit("香蕉", R.mipmap.ic_launcher);
        fruitList.add(banana);
        Fruit watermalon = new Fruit("西瓜", R.mipmap.ic_launcher);
        fruitList.add(watermalon);
        Fruit pear = new Fruit("梨", R.mipmap.ic_launcher);
        fruitList.add(pear);
        Fruit grape = new Fruit("橘子", R.mipmap.ic_launcher);
        fruitList.add(grape);
        Fruit Strawberry = new Fruit("草莓", R.mipmap.ic_launcher);
        fruitList.add(Strawberry);
        Fruit Cherry = new Fruit("樱桃", R.mipmap.ic_launcher);
        fruitList.add(Cherry);
        Fruit grape2 = new Fruit("柚子", R.mipmap.ic_launcher);
        fruitList.add(grape2);
        Fruit Strawberry2 = new Fruit("橙子", R.mipmap.ic_launcher);
        fruitList.add(Strawberry2);
        Fruit Cherry2 = new Fruit("芒果", R.mipmap.ic_launcher);
        fruitList.add(Cherry2);
    }
}
