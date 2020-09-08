
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
public class MainVideoGame {
    public static void main(String[] args) {
       peminjaman game1 = new peminjaman();
       game1.id =   1705;
       game1.namaMember = "Putri Alivia";
       game1.namaGame = "Dota 2";
       game1.harga =50000;
       game1.lamaSewa = 4;
       game1.tampilData();
    }
    
}
