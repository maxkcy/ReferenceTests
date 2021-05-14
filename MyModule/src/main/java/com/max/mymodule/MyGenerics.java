package com.max.mymodule;

public class MyGenerics<T, V> { // T and V are the Generic objects as defined in this line
//T t;
//V v;
    public MyGenerics(T t, V v) {
        //this.t = t;
        //this.v = v;

        System.out.println("objects " + t + " & " + v + "  created thru construtor \n generics must be passed in thru the constructor or method");
    }

    public MyGenerics() {
    }
//<T,V> is pretty useless, just to say is generic
    public <T, V> T genMethod(T t, V v){
        System.out.println("objects " + t + " & " + v + "  created thru method \n generics must be passed in thru the constructor or method");
        return t;
    }
}
