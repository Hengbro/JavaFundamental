package com.juaracoding;

public class Main {
    public static void main(String[] args) {
        kotak(3);
        kotak(2);
        segitiga();
    }
    static void kotak (int sisi) {

        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void segitiga(){
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            // Membuat spasi untuk penataan segitiga
            for (int j = tinggi - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // Membuat karakter bintang untuk segitiga
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}