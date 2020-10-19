/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Mesin{ 
    private String merek;
    public double kecepatan;

    public Mesin() {

    }

    public void setMerek(String merekMesin) {
        this.merek = merekMesin;
    }

    public String getMerek() {
        return merek;
    }

    public Double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        kecepatan += 15;
        System.out.println(kecepatan + " Km/jam");
    }

    public void kurangiKecepatan() {
        if (kecepatan == 0) {
            System.out.println("Tidak Bisa dikurangi");
        } else {
            kecepatan -= 10;
            System.out.println(kecepatan + " Km/jam");
        }
    }
}