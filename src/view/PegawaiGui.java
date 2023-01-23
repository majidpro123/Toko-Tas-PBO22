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

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;

public class PegawaiGui {
    JFrame LogReg = new JFrame();
    JLabel top;
    JButton btnbuku,btnanggota,btnpeminjaman,btnback,btnpengembalian;
    
    public PegawaiGui(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("=MENU UTAMA=");
        top.setBounds(270,10,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);
         
        btnbuku = new JButton("Data Tas");
        btnbuku.setBounds(270,150,300,50);
        btnbuku.setBackground(Color.CYAN);
        LogReg.add(btnbuku);
        
        //====== ANGGOTA =========        
        btnanggota = new JButton("Data Pembeli");
        btnanggota.setBounds(270,250,300,50);
        btnanggota.setBackground(Color.CYAN);
        LogReg.add(btnanggota);
        
        //====== PEMINJAM =========
        btnpeminjaman = new JButton("Data Transaksi");
        btnpeminjaman.setBounds(270,350,300,50);
        btnpeminjaman.setBackground(Color.CYAN);
        LogReg.add(btnpeminjaman);
        
        //===== EXIT =====
        btnback = new JButton("EXIT");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        LogReg.add(btnback);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                LogIn gui = new LogIn();
            }
        });
        btnbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TasGui bukugui = new TasGui();
            }
        });
        
        btnanggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PembeliGui anggotagui = new PembeliGui();
            }
        });
        
        btnpeminjaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransaksiGui buku = new TransaksiGui();
            }
        });
    }
}
