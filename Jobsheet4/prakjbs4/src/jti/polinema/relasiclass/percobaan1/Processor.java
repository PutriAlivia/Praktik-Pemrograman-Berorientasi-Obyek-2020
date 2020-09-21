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
public class Processor {
    private String merk;
    private double cache;
    
    public Processor(){
    }
    public Processor(String me, double ca){
        merk = me;
        cache = ca;
    }
    public String getmerk(){
        return merk;
    }
    public double getcache(){
        return cache;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setcache(double cache){
        this.cache=cache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory  = %.2f\n", cache);
    }
}