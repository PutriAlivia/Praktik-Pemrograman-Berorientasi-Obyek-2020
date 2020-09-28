/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Manusia {
    private int umur;
    private String nama;
    private boolean dewasa;
    
    Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }
    
public void setUmur(int umur){
       this.umur = umur;
   }
   public void setNama(String nama){
       this.nama = nama;
   }
   public String getNama(){
       return nama;
   }
   public int getUmur(){
       return umur;
   }
   public void setDewasa(boolean dewasa){
       this.dewasa = dewasa;
   }
   public boolean getDewasa(){
       return dewasa;
   }
public String info(){
    String info = " ";
        info +="Nama Anak = "+ nama;
        info +="Umur = "+ umur;
        info +="Kategori = "+ dewasa;
    return info;
    }
  
}
