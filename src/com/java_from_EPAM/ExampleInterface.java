package com.java_from_EPAM;

public class ExampleInterface implements Printable{
    @Override
    public void print(String str,int i,int j) {
        System.out.println("\n"+str+"\nСумма = "+i+" + "+j+" = "+i+j);
    }


}
