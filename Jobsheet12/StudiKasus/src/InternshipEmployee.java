/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class InternshipEmployee extends Employee{
    private int length;
    
    
    public InternshipEmployee(String name, int lenght){
        this.length = lenght;
        this.name = name;
    }
    
   public int getLenght(){
       return length;
   }
   public void setLength(int length){
       this.length = length;
   }
   @Override
   public String getEmployeeInfo(){
       String info = super.getEmployeeInfo()+"\n";
       info += "Registered as internship employee for "+ length;
       return info;
   }
    
}
