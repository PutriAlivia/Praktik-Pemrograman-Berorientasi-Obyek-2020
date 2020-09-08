/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Barang {
   public int kode;
   public String namaProduk;
   public int harga;
   public int diskon;

   
   public int totalHarga(){
      int total;
      total = (harga * diskon)/100;
      return total;
   }   
   public void tampilData(){
       System.out.println("Kode Barang    : " +kode);
       System.out.println("Nama Barang    : "+namaProduk);
       System.out.println("Harga          : "+harga);
       System.out.println("Diskon         : "+diskon);
       System.out.println("Total harga    : "+totalHarga());
   }  
}
