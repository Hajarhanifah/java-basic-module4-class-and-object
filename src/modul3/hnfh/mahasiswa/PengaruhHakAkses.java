/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.mahasiswa;

/**
 *
 * @author hajarhanifah
 */
public class PengaruhHakAkses {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nim = 123456; // benar, karena nim == public
        mhs.name = "Jaenal Abidin";
       // mhs.ipk = 3.77; // salah, karena ipk == private
        
        mhs.setIpk(3.77);
        System.out.println("NIM     : "+mhs.nim);
        System.out.println("Nama        : "+mhs.name);
        System.out.println("IPK     : "+mhs.getIpk());
    }

}
