package com.example.sushirecipes;


import androidx.appcompat.app.AppCompatActivity;

public class RecyclerViewItem extends AppCompatActivity {

    private int imageResurce;
    private String text1;
    private String text2;
    private String text3;
    private String text4;



    public RecyclerViewItem(int imageResurce, String text1, String text2,String text3,String text4 ) {
        this.imageResurce = imageResurce;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;




    }

    public int getImageResurce() {
        return imageResurce;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }








    }


