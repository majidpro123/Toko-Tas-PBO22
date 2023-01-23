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
public class Arraypegawai {
     ArrayList<Pegawai> arrList = new ArrayList<>();
     int id, noHp;
     String nama;
    public void inputPegawai(){
    Scanner input = new Scanner(System.in);
    System.out.println("Input Data Pegawai :");
    System.out.println("nama pegawai : ");
    nama = input.next();
    System.out.println("id    : ");
    id = input.nextInt();
    System.out.println("No hp : ");
    noHp = input.nextInt();
    arrList.add(new Pegawai(nama, id, noHp));
    }
    
    public void outputPegawai(){
        for(int i = 0; i < arrList.size(); i++){
    System.out.println("Cetak Data Pegawai :");
    System.out.println("id pegawai   : "+id);
    System.out.println("nama pegawai : "+nama);
    System.out.println("no hp        : "+noHp);
    }
    }
}
