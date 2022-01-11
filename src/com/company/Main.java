package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        // nhap a, b. c tu ban phim
        do {
            System.out.println("nhap a: ");
            a = sc.nextFloat();
            System.out.println("nhap b: ");
            b = sc.nextFloat();
            System.out.println("nhap c: ");
            c = sc.nextFloat();
            if (a == 0) {
                System.out.println("Nhap lai he so a");
            }
        } while (a == 0);

        PhuongTrinhBacHai giaiPhuongTrinhBacHai = new PhuongTrinhBacHai(a, b, c);
        double delta = giaiPhuongTrinhBacHai.getDiscriminant();
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!!!");
        } else if (delta == 0){
            System.out.printf("Phuong trinh co nghiem kep x = %.2f",giaiPhuongTrinhBacHai.getRoot1());
        }else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.printf("x1= %.2f",giaiPhuongTrinhBacHai.getRoot1());
            System.out.println();
            System.out.printf("x2= %.2f",giaiPhuongTrinhBacHai.getRoot2());
        }


    }
}
