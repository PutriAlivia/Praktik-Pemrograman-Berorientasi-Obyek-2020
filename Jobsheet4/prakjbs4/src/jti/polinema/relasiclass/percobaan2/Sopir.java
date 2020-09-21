/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan2;

/**
 *
 * @author ACER A315-41
 */
public class Sopir {
    private String nama;
    private int biaya;
    
    public Sopir(){
    }
    public String getnama(){
        return nama;
    }
    public int getbiaya(){
        return biaya;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setbiaya(int biaya){
        this.biaya=biaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya*hari;
    }
}
