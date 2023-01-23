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
public class PembeliEntity extends PelakuEntity {
    protected String alamat;
    
    public PembeliEntity(String nama, String id, String noHp, String alamat){
        super(nama, id, noHp);
        this.alamat=alamat;
    }
    
    public PembeliEntity(){
        
    }
    
    @Override
    public String getId(){
        return id;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    @Override
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
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
    
    public String getAlamat(){
        return this.alamat;
    }
}
