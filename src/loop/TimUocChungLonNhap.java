package loop;

import java.util.Scanner;

public class TimUocChungLonNhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 2 so nguyen duong: ");
        int soNguyenThuNhat = scanner.nextInt();
        int soNguyenThuHai = scanner.nextInt();

        while( soNguyenThuNhat != soNguyenThuHai){
            System.out.println("thanh");
            if(soNguyenThuNhat > soNguyenThuHai){

                soNguyenThuNhat = soNguyenThuNhat - soNguyenThuHai;
            } else {

                soNguyenThuHai = soNguyenThuHai - soNguyenThuNhat;
            }

        }
        System.out.println("uoc chung lon nhat cua 2 so la: " +soNguyenThuHai);

    }
}
