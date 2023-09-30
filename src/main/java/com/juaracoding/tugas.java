package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class tugas {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Kata: ");
        String kata = input.nextLine();

        //menghitung jumlah karakter
        int panjangString = kata.length();
        System.out.println(panjangString);

        //kata menjadi huruf besar
        String uppercaseString = kata.toUpperCase();
        System.out.println(uppercaseString);

        // kata menjadi huruf kecil (lowercase)
        String lowercaseString = kata.toLowerCase();
        System.out.println(lowercaseString);

        //mengambil substring dari kata
        String subKata = kata.substring(7, 10);
        System.out.println(subKata);

    }
}
