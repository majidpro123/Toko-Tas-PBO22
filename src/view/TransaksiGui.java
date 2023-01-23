/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author majid
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controler.*;
import entity.PelangganEntity;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author dian
 */
public class TransaksiGui {
    private static TransaksiControler peminjaman_c = new TransaksiControler();
    private static PelangganEntity jenisanggota = new PelangganEntity();
    private static String [] statusPeminjaman = {"Belum Dikembalikan", "Dikembalikan"};
    JFrame Peminjaman = new JFrame();
    JLabel top,labelidpeminjam,labeltas,labelnama,labelnotelp,labeljumlah,labelstatus;
    JTextField textid,textnama,texttas,textnotelp,hapustext,textjumlah,textstatus;
    JButton btnhapus,btnback,btntambahdata;
    JTable tabelpeminjaman = new JTable();
    JScrollPane scrolpeminjaman = new JScrollPane();
    int index;
    
    public TransaksiGui(){
        Peminjaman.setSize(900,700);
        Peminjaman.setLayout(null);
        Peminjaman.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA TRANSAKSI");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Peminjaman.add(top);
            
        scrolpeminjaman.setBounds(100,100,650,270);
        tabelpeminjaman.setModel(peminjaman_c.listpinjaman());
        Peminjaman.add(scrolpeminjaman);
        
        labelidpeminjam = new JLabel("no beli");
        labelidpeminjam.setBounds(100,380,100,30);
        Peminjaman.add(labelidpeminjam);
        
        textid = new JTextField();
        textid.setBounds(100,410,200,30);
        Peminjaman.add(textid);
        
        labelnama = new JLabel("nama");
        labelnama.setBounds(100,440,100,30);
        Peminjaman.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(100,470,200,30);
        Peminjaman.add(textnama);
        
        labeltas = new JLabel("Tas");
        labeltas.setBounds(100,500,100,30);
        Peminjaman.add(labeltas);
        
        texttas = new JTextField();
        texttas.setBounds(100,530,200,30);
        Peminjaman.add(texttas);
        
        labeljumlah = new JLabel("jumlah");
        labeljumlah.setBounds(350,380,100,30);
        Peminjaman.add(labeljumlah);
        
        textjumlah = new JTextField();
        textjumlah.setBounds(350,410,200,30);
        Peminjaman.add(textjumlah);
        
        labelnotelp = new JLabel("no telp");
        labelnotelp.setBounds(350,440,100,30);
        Peminjaman.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(350,470,200,30);
        Peminjaman.add(textnotelp);
        
        labelstatus = new JLabel("status");
        labelstatus.setBounds(350,500,100,30);
        Peminjaman.add(labelstatus);
        
        textstatus = new JTextField();
        textstatus.setBounds(350,530,200,30);
        Peminjaman.add(textstatus);
        
        btntambahdata = new JButton("Tambah");
        btntambahdata.setBounds(600,410,200,30);
        Peminjaman.add(btntambahdata);
        
        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Peminjaman.add(btnback);
               
        Peminjaman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Peminjaman.setVisible(true);
        Peminjaman.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Peminjaman.dispose();
                PegawaiGui petugas = new PegawaiGui();
            }
        });
        
    }
}
