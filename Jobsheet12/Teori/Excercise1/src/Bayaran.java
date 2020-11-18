/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Bayaran {
    public int hitungBayaran(Pegawai pg){
        int uang = pg.getGaji();
        
        if (pg instanceof Manajer) {
            uang += ((Manajer)pg).getTunjngan();
        }
        else if (pg instanceof Manajer) {
            uang +=((Programmer)pg).getBonus();
            
        }
        return uang;
    }
}
