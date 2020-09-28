/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Wanita extends Manusia {
    private int umur;
    private Pria suami;
    private Manusia manusia;
public Wanita(int umur, String nama, boolean dewasa){
        super(umur, nama, dewasa);
}
  
   public void setsuami(Pria suami){
       this.suami = suami;
   }
   public Pria getsuami(){
       return suami;
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
           System.out.println("Wanita ini masih kuliah");
       }
       return umur;
   }
   
   public String info(){
    String info ="";
    info +="Nama : "+this.manusia+" ";
    info +="Kategori : "+this.suami+" ";
return info();
}
}