/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jevann
 */
import java.util.Scanner;

public class Pendaftaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lagi;
        int total = 0;

        do {
            System.out.print("Masukkan nama anggota: ");
            String nama = sc.nextLine();
            total++;

            System.out.print("Daftar anggota lagi? [ya/tidak] > ");
            lagi = sc.nextLine();
        } while (lagi.equalsIgnoreCase("ya"));

        System.out.println("Total anggota terdaftar hari ini: " + total);
    }
}
