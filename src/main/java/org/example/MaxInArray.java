package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);

//        OptionalInt max2 = Arrays.stream(arr).max();
//        System.out.println(max2);
    }
}
