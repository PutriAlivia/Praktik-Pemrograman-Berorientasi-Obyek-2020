/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class VideoGame {
   public int id;
   public int lamaSewa;
   public int harga;
   public String namaMember;
   public String namaGame;
   

   
   public void totalHarga(){
      int total;
      total = lamaSewa * harga;
      return total;
   }   
   public void tampilData(){
       System.out.println("Id              :" +id);
       System.out.println("Nama Member     : "+namaMember);
       System.out.println("Nama Game       : "+namaGame);
       System.out.println("Harga           : "+harga);
       System.out.println("Nama Game       : "+namaGame);
       System.out.println("Lama sewa       : "+namaGame);
       System.out.println("Total harga     : "+totalHarga());
   }  
}
