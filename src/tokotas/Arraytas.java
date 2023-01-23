/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokotas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author majid
 */
public class Arraytas {
    ArrayList<Tas> arrList = new ArrayList<>();
    String merek, warna;
    int ukuran;
    public void inputTas(){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Input Data Tas :");
    System.out.println("merek : ");
    merek = input.next();
    System.out.println("warna : ");
    warna = input.next();
    System.out.println("ukuran : ");
    ukuran = input.nextInt();
    arrList.add(new Tas(merek, warna, ukuran));
    }
    
    public void outputTas(){
        for(int i = 0; i < arrList.size(); i++){
    System.out.println("Cetak Data Tas :");
    System.out.println("merek  : "+merek);
    System.out.println("warna  : "+warna);
    System.out.println("ukuran : "+ukuran);
    }}
}
