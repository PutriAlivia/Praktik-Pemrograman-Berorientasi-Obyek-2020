/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class HitungMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 21;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 4;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga msegitiga = new Segitiga();
        msegitiga.alas = 14;
        msegitiga.tinggi = 7;
        
        
        // memanggil method luas dan keliling
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        msegitiga.luas();
        msegitiga.keliling();
    }
}   
