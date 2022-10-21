/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.karyawan;

/**
 *
 * @author hajarhanifah
 */
public class ImplementationEmployeeClass {

    public static void main(String[] args) {

        // create object Employee 
        Employee aurel = new Employee();
        Employee dhennis = new Employee();

        // add data
        aurel.id = "K001";
        aurel.name = "Aurel Dian Nitami";
        aurel.division = "Marketing";
        aurel.salary = 25000000;

        dhennis.id = "K002";
        dhennis.name = "Muhammad Dhennis";
        dhennis.division = "Finance";
        dhennis.salary = 22500000;

        //print the data
        System.out.println("ID          : " + aurel.id);
        System.out.println("Nama        : " + aurel.name);
        System.out.println("Division    : " + aurel.division);
        System.out.println("Salary      : " + aurel.salary);

        System.out.println("________________________________");
        System.out.println("ID          : " + dhennis.id);
        System.out.println("Nama        : " + dhennis.name);
        System.out.println("Division    : " + dhennis.division);
        System.out.println("Salary      : " + dhennis.salary);
    }

}
