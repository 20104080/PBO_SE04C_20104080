package com.aufar.pbo.modul7.latihan;

public class Penambahan {
    public void tambah1() {
        int a = 5, b = 10;
        System.out.println("Hasil Penambahann dari metod tambah1 ke-1 = " + (a + b));
    }

    public void tambah1(int x, int y) {
        System.out.println("Hasil Penambahann dari metod tambah1 ke-2 = " + (x + y));
    }

    public static void main(String[] args) {
        Penambahan pp;
        pp = new Penambahan();
        pp.tambah1();
        pp.tambah1(5, 5);
    }
}