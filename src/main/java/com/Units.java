package com;

public class Units {
    private String name;

    public Units( String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printUnitsDetails(){

        System.out.println("Name:"+name);
}
    }