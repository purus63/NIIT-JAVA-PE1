package com.company;

import java.util.*;
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        int num1=0,flag=0;

        while (true)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                num1 = sc.nextInt();
                flag=1;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error " +e);
            }
            if(flag==1)
                break;
        }
            if(num1%2==0 && (num1>20 && num1<30 ))
                System.out.println("Jerry");
            else if(num1%2==1 &&(num1>20 && num1<30))
                System.out.println("Tom");
            else
                System.out.println("Number out of Range");
    }
}

