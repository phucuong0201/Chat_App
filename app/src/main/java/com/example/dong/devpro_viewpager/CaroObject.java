package com.example.dong.devpro_viewpager;

/**
 * Created by sora on 27/12/2016.
 */

public class CaroObject {
    private int locate;
    private int ident;

    public CaroObject(int locate, int ident) {
        this.locate = locate;
        this.ident = ident;
    }

    public int getLocate() {
        return locate;
    }

    public void setLocate(int locate) {
        this.locate = locate;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }
}
