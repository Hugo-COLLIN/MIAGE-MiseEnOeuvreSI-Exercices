package com.example.model;

public class HelloWorld {
    private String maProp = "HelloWorld";

    public String getMaProp() {
        return maProp;
    }

    public void setMaProp(String maProp) {
        this.maProp = maProp;
    }

    @Override
    public String toString() {
        return "HelloWorld{maProp='" + maProp + "'}";
    }
}
