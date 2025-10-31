package com.weAreNowInOctober.recurssion;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld ob = new HelloWorld();
//        for(int i = 0 ; i < 5; i++) {
//            ob.helloWorld();
//        }
        ob.helloWorld();
    }
    public void helloWorld() {
        System.out.println("Hello World! , Ritick has arrived. 1");
        helloWorld1();
    }
    public static void helloWorld1() {
        System.out.println("Hello World! , Ritick has arrived. 2");
        helloWorld2();
    }
    public static void helloWorld2() {
        System.out.println("Hello World! , Ritick has arrived. 3");
        helloWorld3();
    }
    static void helloWorld3() {
        System.out.println("Hello World! , Ritick has arrived. 4");
        helloWorld4();
    }
    static void helloWorld4() {
        System.out.println("Hello World! , Ritick has arrived. 5");
    }
}
