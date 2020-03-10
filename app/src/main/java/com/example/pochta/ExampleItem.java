package com.example.pochta;

import java.util.ArrayList;
import java.util.Random;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private ArrayList<String> texty;
    public ExampleItem(){

    }
    public ExampleItem(int imageResource, String text1, String text2) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        texty = new ArrayList<>();
        texty.add("Здорово) А у меня появился ещё вопрос: а как ты смотришь на то, чтобы встретиться и пообщаться лично? Я бегло просмотрел твою страницу и понял, что у нас много общего. Думаю, нам будет интересно пообщаться) Например, можно встретиться сегодня вечером на Старом Арбате и попить кофе.") ;
        texty.add("Да, удобно. Оставьте свой номер, пожалуйста. На случай, если я тебя там потеряю") ;
        texty.add("Привет! Приятно познакомиться :) Из нашего города до Байкала мало кто добирается – за границу нынче и ближе, и дешевле лететь, чем в такую даль. Спрашивай, что хочешь. Постараюсь ответить" );
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public String randomize(){
        Random r = new Random();
        return texty.get(r.nextInt(3));
    }

    public String getText2() {
        return mText2;
    }}
