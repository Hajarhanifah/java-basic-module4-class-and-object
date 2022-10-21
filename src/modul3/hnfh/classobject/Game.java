/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3.hnfh.classobject;

/**
 *
 * @author hajarhanifah
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //add object Player
        Player petani = new Player();
        
        // set attribute petani
        petani.name = "Petani Kode";
        petani.speed = 70;
        petani.healthPoint = 100;
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
    
}
