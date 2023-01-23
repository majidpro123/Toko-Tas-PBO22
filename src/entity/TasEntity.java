/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author majid
 */
public class TasEntity {
    private String Merk, Warna, Model;
    private int Jumlah, Harga;
    
    public TasEntity(String Merk, String Warna, String Model, int Harga, int Jumlah){
        this.Merk = Merk;
        this.Warna = Warna;
        this.Model= Model;
        this.Jumlah=Jumlah;
        this.Harga = Harga;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setHarga(int Harga) {
        this.Harga= Harga;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }
    public TasEntity(){
    
    }
    
    public String getMerk(){
        return this.Merk;
    }
    
   public String getWarna(){
        return this.Warna;
    }
    
    public String getModel(){
        return this.Model;
    }
    
    public int getHarga(){
        return this.Harga;
    }
    
    public int getJumlah(){
        return this.Jumlah;
    }
}
