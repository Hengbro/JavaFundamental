package com.juaracoding.bro;

public class kotak {
    int sisinya;
    public static int main(int sisinya) {

        for (int i = 0; i < sisinya; i++) {
            for (int j = 0; j < sisinya; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return sisinya;
    }
}
