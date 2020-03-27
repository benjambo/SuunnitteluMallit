package com.company;

public abstract class DataDecorator implements Data {
    private final Data decoratedData;

    public DataDecorator(Data d) {
        this.decoratedData = d;
    }

    @Override
    public boolean getPermission() {
        return true;
    }

    @Override
    public String getData() {
        return decoratedData.getData();
    }
}
