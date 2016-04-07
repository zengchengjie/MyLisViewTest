package com.example.zengchengjie.mylisviewtest;

/**
 * Created by zengchengjie on 2016/4/7.
 */
public class Fruit {
    //定义一个实体类，作为listView适配器的适配类型 list中的数据是Fruit类型
    private String name;
    private int imageid;
    public Fruit(String name,int imageid){
        this.name=name;
        this.imageid=imageid;
    }
    public String getName(){
        return name;
    }
    public int  getImageId(){
        return imageid;
    }
}
