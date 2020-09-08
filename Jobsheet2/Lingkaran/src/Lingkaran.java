
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
public class Lingkaran {
  public static void main(String[] args) {
    double r, luas, keliling, phi = 3.14;
      Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang jari-jari lingkaran: ");
    r = scan.nextDouble();
    luas = phi * r * r;
    keliling = 2 * phi * r;
    System.out.println("Luas Lingkaran adalah "+luas);
    System.out.println("Keliling Lingkaran adalah " + String.format("%.2f", keliling));
  }
}
 