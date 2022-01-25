package com.aufar.pbo.modul9.percobaan;

public class Percobaan1 {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[3] = 100;
            System.out.println("Nilai array a[3] = " + a[3]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks Array melebihi batas!");
        }
    }
}
