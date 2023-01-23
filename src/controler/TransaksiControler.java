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
import entity.PembeliEntity;
import entity.TasEntity;
import entity.TransaksiEntity;
import model.TransaksiModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import view.ViewCon;

public class TransaksiControler {
    TransaksiModel Transaksi_ku = new TransaksiModel();
    
    public TransaksiControler(){
    
    }
    public ArrayList<TransaksiEntity> view(){
        return Transaksi_ku.getDataPeminjaman();
    }
    
     public void insert(String status,PembeliEntity pembeli,TasEntity tas,int noBeli,Date tglBeli, Date tglKirim){
        TransaksiEntity peminjaman = new TransaksiEntity();
        peminjaman.setStatus(status);
        peminjaman.setAnggota(pembeli);
        peminjaman.setBuku(tas);
        peminjaman.setNoPinjam(noBeli);
        peminjaman.setTglPinjam(tglBeli);
        peminjaman.setTglKembali(tglKirim);
        Transaksi_ku.insertPeminjaman(peminjaman);
    }
    
    public DefaultTableModel listpinjaman(){
    DefaultTableModel dtmlistpeminjaman = new DefaultTableModel();
    Object[] kolom ={"No Pinjaman","Nama","Buku","Tgl Pinjam","Tgl Kembali","Status"};
    dtmlistpeminjaman.setColumnIdentifiers(kolom);
    
    int size = ViewCon.peminjaman.view().size();
    for (int i=0; i<size; i++){
        Object [] peminjaman =new Object[10];
        peminjaman[0] = ViewCon.peminjaman.view().get(i).getNoPinjam();
        peminjaman[1] = ViewCon.peminjaman.view().get(i).getAnggota();
        peminjaman[2] = ViewCon.peminjaman.view().get(i).getBuku();
        peminjaman[3] = ViewCon.peminjaman.view().get(i).getNoPinjam();
        peminjaman[4] = ViewCon.peminjaman.view().get(i).getTglKembali();
        peminjaman[5] = ViewCon.peminjaman.view().get(i).getStatus();
        dtmlistpeminjaman.addRow(peminjaman);
    }
    return dtmlistpeminjaman;
    }
    
    public int cekPeminjaman(String idpeminjam){
    int keterangan = -1;
        if(Transaksi_ku.getDataPeminjaman().size()>0){
            for(int i=0;i<Transaksi_ku.getDataPeminjaman().size();i++){
             if(idpeminjam.equals(Transaksi_ku.getDataPeminjaman().get(i).getNoPinjam())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public TransaksiEntity showDaftarpeminjam(int index){
        return Transaksi_ku.getDataPeminjaman().get(index);
    }
}
