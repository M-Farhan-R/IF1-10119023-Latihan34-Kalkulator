/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan34.kalkulator;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan(){
        double tambah = value1 + value2;        
        System.out.println("Hasil Pertambahan : "+tambah);
        return tambah;
    }
    
    public double kurangBilangan(){
        double kurang = value1 - value2;
        System.out.println("Hasil Pengurangan : "+kurang);
        return kurang;
    }
    
    public double kaliBilangan(){
        double kali = value1 * value2;
        System.out.println("Hasil Perkalian : "+kali);
        return kali;
    }
    
    public double bagiBilangan(){
        double bagi = value1/value2;
        System.out.println("Hasil Pembagian : "+bagi);
        return bagi;
    }
    
    public double sisaBilangan(){
        double sisa = value1%value2;
        System.out.println("Hasil Sisa : "+sisa);
        return sisa;
    }
}
