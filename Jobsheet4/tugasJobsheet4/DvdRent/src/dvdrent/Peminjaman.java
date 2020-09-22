/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrent;

/**
 *
 * @author ACER A315-41
 */
public class Peminjaman {
    private String namaPeminjam;
    private String namaDvd;
    private int biaya;
    
    public Peminjaman(){
    }
    public String getNamaPeminjam(){
        return namaPeminjam;
    }
    
     public String getNamaDvd(){
        return namaDvd;
    }
    
    public int getbiaya(){
        return biaya;
    }
    public void setNamaPeminjam(String namaPeminjam){
        this.namaPeminjam = namaPeminjam;
    }
    
    public void setNamaDvd(String namaDvd){
        this.namaDvd = namaDvd;
    }
    
    public void setbiaya(int biaya){
        this.biaya=biaya;
    }
    public int hitungBiaya(int hari){
        return biaya*hari;
    }
}