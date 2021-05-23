package com.rajatigor.pbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // membuat objek HP
        Phone galaxyNote21 = new Samsung();

        // membuat objek user
        PhoneUser tigor = new PhoneUser(galaxyNote21);

        // kita coba nyalakan HP-nya
        tigor.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                tigor.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                tigor.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                tigor.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                tigor.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}
