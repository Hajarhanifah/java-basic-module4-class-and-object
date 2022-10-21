/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.handphone;

/**
 *
 * @author hajarhanifah
 */
public class Hewan {
    String namaHewan;
    String jenis;
    int umur;
    String pemilik;
    
    public Hewan(String namaHewan, String jenis, int umur, String pemilik){
        this.namaHewan = namaHewan;
        this.jenis = jenis;
        this.umur = umur;
        this.pemilik = pemilik;
    }
    
    public void getHewan(){
        System.out.println("Nama Hewan              : "+namaHewan);
        System.out.println("Jenis Hewan                : "+jenis);
        System.out.println("Umur Hewan                : "+umur);
        System.out.println("Nama Pemilik Hewan  : "+pemilik);
    }
    
    public static void main(String[] args){
        Hewan hewan1 = new Hewan("Barbara", "Kucing", 3, "Jeno");
        Hewan hewan2 = new Hewan("Cireng", "Anjing", 3, "Lucas");
        Hewan hewan3 = new Hewan("Basreng", "Kalajengking", 3, "Mark");
        
        System.out.println("DATA HEWAN");
        System.out.println("____________________");
        hewan1.getHewan();
        hewan2.getHewan();
        hewan3.getHewan();
    }
}
