package com.juaracoding;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int tinggi = 0,lebar;

        String kata = "Tess";

        while (kata.length()<12) {

            kata = kata + "y";

        }

        System.out.println(kata);
        //System.out.println("Masukkan tinggi: ");
        //tinggi = inputScanner.nextInt();
        //System.out.println("Masukkan lebar: ");
        //lebar = inputScanner.nextInt();

        //while (tinggi < 5){
            //System.out.print(tinggi);
            //tinggi++;
        //}

        //for (int i = 1; i <= tinggi; i++) {
            //for (int j = tinggi - i; j >= 1; j--) {
                //System.out.print(" ");
            //}

            //for (int k = 1; k <= i * 2 - 1; k++) {
                //System.out.print("*");
            //}

            //System.out.println();
        //}

        System.out.println();

        for (int i = 0; i < 5; i++) {

            System.out.print("Heu");

            if (i == 3) {

                break;

            }

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            if (i == 3) {

                continue;

            }

            System.out.print("Heu");

        }
    }
}
