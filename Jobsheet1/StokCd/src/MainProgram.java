
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nama : putri alivia
 * NIM  : 1941720108
 * Kelas: TI-1A
 */
public class MainProgram {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("===================================");
        try{
        dll.removeFirst();
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        try{
        dll.add(40, 1);
        
        dll.removeLast(); 
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("=================================");
        dll.remove(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        dll.clear();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("Data awal pada Linked Lists adalah: "+dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: "+dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: "+dll.get(1));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
