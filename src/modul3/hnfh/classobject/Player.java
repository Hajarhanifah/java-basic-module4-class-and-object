/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.classobject;

/**
 *
 * @author hajarhanifah
 */
public class Player {
    
    // attribute
    String name;
    int speed;
    int healthPoint;
    
    void run(){
        System.out.println(name+" is running ...");
        System.out.println("Speed : "+speed);
    }
    
    /*check healthPoint
    * Dead : healthPoint == 0
    * return true if healthPoint <= 0
    */
    
    boolean isDead(){
        return healthPoint<=0 ;
    }
}
