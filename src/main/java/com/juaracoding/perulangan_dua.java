package com.juaracoding;

import java.util.Scanner;

public class perulangan_dua {
    static Scanner input = new Scanner(System.in);
    static int angka;
    public static void main(String[] args){

        while (true){
            hitung(6,7);
            System.out.println();
            System.out.println("Apakah kamu ingin lanjutkan perhitungan [y/t] :");
            String jawab = input.next();

            if (jawab.equalsIgnoreCase("t")){
                break;
            }
        }
        System.out.println("Perhitungan selesai");
    }
    static int hitung (int gaji, int bro){
        System.out.println("Masukan angka-nya berapa : ");
        angka = input.nextInt();

        for (int i=angka; i >=0; i--){
            System.out.print(i+", ");
        }
        return gaji*bro;
    }
}
