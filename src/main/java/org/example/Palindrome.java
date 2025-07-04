package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String strRev = "";
        for(int i=str.length()-1;i >= 0;i--)
        {
            strRev += str.charAt(i);
        }
        if(str.equals(strRev))
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

//        String str2 = new StringBuilder(str).reverse().toString();
//        System.out.println(str.equals(str2));
    }
}
