package com.dunmer.Concrete;

public class Column {

    String name;
    int base;
    int length;
    
    public Column(String name, int base, int length) {
        this.name = name;
        this.base = base;
        this.length = length;
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

    @Override
    public String toString() {
        return "Column [" + name + " " + base + "x" + length + "]";
    }

    
    
}
