/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Tabung extends Bangun{
    protected int t;
    public void  setSuperPhi(Double phi){
    super.phi = phi;
    }
    
    public void setSuperR(int r){
    super.r = r;
    }
    public void setSuperT(int t){
    this.t = t;
    }
    public void volume(){
        System.out.println("Volume Tabung adalah: " +(super.phi*super.r*super.r*this.t));
    }
   
}
