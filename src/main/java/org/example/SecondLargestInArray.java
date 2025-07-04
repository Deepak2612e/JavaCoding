package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);

//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);

    }
}
