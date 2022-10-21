/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.karyawan;

/**
 *
 * @author hajarhanifah
 */
public class OverloadConstructor {
     public static void main(String[] args){
        Employee employee01 = new Employee("K003", 
                "Kim Kibum", "Singer", 2000000.0);
        Employee employee02 =  new Employee("K003", 
                "Lee Jin Ki", "Leader", 2000000.0);
        
        // call method getEmployee()
        employee01.getEmployee();
         System.out.println("_________________________");
        employee02.getEmployee();
    }
}
