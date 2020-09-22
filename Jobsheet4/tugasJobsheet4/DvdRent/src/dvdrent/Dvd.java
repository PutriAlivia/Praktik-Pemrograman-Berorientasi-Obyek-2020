/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrent;

/**
 *
 * @author ACER A315-41
 */
public class Dvd {
    private String merk;
    private String judul;
    
    public Dvd(){
    }
    public String getmerk(){
        return merk;
    }
    public String getJudul(){
        return judul;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
   
     public String info(){
        String info = " ";
        info += "Jenis DVD : " + this.merk + "\n";
        info += "Judul DVD : " + this.judul + "\n";
        return info;
    }
}
