package com.company;

public class SecretData extends DataDecorator {
    public SecretData(Data d) {
        super(d);
    }

    @Override
    public boolean getPermission() {
        return super.getPermission();
    }

    @Override
    public String getData() {
        return super.getData() + ", this is the secret data";
    }
}
