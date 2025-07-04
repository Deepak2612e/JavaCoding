package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayContains {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int flag = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] == target)
            {
                 flag = 1;
            }
        }
        if(flag == 1) System.out.println(true);
        else System.out.println(false);

//        List<Integer> list = List.of(arr);
//        System.out.println(list.contains(target));

    }
}
