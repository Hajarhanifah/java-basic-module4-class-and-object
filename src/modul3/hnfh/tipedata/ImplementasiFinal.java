/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.tipedata;

/**
 *
 * @author hajarhanifah
 */
public class ImplementasiFinal {
    public static void main(String[] args){
        Pegawai pegawai = new Pegawai();
        pegawai.name = "Muhammad Onew Al-kadri";
        System.out.println("Data Karyawan   :   "+pegawai.name);
        System.out.println("Bonus Lembur    :   "+ pegawai.hitungBonusLembur(7));
        
    }
}
