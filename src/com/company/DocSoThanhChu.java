package com.company;

import java.util.Scanner;

public class DocSoThanhChu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so bat ky");
        int x = scanner.nextInt();
        int hangDonVi, hangChuc,hangTram;
           hangDonVi = x%10;
           hangChuc = (x%100)/10;
           hangTram= (x/100);
             //System.out.println("hang don vi"+hangDonVi);
          if ( x >= 10 && x < 20){
              docSoHangMuoi(x);
          }   else {
                switch(hangTram){
                    case 1:
                        System.out.print("one-hundred ");break;
                    case 2:
                        System.out.print("two-hundred ");break;
                    case 3:
                        System.out.print("three-hundred ");break;
                    case 4:
                        System.out.print("four-hundred ");break;
                    case 5:
                        System.out.print("five-hundred ");break;
                    case 6:
                        System.out.print("six-hundred ");break;
                    case 7:
                        System.out.print("seven-hundred ");break;
                    case 8:
                        System.out.print("eight-hundred ");break;
                    case 9:
                        System.out.print("nine-hundred ");break;
                }
                if (hangChuc == 1){
                    int hangMuoi = x%100;
                    docSoHangMuoi( hangMuoi);
                } else {
                    docSoHangChuc(hangChuc);
                    docSoHangDonVi(hangDonVi);
                }
              }
    }


       public static void docSoHangMuoi(int x){
        switch(x){
            case 10:
                System.out.print("ten");break;
            case 11:
                System.out.print("eleven");break;
            case 12:
                System.out.print("twelve");break;
            case 13:
                System.out.print("thirteen");break;
            case 14:
                System.out.print("fourteen");break;
            case 15:
                System.out.print("fifteen");break;
            case 16:
                System.out.print("sixteen");break;
            case 17:
                System.out.print("seventeen");break;
            case 18:
                System.out.print("eighteen");break;
            case 19:
                System.out.print("nineteen");break;

        }
    }
    public static void docSoHangChuc(int x){
        switch(x){
            case 2:
                System.out.print("twenty ");break;
            case 3:
                System.out.print("thirty ");break;
            case 4:
                System.out.print("fourty ");break;
            case 5:
                System.out.print("fifty ");break;
            case 6:
                System.out.print("sixty ");break;
            case 7:
                System.out.print("seventy ");break;
            case 8:
                System.out.print("eighty ");break;
            case 9:
                System.out.print("ninety ");break;
        }
    }
    public static void docSoHangDonVi(int x){
        switch(x){
            case 1:
                System.out.print("one ");break;
            case 2:
                System.out.print("two ");break;
            case 3:
                System.out.print("three ");break;
            case 4:
                System.out.print("four ");break;
            case 5:
                System.out.print("five ");break;
            case 6:
                System.out.print("six ");break;
            case 7:
                System.out.print("seven ");break;
            case 8:
                System.out.print("eight ");break;
            case 9:
                System.out.print("nine ");break;
        }
    }
}
