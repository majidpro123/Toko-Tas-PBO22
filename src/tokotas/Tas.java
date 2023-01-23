/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokotas;
import java.util.Scanner;
/**
 *
 * @author majid
 */
public class Tas {
    String merek, warna;
    int ukuran;
    
    public Tas(String merek, String warna, int ukuran){
        this.merek=merek;
        this.warna=warna;
        this.ukuran=ukuran;
       
    }
    
    void inputTas(){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Input Data Tas :");
    System.out.println("merek : ");
    merek = input.next();
    System.out.println("warna : ");
    warna = input.next();
    System.out.println("ukuran : ");
    ukuran = input.nextInt();
    }
    
    void outputTas(){
    System.out.println("Cetak Data Tas :");
    System.out.println("merek  : "+merek);
    System.out.println("warna  : "+warna);
    System.out.println("ukuran : "+ukuran);
    }
}
