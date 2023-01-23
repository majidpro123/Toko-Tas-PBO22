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
import entity.TasEntity;
import model.TasModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.ViewCon;

public class TasControler {
    public TasModel buku_m = new TasModel();

    public TasControler(){
        
    }
    public ArrayList<TasEntity> view(){
        return buku_m.getDataTas();
        }

    public void insert(String Merk, String Warna, String Model, int Harga, int Jumlah){
        TasEntity buku = new TasEntity();
        buku.setMerk(Merk);
        buku.setWarna(Warna);
        buku.setModel(Model);
        buku.setHarga(Harga);
        buku.setJumlah(Jumlah);
        buku_m.insert(buku);
    }
    public void update(int index,String Merk, String Warna, String Model, int Harga, int Jumlah){
        TasEntity buku = new TasEntity();
        buku.setMerk(Merk);
        buku.setWarna(Warna);
        buku.setModel(Model);
        buku.setHarga(Harga);
        buku.setJumlah(Jumlah);
        buku_m.update(index,buku);
    }
    public void delete(int index){
        buku_m.delete(index);
    }    
    public DefaultTableModel listbuku(){
    DefaultTableModel dtmlistbuku = new DefaultTableModel();
    Object[] kolom ={"Kode Buku","Judul","Pengarang","Tahun Terbit","Jumlah"};
    dtmlistbuku.setColumnIdentifiers(kolom);
    int size = ViewCon.buku.view().size();
    for (int i=0; i<size; i++){
        Object [] buku =new Object[7];
        buku[0] = ViewCon.buku.view().get(i).getMerk();
        buku[1] = ViewCon.buku.view().get(i).getWarna();
        buku[2] = ViewCon.buku.view().get(i).getModel();
        buku[3] = ViewCon.buku.view().get(i).getHarga();
        buku[4] = ViewCon.buku.view().get(i).getJumlah();
        dtmlistbuku.addRow(buku);
    }
    return dtmlistbuku;
}
    
    public int cekBuku(String idBuku){
    int keterangan = -1;
        if(buku_m.getDataTas().size()>0){
            for(int i=0;i<buku_m.getDataTas().size();i++){
             if(idBuku.equals(buku_m.getDataTas().get(i).getMerk())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public TasEntity showDaftarBuku(int index){
        return buku_m.getDataTas().get(index);
    }
}