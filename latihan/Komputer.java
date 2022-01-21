package com.aufar.pbo.modul7.latihan;

public class Komputer {
    String cekInfo() {
        return "Ini berasal dari class Komputer";
    }
}

class Laptop extends Komputer {

    String cekInfo() {
        System.out.println(super.cekInfo());
        return "Ini berasal dari class Laptop";
    }
}

class BelajarJava {
    public static void main(String args[]){

        Laptop laptopAndi = new Laptop();
        System.out.println(laptopAndi.cekInfo());

    }
}
