/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasiclass.percobaan1;

/**
 *
 * @author ACER A315-41
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    public Laptop(){
    }
    public Laptop(String me, Processor pr){
        merk = me;
        proc = pr;   
    }
    public void setmerk(String merk){
        this.merk=merk;
    }
    public void setproc(Processor proc){
        this.proc = proc;
    }
    public String getmerk(){
        return merk;
    }
    public Processor getproc(){
        return proc;
    }
    public void info(){
        System.out.println("Merk Laptop = "+ merk);
        proc.info();
    }
}
