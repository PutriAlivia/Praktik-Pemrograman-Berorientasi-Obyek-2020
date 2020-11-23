/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    private int thnSekarang;
    
    
    public MediaInformasi(){
        
    }
    public MediaInformasi(int jmlHalaman, int thnSekarang){
        this.jmlHalaman = jmlHalaman;
        this.thnSekarang = thnSekarang;
    }
    
    
    public int getThnSekarang(int tahun){
        this.thnSekarang = tahun;
        return thnSekarang;
    }
    
    public void setJmlHalaman(int jmlHalaman){
        this.jmlHalaman = jmlHalaman;
    }
    
    @Override 
    public void reputasi(){
        System.out.println("Ini Reputasi nya");
    }
    
    @Override
    public void alamatPenerbit(String alamat){
       System.out.println("Alamat Penerbit : " + alamat);
    }
    
    @Override
    public void tahunBerdiri(int tahun){
        System.out.println("Penerbit ini berdiri pada tahun "+ tahun 
                + " sehingga penerbit ini sekaranag berusia = " + (thnSekarang - tahun) + "tahun"); 
    }
}
