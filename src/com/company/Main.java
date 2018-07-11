package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner (System.in);
           System.out.println("nhap gia tri a, b cua ham so bac nhat vao:");
        //float x = scanner.nextFloat();
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if(a == 0 && b != 0) {
            System.out.println("ham so vo nghiem");
        }
           else if(a == 0 && b == 0){
               System.out.println("ham so vo so nghiem");
        }
              else if (a != 0 && b == 0){
                  System.out.println("ham so co nghiem bang 0");
        }
                    else if ( a != 0 && b != 0){
                       float c = a/b;
                       System.out.println("ham so co nghiem la:" +c);
        }

    }
}
