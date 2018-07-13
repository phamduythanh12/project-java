package com.company;

public class ABC {
    public static void main(String[] args) {
        int sum = 1, i = 5;
        while(i < 7){
            if(i % 3 == 0){
                sum += i;
            }
               i++;
        }
        System.out.println(sum);
        for( int j = 1;j<2;++j){
            System.out.println("thanh");
            System.out.println(j);

        }
    }

}
