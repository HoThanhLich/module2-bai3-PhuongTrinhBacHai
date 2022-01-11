package com.company;

public class PhuongTrinhBacHai {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double x1 = (-this.b - Math.sqrt(getDiscriminant()) / (2 * this.a));
        return x1;
    }

    public double getRoot2() {
        double x2 = (-this.b + Math.sqrt(getDiscriminant()) / (2 * this.a));
        return x2;
    }
}
