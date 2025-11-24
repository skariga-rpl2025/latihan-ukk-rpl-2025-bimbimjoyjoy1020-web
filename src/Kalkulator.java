/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author jevann
 */

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih menu (1-4): ");
        int pilih = input.nextInt();

        System.out.print("Masukkan Angka 1: ");
        double a = input.nextDouble();
        System.out.print("Masukkan Angka 2: ");
        double b = input.nextDouble();

        double hasil = 0;

        switch (pilih) {
            case 1 -> hasil = a + b;
            case 2 -> hasil = a - b;
            case 3 -> hasil = a * b;
            case 4 -> hasil = a / b;
            default -> System.out.println("Pilihan tidak valid!");
        }

        System.out.println("Hasil: " + hasil);
    }
}
