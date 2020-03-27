package com.company;

public class SimpleData implements Data {
    @Override
    public boolean getPermission() {
        return false;
    }

    @Override
    public String getData() {
        return "This is the simple data";
    }
}
