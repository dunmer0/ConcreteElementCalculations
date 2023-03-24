package com.dunmer.Concrete;

public class Storey {
    float heigth;
    float dre;
    float q;
    float v;
    
    public Storey(float heigth, float dre, float q, float v) {
        this.heigth = heigth;
        this.dre = dre;
        this.q = q;
        this.v = v;
    }

    public float getHeigth() {
        return heigth;
    }

    public float getDre() {
        return dre;
    }

    public float getQ() {
        return q;
    }

    public float getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Storey [heigth=" + heigth + ", dre=" + dre + ", q=" + q + ", v=" + v + "]";
    }


    
}
