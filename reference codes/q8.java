package com.company;

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){

            int num1 = sc.nextInt();
            if(num1>=1 && num1<=100)
            {
                System.out.println("Number guessed matches original number");
                break;
            }
            else if(num1<1)
            {
                System.out.println("Number guessed less than original number");

            }
            else
            {
                System.out.println("Number guessed greater than original number");

            }

        }
    }
}
