package com.company;

import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        System.out.println("nhap diem trung binh cua ban");
        Scanner scanner = new Scanner(System.in);
           String TB = scanner.nextLine();
           float x = scanner.nextFloat();
             switch (TB){
                 case "A" : System.out.println("gioi"); break;
                 case "B" : System.out.println("kha"); break;
                 case "C" :
                 case "D" : System.out.println("trung binh"); break;
                 case "F" : System.out.println("hoc lai"); break;
                 default:
                     System.out.println("nhap lai");
             }
    }
}
