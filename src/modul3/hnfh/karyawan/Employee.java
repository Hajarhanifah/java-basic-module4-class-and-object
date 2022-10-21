/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.karyawan;

/**
 *
 * @author hajarhanifah
 */
public class Employee {
    String id;
    String name;
    String division;
    double salary;

    // Constructor
    public Employee() {
        id = "K001";
        name =  "Taemin";
        division = "Dancer";
        salary = 2000000.0;
    }
    
    // Dynamic Constructor
    public Employee(String id, String name, String div, double salary){
        this.id= id;
        this.name = name;
        this.division = div;
        this.salary = salary;
    }
 
    // Set Variable employee
    void setEmployee(String id, String name, String div, double salary){
        this.id= id;
        this.name = name;
        this.division = div;
        this.salary = salary;
    }
    
    // get Employee data
    void getEmployee(){
        System.out.println("Data Karyawan");
        System.out.println("Id      : "+id);
        System.out.println("Nama      : "+name);
        System.out.println("Divisi      : "+division);
        System.out.println("Gaji      : "+salary);
    }
    
    // how to return double / calculate zakat
    double getZakat() {
        double zakat = salary *0.025;
        return zakat;
    }
    
    
}
