/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Pria extends Manusia{
    private Wanita istri;
    private Manusia manusia;
    public int umur;
    
public Pria(int umur, String nama, boolean dewasa){
        super(umur, nama, dewasa);
}
public void Pria(Wanita istri){
       this.istri = istri;
   }
   public void setIstri(Wanita istri){
       this.istri = istri;
   }
   public Wanita getIstri(){
       return istri;
   }
   public void setManusia(Manusia manusia){
       this.manusia = manusia;
   }
   public Manusia getManusia(){
       return manusia;
   }
   public void setUmur(int umur){
       this.umur = umur;
   }
   public int getUmur(){
       if(umur >= 22){
           System.out.println("Dewasa");
       }else if ( umur <= 22){
           System.out.println("Pria ini masih kuliah");
       }
       return umur;
   }

public String info(){
    String info ="";
    info +="Nama : "+this.manusia+" ";
    info +="Kategori : "+this.istri+" ";
return info();
}
}
