package com.company;

public class Screen {
    private boolean up = false;

    public void setUp(){
        this.up = true;
    }

    public void setDown(){
        this.up = false;
    }

    @Override
    public String toString(){
        if(up) {
            return "Screen is up";
        } else {
            return "Screen is down";
        }
    }
}
