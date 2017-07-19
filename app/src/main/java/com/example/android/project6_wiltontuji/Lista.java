package com.example.android.project6_wiltontuji;

/**
 * Created by Adailto on 18/04/2017.
 */

public class Lista {

    private String mNome;
    private String mDesc1;
    private String mDesc2;
    private int mFotoID;

    public Lista (String nome, String desc1, String desc2, int fotoID) {
        mNome = nome;
        mDesc1 = desc1;
        mDesc2 = desc2;
        mFotoID = fotoID;
    }

    public String getNome(){
        return(mNome);
    }

    public String getDesc1() {
        return(mDesc1);
    }

    public String getDesc2(){
        return (mDesc2);
    }

    public int getFotoID(){
        return (mFotoID);
    }

}
