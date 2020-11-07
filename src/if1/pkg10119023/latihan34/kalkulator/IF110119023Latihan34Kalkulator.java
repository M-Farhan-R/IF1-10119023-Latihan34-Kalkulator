/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan34.kalkulator;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;
public class IF110119023Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Kalkulator k = new Kalkulator();
        System.out.println("====Aplikasi Klakulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        k.value1 = scan.nextDouble();
        System.out.print("MAsukkan Angka ke-2 : ");
        k.value2 = scan2.nextDouble();
        System.out.println();
        
        k.tambahBilangan();
        k.kurangBilangan();
        k.kaliBilangan();
        k.bagiBilangan();
        k.sisaBilangan();
    }

}
