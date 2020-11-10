package com.ivanfaathirza.kalkulator;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung tambah, kurang, kali
 * dan bagi menggunakan getter dan setter dengan berorientasi objek
 */

public class IF110119003Latihan48 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is = " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
}
