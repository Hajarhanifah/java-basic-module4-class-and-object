/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.karyawan;

/**
 *
 * @author hajarhanifah
 */
public class ImplementasiMethodNonVoid {
    public static void main(String[] args){
        Employee employee = new Employee();
        
        employee.id = "K001";
        employee.name = "Agus Ramadhan";
        employee.division = "Finance";
        employee.salary = 1800000.0;
        
        // call method getEmployee()
        employee.getEmployee();
        
        System.out.println("Sumbangan Zakat     : "+employee.getZakat());
    }
}
