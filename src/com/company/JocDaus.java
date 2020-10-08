package com.company;

import java.util.Arrays;

public class JocDaus {
    Daus[] daus = new Daus[3];

    public JocDaus() {
        this.daus[0] = new Daus();
        this.daus[1] = new Daus();
        this.daus[2] = new Daus();
    }

    public boolean jugar() {
        this.daus[0].llancar();
        int dau1 = this.daus[0].getNum();
        this.daus[1].llancar();
        int dau2 = this.daus[1].getNum();
        this.daus[2].llancar();
        int dau3 = this.daus[2].getNum();
        return dau1 == dau2 && dau2 == dau3 && dau1 == dau3;
    }



    public String toString() {
        return Arrays.toString(this.daus) +
                '}';
    }
}
