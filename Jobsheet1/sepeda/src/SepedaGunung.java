/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Putri Alivia
 * TI-2C
 * 1941720108
 */
public class SepedaGunung extends Sepeda
{
   private String tipeSuspensi;
   
   public void setTipeSuspensi(String newValue)
   {
       tipeSuspensi = newValue;
   }
   
   public void cetakStatus()
   {
       super.cetakStatus();
       System.out.println("Tipe Suspensi: " + tipeSuspensi);
       
   }
         
}
