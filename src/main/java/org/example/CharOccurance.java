package org.example;

import java.util.Scanner;

public class CharOccurance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
        }
        System.out.println(count);

//        long count2 = str.chars()
//                .filter(c -> c == ch)
//                .count();
//
//        System.out.println(count2);
    }
}
