/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnkapsulasiKendaraan;

/**
 *
 * @author jevann
 */
public class DataParkir {
    public static void main(String[] args) {
        Kendaraan kd = new Kendaraan();

        kd.setNoPolisi("N 1234 AA");
        kd.setMerk("Toyota Avanza");
        kd.setTahun(2022);

        System.out.println("=== DATA KENDARAAN ===");
        System.out.println("No Polisi : " + kd.getNoPolisi());
        System.out.println("Merk      : " + kd.getMerk());
        System.out.println("Tahun     : " + kd.getTahun());
    }
}
