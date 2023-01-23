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
import entity.TasEntity;
import java.util.ArrayList;

public class TasModel implements ModelInterface{
    private ArrayList<TasEntity> DataTas;
    public ArrayList<TasEntity> getDataTas;
    
    public TasModel(){
        DataTas = new ArrayList<>();
        }
    public ArrayList<TasEntity> getDataTas(){
        return DataTas;
        }
    @Override
    public void view(){
    
    }
    @Override
    public void insert(Object x){
        DataTas.add((TasEntity) x);
    }
    @Override
    public void update(int index, Object x){
        DataTas.set(index ,(TasEntity) x);
    }
    @Override
    public void delete(int index){
        DataTas.remove(index);
    }

    public void get_where(int index){
        DataTas.get(index);
    }    
} 
