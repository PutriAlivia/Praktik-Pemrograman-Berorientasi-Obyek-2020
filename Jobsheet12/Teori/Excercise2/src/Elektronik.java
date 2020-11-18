/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Elektronik {
   protected int voltase;
    
    public Elektronik(){
        
    }
    public int getVoltase(){
        voltase = 220;
        System.out.println("Voltase televisi: " + voltase);
        return voltase;
    }
}

