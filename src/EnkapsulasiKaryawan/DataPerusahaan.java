/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnkapsulasiKaryawan;

/**
 *
 * @author jevann
 */
public class DataPerusahaan {
    public static void main(String[] args) {
        Karyawan k = new Karyawan();

        k.setNIP("K001");
        k.setNama("Budi Hartono");
        k.setDivisi("Marketing");

        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("NIP     : " + k.getNIP());
        System.out.println("Nama    : " + k.getNama());
        System.out.println("Divisi  : " + k.getDivisi());
    }
}

