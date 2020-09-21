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
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    public Pelanggan(){
    }
    public String getnama(){
        return nama;
    }
    public Mobil getmobil(){
        return mobil;
    }
    public Sopir getsopir(){
        return sopir;
    }
    public int gethari(){
        return hari;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setmobil(Mobil mobil){
        this.mobil=mobil;
    }
    public void setsopir(Sopir sopir){
        this.sopir=sopir;
    }
    public void sethari(int hari){
        this.hari=hari;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + 
                sopir.hitungBiayaSopir(hari);
    }
}

