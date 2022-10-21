/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.staticmethod;

/**
 *
 * @author hajarhanifah
 */
public class StaticMethod {
    static int dataA = 10;
    static int dataB = 7;
    int dataC = 4; // data non-static
    
    static void test(){
        int dataC = dataA+dataB;
        System.out.println("Data A + Data B = "+ dataC);
    }
    
    public static void main(String[] args){
        test();
    }
    
}
