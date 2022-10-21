/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3.hnfh.innerclass;

/**
 *
 * @author hajarhanifah
 */
public class Notebook {

    private String merk = "Lenovo";

    class SistemOperasi {

        private String osName = "Windows";

        public void cekData() {
            System.out.println("Merk NoteBook : " + merk);
            System.out.println("Sistem Operasi : " + osName);
        }

    }

    public void getData() {
        SistemOperasi os = new SistemOperasi();
        os.cekData();
    }
}
