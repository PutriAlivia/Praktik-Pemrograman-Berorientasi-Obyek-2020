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
public class Node {
    int data;
    Node prev,next;
    
  Node(Node prev, int data, Node next){
      this.prev = prev;
      this.data = data;
      this.next = next;
  }
}
