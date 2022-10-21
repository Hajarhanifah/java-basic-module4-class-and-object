/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.handphone;

/**
 *
 * @author hajarhanifah
 */
public class Tanaman {
    String jenisTanaman;
    int usia;
    
    public Tanaman (String jenisTanaman, int usia){
        this.jenisTanaman = jenisTanaman;
        this.usia = usia;
    }
    
    boolean isPanen(){
        return usia >=3;
    }
    
    public static void main (String[] args){
        Tanaman tanaman = new Tanaman("Padi", 4);
        
        if(tanaman.isPanen()){
            System.out.println("Tanaman "+tanaman.jenisTanaman+ " SUDAH BISA DIPANEN!!");
        }else{
            System.out.println("Tanaman "+tanaman.jenisTanaman+ " BELUM BISA DIPANEN!!");
        }
    }
}
