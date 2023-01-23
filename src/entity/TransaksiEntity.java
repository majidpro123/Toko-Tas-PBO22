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
import java.util.Date;

public class TransaksiEntity {
    private String status;
    private PembeliEntity pembeli;
    private TasEntity tas;
    private int noBeli;
    private Date tglBeli,tglKirim;
    
    public TransaksiEntity(String status, PembeliEntity pembeli,TasEntity tas,int noBeli,Date tglBeli, Date tglKirim){
        this.status=status;
        this.pembeli=pembeli;
        this.tglBeli=tglBeli;
        this.tas = tas;
        this.noBeli = noBeli;
        this.tglKirim = tglKirim;
        
    }
    
    public TransaksiEntity() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PembeliEntity getAnggota() {
        return pembeli;
    }

    public void setAnggota(PembeliEntity pembeli) {
        this.pembeli = pembeli;
    }

    public TasEntity getBuku() {
        return tas;
    }

    public void setBuku(TasEntity tas) {
        this.tas = tas;
    }

    public int getNoPinjam() {
        return noBeli;
    }

    public void setNoPinjam(int noBeli) {
        this.noBeli = noBeli;
    }

    public Date getTglPinjam() {
        return tglBeli;
    }

    public void setTglPinjam(Date tglBeli) {
        this.tglBeli = tglBeli;
    }

    public Date getTglKembali() {
        return tglKirim;
    }

    public void setTglKembali(Date tglKirim) {
        this.tglKirim = tglKirim;
    }
     
}
