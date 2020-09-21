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
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    public KeretaApi(String nm, String kls, Pegawai msns){
        nama = nm;
        kelas = kls;
        masinis = msns;
    }
    public KeretaApi(String nam, String kel, Pegawai msn, Pegawai asis){
        nama = nam;
        kelas = kel;
        masinis = msn;
        asisten = asis;
    }
    public String getnama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public Pegawai getMasinis(){
        return masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKelas(String kelas){
        this.kelas=kelas;
    }
    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }
    public String info(){
        String info = " ";
        info+= "Nama: "+this.nama +"\n";
        info+="Kelas: "+this.kelas + "\n";
        info+="Masinis=> "+this.masinis.info()+"\n";
        info+="Asisten=> "+ this.asisten.info() +"\n";
        return info;
    }
}

