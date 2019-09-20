package com.company;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        Scanner sc1 =new Scanner(System.in);

        String str1= sc.nextLine();
        int num1 =sc.nextInt();

        int len=str1.length();
        System.out.print(str1);

        int temp=num1;
        String str2=str1.substring(len-num1,len);
        while (temp>0)
        {
            temp--;
        System.out.print(str2);
        }
    }
}
