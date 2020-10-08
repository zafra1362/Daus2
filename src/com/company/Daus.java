package com.company;

public class Daus {
    private int num;

    public int getNum(){
        return this.num;
    }

    public int llancar(){
        this.num = (int)(Math.random() * 6) + 1;
        return this.num;
    }


    public String toString() {
        return "Dau{valor=" + this.num +
                        '}';
    }

}