package com.juaracoding;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak belanja: ");
        int panjang = input.nextInt();
        String[] data = new String[panjang];

        System.out.println("Masukkan daftar belanja : ");
        for (int i = 0; i < panjang; i++) {
            data[i] = input.next();
        }
        System.out.print("Daftar belanja:");
        for (String number : data) {
            System.out.print(number+", ");
        }
        System.out.println();
        Arrays.sort(data);
        System.out.println("Daftar belanja setelah diurutkan:");
        for (String item : data) {
            System.out.print(item);
        }
        System.out.print("Masukkan daftar belanja yang ingin Anda cari: ");
        String itemCari = input.next();
        boolean ditemukan = false;


        for (String item : data) {
            if (item.equalsIgnoreCase(itemCari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(itemCari + " ditemukan dalam daftar belanja.");
        } else {
            System.out.println(itemCari + " tidak ditemukan dalam daftar belanja.");
        }
        // Menutup objek Scanner
        input.close();


        System.out.println("berbeda");
        int angka[] = new int[3];
        angka[0] = 3;
        angka[1] = 6;
        angka[2] = 3;
        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);

        //looping array
        String[] cars = {"Volvo","BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println();
        String[] carss = {"Volvo","BMW", "Ford", "Mazda"};

        for (String j : carss){
            System.out.println(j);
        }
    }

    public static void call(){

    }
}
