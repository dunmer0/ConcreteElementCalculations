package com.dunmer.Concrete;

public class Concrete {
    String name;
    float fck;
    float E;
    float fctm;


    public Concrete(String name, float fck, float fctm, float e) {
        this.name = name;
        this.fck = fck;
        E = e;
        this.fctm = fctm;
    }


    public String getName() {
        return name;
    }


    public float getFck() {
        return fck;
    }


    public float getE() {
        return E;
    }


    public float getFctm() {
        return fctm;
    }


    @Override
    public String toString() {
        return "Concrete [name=" + name + ", fck=" + fck + ", E=" + E + ", fctm=" + fctm + "]";
    }

    
    
    
}
