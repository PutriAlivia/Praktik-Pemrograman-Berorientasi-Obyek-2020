/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class MainManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa(); 
        System.out.println("-------------Manusia-------------");
        a.makan();
        a.bernafas();
        System.out.println("-------------Dosen-------------");
        a = b;
        a.makan();
        b.lembur();
        System.out.println("-------------Mahasiswa-------------");
        a = c;
        a.makan();
        c.tidur();
    }
}