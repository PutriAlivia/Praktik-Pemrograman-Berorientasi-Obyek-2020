/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Staf extends Pegawai{
    
    private int jumlah_kehadiran;
    private final int TARIF_HARIAN = 50000;
    
    public Staf(){
        
    }
 
    public Staf(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }    
    
    public void setKehadiran(int jumlah_kehadiran){
        this.jumlah_kehadiran = jumlah_kehadiran;
    }
    
    @Override
    public int getGaji(){
        int total_gaji = jumlah_kehadiran*TARIF_HARIAN;       
        return total_gaji+super.getGaji();
    }
}
