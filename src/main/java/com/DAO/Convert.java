package com.DAO;

public class Convert implements IConvert {
    @Override
    public double convert(double usd) {
        double vnd = usd * 23000;
        return vnd;
    }
}
