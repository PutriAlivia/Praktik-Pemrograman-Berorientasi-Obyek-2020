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
public class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, namaku Putri Alivia" + this.nama);
        System.out.println("Aku berkuliah di kampus Politeknik Negeri Malang");
    }
     @Override
    public void lulus() {
        System.out.println("Aku mahasiswa,Namaku Putri Alivia");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("Aku berkuliah di Polinema");   
    }
}
