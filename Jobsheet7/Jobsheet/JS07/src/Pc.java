/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class Pc extends Komputer {
    public int ukuranMonitor;

    public Pc(){

    }
    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("=================PC================");
        super.tampilData();
        System.out.println("Ukuran monitor      :"+ukuranMonitor);
    }
    
}
