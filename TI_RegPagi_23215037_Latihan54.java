/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan54.koordinat;

/**
 *
 * @author 
 * Nama : Arrijal Tanzil Maulana 
 * NIM : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang warna koordinat dari koordinat
 *                     x dan y.
 */
public class TI_RegPagi_23215037_Latihan54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new  WarnaKoordinat(0,0,"");
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " 
                            + wk.getY());
    }
    
}
