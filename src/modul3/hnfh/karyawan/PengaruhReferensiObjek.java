/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.karyawan;

/**
 *
 * @author hajarhanifah
 */
public class PengaruhReferensiObjek {
    public static void main (String[] args){
        
        Employee employee01 = new Employee();
        Employee employee02 = employee01;
        
        //insert data
        employee01.name = "Mischella";
        employee01.division ="HRD";
        
        System.out.println("Data Karyawan 1");
        System.out.println("Nama        : "+employee01.name);
        System.out.println("Divisi      : "+employee01.division);
        System.out.println("_____________________________");
        System.out.println("Data Karyawan 2");
        System.out.println("Nama        : "+employee02.name);
        System.out.println("Divisi      : "+employee02.division);
    }
}
