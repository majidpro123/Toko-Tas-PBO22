/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author majid
 */
import model.PegawaiModel;
import entity.PegawaiEntity;
import java.util.ArrayList;

public class PegawaiControler {
    public PegawaiModel petugas_m = new PegawaiModel();
    int loginPetugas = 0; 
    
    public PegawaiControler(){
    
    }
    
    public ArrayList<PegawaiEntity> view(){
        return petugas_m.getDataAnggota();
        }
  
    public void insert(PegawaiEntity pegawai){
        petugas_m.insert(pegawai);
    }

    public void update(int index, PegawaiEntity pegawai){
        petugas_m.update(index, pegawai);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }
    
     public void dataPetugas(){
        String no_id [] = {"001","002"};
        String nama [] = {"majid","saiful"};
        String alamat [] = {"Kediri","Sidoarjo"};
        String password [] = {"001","002"};
       
        for(int i = 0; i<nama.length; i++){
        petugas_m.insert(new PegawaiEntity(nama[i],no_id[i],alamat[i],password[i]));
        }
    }
     public void cekPetugas(String no_id, String password) {
        loginPetugas = petugas_m.cekPetugas(no_id,password);
     }
     
     public PegawaiEntity petugasEntity(){
        return petugas_m.showDataPetugas(loginPetugas);
    }
}
