/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.tipedata;

/**
 *
 * @author hajarhanifah
 */
public class Pegawai {
    String name;
    final double bonusLembur = 50000.0;
    
    double hitungBonusLembur(double jumlahLembur){
        return bonusLembur * jumlahLembur;
    }
    
}
