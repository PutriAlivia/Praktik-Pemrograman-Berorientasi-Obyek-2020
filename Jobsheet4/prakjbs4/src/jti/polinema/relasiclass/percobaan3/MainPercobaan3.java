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
public class MainPercobaan3 {
 public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234","Putri Alivia ");
        Pegawai asisten = new Pegawai("4567","Siena Koenig");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masinis,asisten);
        
        System.out.println(keretaApi.info());
    }   
}
