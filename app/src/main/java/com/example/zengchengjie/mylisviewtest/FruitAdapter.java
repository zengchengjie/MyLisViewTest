package com.example.zengchengjie.mylisviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zengchengjie on 2016/4/7.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
    //创建一个自定义的适配器
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        //重写了父类的构造函数 用于将上下文、自项布局的id、数据传递进来
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    public View getView(int position, View converView, ViewGroup parent) {
        //使用getview方法得到当前Fruit的实例...
        Fruit fruit = getItem(position);
        View view = null;
        ViewHolder viewHolder;
        if (converView == null) {//在此进行判断会提高效率
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            //如果非空则使用LayoutInflater去加布局
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.text1);
            view.setTag(viewHolder);//将ViewHolder存储在view中
        } else {
            view = converView;//对convertView进行重用
            viewHolder = (ViewHolder) view.getTag();//重新获取viewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
}
