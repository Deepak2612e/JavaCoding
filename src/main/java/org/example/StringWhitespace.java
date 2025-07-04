package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringWhitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder str2 = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                str2.append(str.charAt(i));
            }
        }
        System.out.println(str2);

//        String st = str.replaceAll(" ","");
//        System.out.println(st);
    }
}
