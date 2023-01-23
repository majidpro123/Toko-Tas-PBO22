/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author majid
 */
import entity.TransaksiEntity;
import java.util.ArrayList;

public class TransaksiModel  {
    private ArrayList<TransaksiEntity> DataPembeli;
    
    public TransaksiModel(){
        DataPembeli = new ArrayList<>();
    }
    
    public ArrayList<TransaksiEntity> getDataPeminjaman(){
        return DataPembeli;
        }
    
    public void insertPeminjaman(Object x){
        DataPembeli.add((TransaksiEntity) x);
    }

    public void updatePeminjaman(int index, TransaksiEntity peminjam){
        DataPembeli.set(index, peminjam);
    }
            
}
