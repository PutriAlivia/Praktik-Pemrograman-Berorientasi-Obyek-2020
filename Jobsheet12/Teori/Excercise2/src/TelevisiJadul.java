/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class TelevisiJadul extends Elektronik{
    private String modelInput;
    
    public TelevisiJadul(){
 
    }
    public String getModelInput(){
        modelInput = "DVI";
        System.out.println("Nyalakan televisi jadul dengan input: " + modelInput);
        return modelInput;
    }
}
