/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrent;
public class MainDvdRent {
     public static void main(String[] args){
        Customer p = new Customer("12345", "Putri A"); 
        Admin a = new Admin("678910", "Livia");
        Dvd d = new Dvd();
        d.setmerk("DVD Film");
        d.setJudul("Jurassic Park");
        Peminjaman pm = new Peminjaman();
        pm.setNamaPeminjam("Putri A");
        pm.setbiaya(500000);
         System.out.println( a.info());
         System.out.println(p.info());
         System.out.println(d.info());
         System.out.println("Harga: ");
         System.out.println( pm.hitungBiaya(2));
}
}