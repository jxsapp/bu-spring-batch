package org.bu.cloud.ms.batch;

public class Calculator {
    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void handleData() {
        System.out.println("Sum: " + (first + second));
        System.out.println("Product: " + (first * second));
    }


    public String sum() {
        return ("Sum: " + (first + second));
    }

    public String product() {
        return ("Product: " + (first * second));
    }
}