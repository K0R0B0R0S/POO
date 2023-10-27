package questao.dois;

import java.util.Scanner;

public class Substitui {
    public static String processa(String str) {
        str = str.toUpperCase();
        char[] strArray = str.toCharArray();
        String returnString = "";
        for (char i : strArray) {
            if (i == 'A') {
                i = '4';
            } else if (i == 'E') {
                i = '3';
            } else if (i == 'I') {
                i = '1';
            } else if (i == 'O') {
                i = '0';
            }
            returnString += i;
        }
        return returnString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(processa(s));
        sc.close();
    }

}
