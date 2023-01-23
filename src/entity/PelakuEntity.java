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
public abstract class PelakuEntity {
    protected String nama, id, noHp;
    
    public PelakuEntity(String nama, String id, String noHp){
        this.nama = nama;
        this.id = id;
        this.noHp = noHp;
    }
    
    public PelakuEntity(){
    
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    public String getId(){
        return this.id;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNoHp(){
        return this.noHp;
    }
}
