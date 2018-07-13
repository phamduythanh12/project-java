package com.company;
import java.util.Random;
import java.util.Scanner;

public class soXo {
    public static void main(String[] args){
       int loterry =  rand(0,100);
        System.out.println("so ngau nhien do la: "+loterry);
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhap so ban du doan:");
           int x1 = scanner.nextInt();
           int x2 = scanner.nextInt();


    }

        public static int rand(int min, int max) {
            try {
                Random rn = new Random();
                int range = max - min + 1;
                int randomNum = min + rn.nextInt(range);
                return randomNum;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }


    public static void taoXoSo(){
        int loterry =  rand(0,100);
        System.out.println("so ngau nhien do la: "+loterry);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ban du doan:");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();


    }


}

