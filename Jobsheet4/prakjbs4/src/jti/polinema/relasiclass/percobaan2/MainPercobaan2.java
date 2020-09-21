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
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setmerk("Avanza");
        m.setbiaya(350000);
        Sopir s = new Sopir();
        s.setnama("John Doe");
        s.setbiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setmobil(m);
        p.setsopir(s);
        p.sethari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());

    }
}
