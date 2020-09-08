
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
public class BinaryTreeMain {
        public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
            Scanner input = new Scanner(System.in);
        int pilih,data1,data2,data3;
        
        do {            
            System.out.println("=======================================");
            System.out.println(" MENU  BINARY TREE ");
            System.out.println("=======================================");
            System.out.println(" Memilih Menu ");
            System.out.println(" 1. Add ");
            System.out.println(" 2. Delete ");
            System.out.println(" 3. Find ");
            System.out.println(" 4. traverse inOrder");
            System.out.println(" 5. traverse preOrder ");
            System.out.println(" 6. traverse postOrder ");
            System.out.println(" 7. Keluar ");
            System.out.println("=========================================");
            System.out.print(">> ");
            pilih = input.nextInt();
            System.out.println("=========================================");
            
            switch(pilih){
                    case 1:
                        System.out.print(" Masukkan Data: ");
                        data1 = input.nextInt();
                        bt.add(data1);
                        break;

                    case 2:
                        System.out.print(" Masukkan Data: ");
                        data2 = input.nextInt();
                        bt.delete(data2);
                        break;
                        
                    case 3: 
                        System.out.print(" Masukkan Data: ");
                        data3 = input.nextInt();                        
                        bt.find(data3);
                        break;
                        
                    case 4:
                        bt.traverseInOrder(bt.root);                        
                        break;
                        
                    case 5: 
                        bt.traversePreOrder(bt.root);                        
                        break;
                        
                    case 6:
                        bt.traversePostOrder(bt.root);
                        break;
                }
            
             } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 );
        
            }
}
