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
import model.PembeliModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.*;

public class PembeliControler {
        public PembeliModel anggota_m = new PembeliModel();

    public PembeliControler(){
        
    }
        
    public ArrayList<PembeliEntity> view(){
        return anggota_m.getDataPembeli();
        }

        public void insert(PembeliEntity anggota){
        anggota_m.insert(anggota);
    }
        
    public void insert(String nama, String id, String noHp, String alamat){
            PembeliEntity anggota = new PembeliEntity();
            anggota.setId(id);
            anggota.setNama(nama);
            anggota.setAlamat(alamat);
            anggota.setNoHp(noHp);
            anggota_m.insert(anggota);
    }    

    public void delete(int index){
        anggota_m.delete(index);
    }
    
    public DefaultTableModel listanggota(){
        DefaultTableModel dtmdaftaranggota = new DefaultTableModel();
        Object[] kolom = {"No ID","Nama","Alamat","No Telepon"};
        dtmdaftaranggota.setColumnIdentifiers(kolom);
        
        int size = ViewCon.anggota.view().size();
         for (int i=0; i<size; i++){
             Object [] data = new Object[8];
            data[0] = ViewCon.anggota.view().get(i).getId();
                data[1] = ViewCon.anggota.view().get(i).getNama();
                data[2] = ViewCon.anggota.view().get(i).getAlamat();
                data[3] = ViewCon.anggota.view().get(i).getNoHp();

                dtmdaftaranggota.addRow(data);

         }
            return dtmdaftaranggota;
    }
    
    public int cekAnggota(String idAnggota){
        int keterangan = -1;
        if(anggota_m.getDataPembeli().size()>0){
            for(int i=0;i<anggota_m.getDataPembeli().size();i++){
             if(idAnggota.equals(anggota_m.getDataPembeli().get(i).getId())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    
    public PembeliEntity showDaftarAnggota(int index){
        return anggota_m.getDataPembeli().get(index);
    }

    
}
