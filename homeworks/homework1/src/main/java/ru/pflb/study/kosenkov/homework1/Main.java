package ru.pflb.study.kosenkov.homework1;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertDecToBin(5));
        System.out.println("***");
        System.out.println(convertDecToHex(5));
        System.out.println("***");
        System.out.println(convertBinToOct(0b101));
        System.out.println();
        System.out.println(checkBinOctHex("5"));
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int divide(int a, int b){
        if (b==0) {
            throw new RuntimeException("Div by 0");
        }
        return a/b;
    }
    public int multiply(int a, int b){
        return a*b;
    }

    public static String convertDecToBin(int num) {
        return Integer.toBinaryString(num);
    }

    public static String convertDecToHex(int num) {
        return Integer.toHexString(num);
    }

    public static String convertBinToOct(int num) {
        return Integer.toOctalString(num);
    }

    public static boolean checkBinOctHex(String strNum) {
        /*int num_2 = Integer.parseInt(strNum, 2);
        System.out.println(num_2);
        int num_8 = Integer.parseInt(strNum, 8);
        System.out.println(num_8);
        int num_16 = Integer.parseInt(strNum, 16);
        System.out.println(num_16);*/

        return true;
    }
}
