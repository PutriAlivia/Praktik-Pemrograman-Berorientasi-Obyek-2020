/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan3;

/**
 *
 * @author ACER A315-41
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    public Pegawai(String np, String nm){
        nip= np;
        nama=nm;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String Nama){
        this.nama=Nama;
    }
    public String info(){
        String info = " ";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
    
}

