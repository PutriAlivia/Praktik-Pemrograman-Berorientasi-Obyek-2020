/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author ACER A315-41
 */
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda..");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("----------------------------------------------");
    }
}
