package com.example.android.tourguide;

/**
 * Created by Amardeep on 7/13/2017.
 */

public class Data {
    private int mImage;
    private int mAbout;
    private int mname;
    public Data(int Image,int About,int name){
        mImage=Image;
        mAbout=About;
        mname=name;
    }
    public int getImageResource(){
        return mImage;
    }
    public int getAboutResource(){
        return mAbout;
    }
    public int getNameResource(){
        return mname;
    }
}
