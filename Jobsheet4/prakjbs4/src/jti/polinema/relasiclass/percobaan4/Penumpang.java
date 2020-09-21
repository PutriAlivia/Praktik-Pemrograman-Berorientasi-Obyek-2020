/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan4;

/**
 *
 * @author ACER A315-41
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    public Penumpang(String Ktp, String nm){
        ktp = Ktp;
        nama=nm;
    }
    public String getKtp(){
        return ktp;
    }
    public String getNama(){
        return nama;
    }
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public void setNama(String Nama){
        this.nama=Nama;
    }
    public String info(){
        String info = " ";
        info += "Ktp: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
    
}
