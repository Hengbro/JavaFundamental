package com.juaracoding;
import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int nilai;
        String keterangan;

        System.out.println("Masukkan nilai: ");
        nilai = inputScanner.nextInt();
        if (nilai >= 90 && nilai <= 100) {
            keterangan = "Sangat Baik";
            System.out.println("Kamu lulus dengan nilai " + nilai);
            System.out.println("Keterangan nilai A : " + keterangan);
        } else if (nilai >= 80 && nilai < 90) {
            keterangan = "Baik";
            System.out.println("Kamu lulus dengan nilai " + nilai);
            System.out.println("Keterangan nilai B : " + keterangan);
        } else if (nilai >= 60 && nilai < 80) {
            keterangan = "Cukup";
            System.out.println("Kamu lulus dengan nilai " + nilai);
            System.out.println("Keterangan nilai C : " + keterangan);
        } else if (nilai >= 40 && nilai < 60) {
            keterangan = "Kurang";
            System.out.println("Kamu belum lulus dengan nilai " + nilai);
            System.out.println("Keterangan nilai D : " + keterangan);
        } else if (nilai >= 0 && nilai < 40) {
            keterangan = "Sangat Kurang";
            System.out.println("Kamu belum lulus dengan nilai " + nilai);
            System.out.println("Keterangan nilai E : " + keterangan);
        } else {
            System.out.println("Nilai tidak valid");
        }
        inputScanner.close();
    }
}
