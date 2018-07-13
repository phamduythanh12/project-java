package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
         int a =  5 > 7 ? 2 : 1;
        System.out.println(+a);
        float sum = 0;
        int count = 0, subjects = 3;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the marks for " + subjects + " subjects: ");
        while (count < subjects) {
            System.out.print("#" + (count+1) + ": ");
            float mark = input.nextFloat();
            if (mark < 0) {
                System.out.println(mark + " ignored");
                continue;
            }
            sum += mark;
            count++;
        }
        System.out.print("Average mark = "+sum/subjects);
    }
}
