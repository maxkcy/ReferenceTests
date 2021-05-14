package com.max.myreferancetest;

public class ReferanceMain {

    public static void main(String[] args){
        ObjectX objectX = new ObjectX();
        ObjectY objectY = new ObjectY(objectX);

        System.out.println("ObjectX: a,b,c" + objectX.a  + ", " + objectX.b + ", " + objectX.c);
        System.out.println("ObjectY: a,b,c" + objectY.objX.a  + ", " + objectY.objX.b + ", " + objectY.objX.c);
    }
}
