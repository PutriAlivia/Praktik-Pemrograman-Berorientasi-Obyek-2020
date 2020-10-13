
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A315-41
 */
public class MainInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        System.out.println("=================Program Tampil Spek Komputer================");
        System.out.println("1. Laptop Mac");
        System.out.println("2. Laptop Windows");
        System.out.println("3. Pc");
        System.out.println("4. Exit");
        System.out.println("pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                Mac m = new Mac();
                System.out.println("Masukan Merk : ");
                m.merk=input.next();
                System.out.println("Masukan Prosessor " + m.merk + " : ");
                m.kecProsesor = input.nextInt();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        Pc pc = new Pc("ASUS", 2, 7, "Inter core i5", 15);
        pc.tampilPc();

        Mac mac = new Mac("MacBook", 4, 8, "Quad-core i7", "Polimer", "Private internet access");
        mac.tampilMac();

        Windows windows = new Windows("HP", 3, 6, "Intel core i7", "Li-ion", "Ai");
        windows.tampilWindows();
    }
    
}
