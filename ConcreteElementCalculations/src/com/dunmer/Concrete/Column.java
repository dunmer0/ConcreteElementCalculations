package com.dunmer.Concrete;

public class Column {

    private String name;
    private int base;           //dimesion in mm
    private int length;        //dimesnion in mm
    private float axialLoad;    //axial load in kN
    
    public Column(String name, int base, int length, float axialLoad) {
        this.name = name;
        this.base = base;
        this.length = length;
        this.axialLoad = axialLoad;
    }

    public String getName() {
        return name;
    }

    public int getBase() {
        return base;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return this.length * this.base;
    }
    @Override
    public String toString() {
        return "Column [" + name + " " + base + "x" + length + "]";
    }

    
    
}
