package com.company;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        if(num1>=1)
            System.out.print("1");

        for(int i=2;i<=num1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
        }
    }
}
