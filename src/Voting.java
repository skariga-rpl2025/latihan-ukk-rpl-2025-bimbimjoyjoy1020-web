/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author jevann
 */

public class Voting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pilih;
        int suaraA = 0, suaraB = 0;

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B) atau 'selesai': ");
            pilih = sc.nextLine();

            if (pilih.equalsIgnoreCase("selesai")) {
                break;
            } else if (pilih.equalsIgnoreCase("A")) {
                suaraA++;
            } else if (pilih.equalsIgnoreCase("B")) {
                suaraB++;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        System.out.println("=== HASIL VOTING ===");
        System.out.println("Kandidat A: " + suaraA + " suara");
        System.out.println("Kandidat B: " + suaraB + " suara");
    }
}

