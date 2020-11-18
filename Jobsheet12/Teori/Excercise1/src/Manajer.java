/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Manajer  extends Pegawai{
    private int tunjangan;
    
    public Manajer(int tunjangan){
        this.tunjangan =  tunjangan;
    }
    public Manajer(int tunjangaan,String nama,int gaji){
        super(nama,gaji);
        this.tunjangan = tunjangan;
    }
    public int getTunjngan(){
        return tunjangan;
    }
    public int getGaji(){
        return gaji;
    }
}                                              
