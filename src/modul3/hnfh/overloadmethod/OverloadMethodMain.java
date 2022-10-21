/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.overloadmethod;

/**
 *
 * @author hajarhanifah
 */
public class OverloadMethodMain {
    public static void main (String[] args){
        Pembagian pembagian = new Pembagian();
        int x = pembagian.bagi(10,4);
        double y = pembagian.bagi(10.0, 4.0);
        
        System.out.println("Hasil bagi tipe int         : "+x);
        System.out.println("Hasil bagi tipe double  : "+y);
        
    }
    
}
