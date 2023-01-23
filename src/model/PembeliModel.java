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
import java.util.ArrayList;
import entity.PembeliEntity;

/**
 *
 * @author majid
 */
public class PembeliModel implements ModelInterface {
    public ArrayList<PembeliEntity> DataPembeli;
    
    public PembeliModel(){
        DataPembeli = new ArrayList<>();
    }
    public ArrayList<PembeliEntity> getDataPembeli(){
        return DataPembeli;
    }
    
    @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataPembeli.add((PembeliEntity) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataPembeli.set(index ,(PembeliEntity) x);
    }
     
    @Override
    public void delete(int index){
        DataPembeli.remove(index);
    } 
    
    public void get_where(int index){
        DataPembeli.get(index);
    }
}
