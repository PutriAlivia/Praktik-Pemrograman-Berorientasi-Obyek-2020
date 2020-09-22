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
public class Admin {
    private String id;
    private String nama;
    
    public Admin(String Id, String nm){
        id= Id;
        nama=nm;
    }
    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNama(String Nama){
        this.nama=Nama;
    }
    public String info(){
        String info = " ";
        info += "No id admin : " + this.id + "\n";
        info += "Nama admin : " + this.nama + "\n";
        return info;
    }
    
}
