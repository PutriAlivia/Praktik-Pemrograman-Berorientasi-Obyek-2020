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
public class Mobil {
    private String merk;
    private int biaya;
    
    public Mobil(){
    }
    public String getmerk(){
        return merk;
    }
    public int getbiaya(){
        return biaya;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setbiaya(int biaya){
        this.biaya=biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya*hari;
    }
}