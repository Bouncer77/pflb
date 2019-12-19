package ru.pflb.study.kosenkov.homework1;

public class NumberConverter {

    public static void main(String[] args) {
        //System.out.println(0b101); // output: 5

        System.out.println(Integer.parseInt("101", 2)); // output: 5
        //System.out.println(Integer.parseInt("0b101", 2)); // output: NumberFormatException
        /*System.out.println(convertDecToBin(5));
        System.out.println("***");
        System.out.println(convertDecToHex(5));
        System.out.println("***");
        System.out.println(convertBinToOct(0b101));
        System.out.println();
        System.out.println(checkBinOctHex("5"));*/
    }

    /* Преобразование десятичного числа в двоичное*/
    public static String convertDecToBin(int num) {
        return Integer.toBinaryString(num);
    }

    /* Преобразование десятичного числа в шестнадцатиричное*/
    public static String convertDecToHex(int num) {
        return Integer.toHexString(num);
    }

    /* Преобразование двоичного числа в восьмеричное*/
    public static String convertBinToOct(int num) {
        return Integer.toOctalString(num);
    }

    /* Валидациая входной строки на соответствие числу из одной из систем исчисления
    * 2-ой, 8-ой, 16-ой => return true, иначе false*/
    public static boolean isBinOROctORHex(String strNum){
        try {
            Long.parseLong(strNum, 16);
        }
        catch (NumberFormatException eHex){
            try {
                Long.parseLong(strNum, 8);
            }
            catch (NumberFormatException eOct){
                try {
                    Long.parseLong(strNum, 2);
                }
                catch (NumberFormatException eBin){
                    return false;
                }
            }
        }
        return true;
    }
}
