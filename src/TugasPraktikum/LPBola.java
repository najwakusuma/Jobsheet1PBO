/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LPBola {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan r : ");
        double r = masukan.nextDouble();
        System.out.print("Masukkan phi : ");
        double phi = masukan.nextDouble();
        System.out.println("Luas Permukaan Bola : " + (4*phi*r*r));
    }
}
