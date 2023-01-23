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
public class PegawaiEntity extends PelakuEntity {
    private String password;
    
    public PegawaiEntity(String nama, String id, String noHp, String password){
        super(nama, id, noHp);
        this.password=password;
    }
    
    @Override
    public String getId(){
        return id;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
    @Override
    public String getNama(){
        return this.nama;
    }
    
    @Override
    public String getNoHp(){
        return this.noHp;
    }
    
    public String getPassword(){
        return this.password;
    }
}

   
