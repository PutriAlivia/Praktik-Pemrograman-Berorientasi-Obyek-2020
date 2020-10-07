/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class MainGaji {
    public static void main(String[] args) {
        Staf s1 = new Staf();
        s1.setNama("Putri");
        s1.setKehadiran(20);
        
        Dosen d1 = new Dosen();
        d1.setNama("Alivia");
        d1.setSKS(12);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Aliya");
        
        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(s1);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }    
    }
