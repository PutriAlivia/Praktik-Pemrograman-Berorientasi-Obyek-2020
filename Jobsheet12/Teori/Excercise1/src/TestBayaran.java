/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class TestBayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Manajer man = new Manajer(50, "Agus", 850);
        Programmer prog = new Programmer(30, "Budi", 630);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran Manajer: " + hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer: " + hr.hitungBayaran(prog));
    }
}
