/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import entity.PegawaiEntity;

/**
 *
 * @author majid
 */
public class PegawaiModel implements ModelInterface {
    public ArrayList<PegawaiEntity> DataAnggota;
    
    public PegawaiModel(){
        DataAnggota = new ArrayList<>();
    }
    public ArrayList<PegawaiEntity> getDataAnggota(){
        return DataAnggota;
    }
    
    @Override
    public void view(){
    
    }
    
    @Override
    public void insert(Object x){
        DataAnggota.add((PegawaiEntity) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataAnggota.set(index ,(PegawaiEntity) x);
    }
     
    @Override
    public void delete(int index){
        DataAnggota.remove(index);
    } 

    public PegawaiEntity showDataPetugas(int index){
        return DataAnggota.get(index);
    }

    public int cekPetugas(String id, String password){
        int loop = 0;
        for(PegawaiEntity petugasEntity : getDataAnggota()){
            if(petugasEntity.getId().equals(id) && petugasEntity.getPassword().equals(password)){
                break;
            }else{
                  loop++;
            }
        }
        return loop;
    };
    
}
