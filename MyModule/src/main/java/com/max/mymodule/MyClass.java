package com.max.mymodule;

public class MyClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.referanceTest();
        //myClass.genericsTest();
        //myClass.noFapCalc();


    }

    public void referanceTest() {
        ObjectX objectX = new ObjectX();


        ObjectY objectY = new ObjectY(objectX);

        System.out.println("ObjectX: a,b,c" + objectX.a + ", " + objectX.b + ", " + objectX.c);
        System.out.println("ObjectY: a,b,c" + objectY.objX.a + ", " + objectY.objX.b + ", " + objectY.objX.c);
        //changes to references made to reference of objX are changed in ObjY

        ObjectX objectX2 = new ObjectX();
        ObjectX objectX3 = objectX2;
        System.out.println(" objextX2 " + objectX2.a);
        System.out.println(" objectx3 " + objectX3.a);
        //prints ^ same. so no X2 is changed
        objectX2.a = 1000;
        System.out.println("objectX2: " + objectX2.a + " objectX3: " + objectX3.a);
        //X3^ which points to X2 changes.
        objectX3.a = 20;
        System.out.println("objectX2: " + objectX2.a + " objectX3: " + objectX3.a);
        //x2 changes with changes to x3
        //now the cool part
        ObjectZ objectZ1 = new ObjectZ(10, 20, 30);
        ObjectZ objectZ2 = new ObjectZ(11, 22, 33);
        ObjectZ objectZ3 = objectZ1;
        ObjectZ objectZ4 = objectZ3;
        //now Z3 points to Z1, and Z4 points to Z3 -> Z1
        System.out.println("cool part: objectZ3.a: " + objectZ3.a + " objectZ3.b: " + objectZ3.b + " objectZ3.c: " + objectZ3.c);
        System.out.println("so then: objectZ4.a: " + objectZ4.a + " objectZ4.b: " + objectZ4.b + " objectZ4.c: " + objectZ4.c);
        objectZ3 = objectZ2;
        System.out.println("did objZ3 values change after it points to Z2? objectZ3.a: " + objectZ3.a + " objectZ3.b: " + objectZ3.b + " objectZ3.c: " + objectZ3.c);
        System.out.println("did objZ4 values change to Z3s? objectZ4.a: " + objectZ4.a + " objectZ4.b: " + objectZ4.b + " objectZ4.c: " + objectZ4.c);
        //lesson is, that pointers set to parent -> now you see why primitive object/variable doesn't change
        //as myke says: it helps if you just think of them as memory addresses
        //objX = a number interpreted as a memory address
        //so is objA, objB, and objY
        //it's just like int A = Y

        int Alpha = 7;
        int Beta = 6;
        Alpha = Beta;
        System.out.println("alpha's is now equal to value of beta: " + Alpha);
        System.out.println("beta's value is unchanged?: " + Beta);

        Alpha = 5;
        System.out.println("alpha's is now equal to value of 5: " + Alpha);
        System.out.println("Did beta change to 5?: " + Beta);
        Alpha = Beta;

        Beta = 4;
        System.out.println("Beta changed to 4, alpha is: " + Alpha);
        System.out.print("Beta is: " + Beta);


    }

    public void genericsTest() {
        MyGenerics<String, Integer> myGen;
        String hi = "hello";
        int num = 7;
        myGen = new MyGenerics<>(hi, num);
        myGen.genMethod(hi, num);
    }

    public void noFapCalc() {
        NoFapCalc noFapCalc = new NoFapCalc();
    }
}