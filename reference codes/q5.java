package com.company;

import java.util.Scanner;
public class q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        try {
            while (true) {
                System.out.println("Enter a number ");
                String str1 = sc.nextLine();
                if (str1.length() == 0){
                    break;
                }else {
                    sum += Integer.parseInt(str1);
                }
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception Occurs : "+e);
        }

        System.out.print("Sum equals " +sum);

    }
}
