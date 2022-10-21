/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.karyawan;

/**
 *
 * @author hajarhanifah
 */
public class ImplementasiMethodBerparameter {
    public static void main(String[] args){
        Employee employee = new Employee();
        
        employee.setEmployee("K001", "Rommy Rafael", 
                "Marketing", 4000000.00);
        
        // call method getEmployee()
        employee.getEmployee();
    }
}
