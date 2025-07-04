package org.example;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String strRev = "";
        for(int i=str.length()-1;i >= 0;i--)
        {
            strRev += str.charAt(i);
        }
        System.out.println(strRev);

//        String str2 = new StringBuilder(str).reverse().toString();
//        System.out.println(str2);
    }
}
