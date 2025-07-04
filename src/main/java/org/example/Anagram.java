package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.length() != str2.length())  {
            System.out.println(false);
        }

        else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            int flag = 0;
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i <arr1.length;i++)
            {
                if(arr1[i] != arr2[i])
                {
                    flag++;
                }
            }
            System.out.println(flag == 0);
        }
    }
}
