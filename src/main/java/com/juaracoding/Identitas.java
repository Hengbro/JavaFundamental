package com.juaracoding;

import java.awt.*;

public class Identitas {
    public static void main(String[] args) {
        String namaPengguna;
        int jumlahView;
        String noTelp;
        String email;
        String alamat;
        boolean isAktif;
        String kataSandi;

        namaPengguna = "Hengki";
        noTelp = "+6282355";
        email = "hengki@gmail.com";
        kataSandi = "1234Heng";
        alamat = "Bahagia";
        jumlahView = 12;
        isAktif = true;

        System.out.print("nama            : "+namaPengguna);
        System.out.print("No Telepon      : "+noTelp);
        System.out.println("Email           : "+email);
        System.out.println("Kata Sandi      : "+kataSandi);
        System.out.println("Alamat          : "+alamat);
        System.out.println("Jumlah Penonton : "+jumlahView);
        System.out.println("Status          : "+isAktif);


        long l = 9223372036854775000l;
        int i = (int) l;
        System.out.println("Data I : "+i);


        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

    }
}
