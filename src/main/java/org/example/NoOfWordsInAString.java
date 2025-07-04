package org.example;

import java.util.List;
import java.util.Scanner;

public class NoOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 1;
//        str = str.strip();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println(count);

//        String[] arr = str.split(" ");
//        System.out.println(arr.length);
    }
}
