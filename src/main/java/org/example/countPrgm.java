package org.example;

import java.util.Scanner;

public class countPrgm extends num{
    public static  void countFirname(String name) {
        System.out.println(name.length());
        //int count =0;

    }
    public static void main(String[] args) {
        countPrgm obj = new countPrgm();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String strName = sc.next();
        obj.countFirname(strName);
        num objNum = new num(){
            public static  void sum() {
                System.out.println("hi");
                System.out.println("hello");
            }
        };
        objNum.sum();
    }
}
