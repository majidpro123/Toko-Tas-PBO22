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
import controler.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;


public class TasGui {
    private static TasControler buku_c = new TasControler();
    JFrame Buku = new JFrame();
    JLabel top,tambahbuku,labelkodebuku,labeljudul,labelpengarang,labeltahun,labeljumlah;
    JTextField textkodebuku,textjudul,textpengarang,texttahun,textjumlah,hapustext;
    JButton btnubahbuku,btnhapus,btnback,btntambahbuku; 
    JTable tabelbuku = new JTable();
    JScrollPane scrolbuku = new JScrollPane(tabelbuku);
    int index;
     
    public TasGui(){
        
        Buku.setSize(900,700);
        Buku.setLayout(null);
        Buku.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA TAS");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Buku.add(top);
            
        scrolbuku.setBounds(300,180,600,270);
        tabelbuku.setModel(buku_c.listbuku());
        Buku.add(scrolbuku);
        
        labelkodebuku = new JLabel("MERK");
        labelkodebuku.setBounds(30,150,100,30);
        Buku.add(labelkodebuku);
        
        textkodebuku = new JTextField();
        textkodebuku.setBounds(30,180,200,30);
        Buku.add(textkodebuku);
                
        labeljudul = new JLabel("WARNA");
        labeljudul.setBounds(30,210,100,30);
        Buku.add(labeljudul);
        
        textjudul = new JTextField();
        textjudul.setBounds(30,240,200,30);
        Buku.add(textjudul);
        
        labelpengarang = new JLabel("MODEL");
        labelpengarang.setBounds(30,270,100,30);
        Buku.add(labelpengarang);
        
        textpengarang = new JTextField();
        textpengarang.setBounds(30,300,200,30);
        Buku.add(textpengarang);
        
        labeltahun = new JLabel("HARGA");
        labeltahun.setBounds(30,330,200,30);
        Buku.add(labeltahun);
        
        texttahun = new JTextField();
        texttahun.setBounds(30,360,200,30);
        Buku.add(texttahun);
        
        labeljumlah = new JLabel("JUMLAH");
        labeljumlah.setBounds(30,390,200,30);
        Buku.add(labeljumlah);
        
        textjumlah = new JTextField();
        textjumlah.setBounds(30,420,200,30);
        Buku.add(textjumlah);
        
        btntambahbuku = new JButton("Tambah");
        btntambahbuku.setBounds(50,470,150,30);
        Buku.add(btntambahbuku);
        
        btnubahbuku = new JButton("Ubah");
        btnubahbuku.setBounds(50,510,150,30);
        Buku.add(btnubahbuku);
        
        btnhapus = new JButton("Hapus");
        btnhapus.setBounds(50,550,150,30);
        Buku.add(btnhapus);              
               
        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Buku.add(btnback);
               
        Buku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Buku.setVisible(true);
        Buku.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Buku.dispose();
                PegawaiGui petugas = new PegawaiGui();
            }
        });
        
        btntambahbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String kodebuku = textkodebuku.getText();
                    String judul =  textjudul.getText();
                    String pengarang = textpengarang.getText();
                    int tahun = Integer.valueOf(texttahun.getText());
                    int jumlah = Integer.valueOf(textjumlah.getText());
                    ViewCon.buku.insert(kodebuku,judul,pengarang,tahun,jumlah);
                    JOptionPane.showMessageDialog(null,"Input Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelbuku.setModel(ViewCon.buku.listbuku());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        
        btnubahbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String kodebuku = textkodebuku.getText();
                    String judul =  textjudul.getText();
                    String pengarang = textpengarang.getText();
                    int tahun = Integer.valueOf(texttahun.getText());
                    int jumlah = Integer.valueOf(textjumlah.getText());
                    ViewCon.buku.update(index,kodebuku,judul,pengarang,tahun,jumlah);
                    JOptionPane.showMessageDialog(null,"Ubah Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelbuku.setModel(ViewCon.buku.listbuku());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        tabelbuku.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelbuku.getSelectedRow();
                index=i;
                textkodebuku.setText(ViewCon.buku.listbuku().getValueAt(i, 0).toString());
                textjudul.setText(ViewCon.buku.listbuku().getValueAt(i, 1).toString());
                textpengarang.setText(ViewCon.buku.listbuku().getValueAt(i, 2).toString());
                texttahun.setText(ViewCon.buku.listbuku().getValueAt(i, 3).toString());
                textjumlah.setText(ViewCon.buku.listbuku().getValueAt(i, 4).toString()); 
            }            
        });
        
        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    ViewCon.buku.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelbuku.setModel(ViewCon.buku.listbuku());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
    }
    void reset(){
        textkodebuku.setText(null);//ISI
        textjudul.setText(null);
        textpengarang.setText(null);
        texttahun.setText(null);
        textjumlah.setText(null);
    }
}  
