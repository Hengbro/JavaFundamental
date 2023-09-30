package com.juaracoding;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int nilai;
        String keterangan;

        System.out.println("Masukkan nilai: ");

        switch ( nilai = inputScanner.nextInt() ) {
            case 1:
                System.out.println("nilai " + nilai);
                break;
            case 2:
                System.out.println("nilai " + nilai);
                break;
            default:
                break;
        }

    }

}
