package Tugas7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("NAMA : Muhammad Tegar Abhiram");
        System.out.println("NIM : 215150700111009\n");

        Pegawai peg_1 = new PegawaiTetap("Bayu", "376742637824", 2000000);
        Pegawai peg_2 = new PegawaiTetap("Harsya", "376742637822", 1000000);
        Pegawai peg_3 = new PegawaiTetap("Atthar", "376742637826", 1500000);

        Pegawai peg_4 = new PegawaiHarian("Edo", "2746352767633", 8500, 40);
        Pegawai peg_5 = new PegawaiHarian("Dimas", "2746352767634", 10000, 35);
        Pegawai peg_6 = new PegawaiHarian("Dapit", "2746352767635", 7000, 50);

        Pegawai peg_7 = new Sales("Tika", "8267816257625", 50, 50000);
        Pegawai peg_8 = new Sales("Chika", "8267816257621", 60, 55000);
        Pegawai peg_9 = new Sales("Rossa", "8267816257622", 85, 65000);

        ArrayList<Pegawai> list = new ArrayList<Pegawai>();
        list.add(peg_1);
        list.add(peg_2);
        list.add(peg_3);
        list.add(peg_4);
        list.add(peg_5);
        list.add(peg_6);
        list.add(peg_7);
        list.add(peg_8);
        list.add(peg_9);

        for (Pegawai i : list) {
            i.toString();
        }

    }

}