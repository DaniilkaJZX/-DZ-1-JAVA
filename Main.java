package geekbrains.lesson_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        byte a = -99;
        short a1 = 7896;
        int a2 = 678678905;
        long b = 7000000000000L;
        float c = 9.1f;
        double d = 70.5;
        char i = '\u0045';
        boolean boolVar;
        boolVar = true;
        boolVar = false;


       System.out.println(computation(1,2,5,5));
       printTrueFalse(11,5);
       printPositiveOrNegative(-9);
       printNegative(8);
       printName("Даниил");
       printLeapYear(704);


    }
    public static int computation(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    public static void printTrueFalse(int x1 , int x2){
        if(x1 + x2 <=20){
            System.out.println("Правда");
        } else {
            System.out.println("Ложь");
        }
    }
    public static void printPositiveOrNegative(int z) {
        if (z >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean printNegative(int z){
        if(z < 0){
            System.out.println(z);
            return true;
        }else{
            System.out.println(" Число не отрицательное "+ z);
        }
        return false;
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static boolean printLeapYear(int year ){
        if(year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0 ) {
            System.out.println(" Год является високосным " + year);
            return true;
        } else {
            System.out.println(" Год не является високосным " + year);
            return  false;
        }


    }


}
