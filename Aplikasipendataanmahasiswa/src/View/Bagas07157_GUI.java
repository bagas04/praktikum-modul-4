/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Bagas07157_MahasiswaController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;



public class Bagas07157_GUI {

    Bagas07157_MahasiswaController mahasiswa = new Bagas07157_MahasiswaController();
    JFrame menuUtama = new JFrame();
    JButton DaftarMhs, LoginMhs, HapusMhs, EditMhs;
    JTextField textUbahData;
    JLabel labelNamaAplikasi, labelUbahData;
    JTable tabelMhs = new JTable();
    JScrollPane scrollTabelMhs = new JScrollPane(tabelMhs);

    public Bagas07157_GUI() {
        menuUtama.setSize(800, 380);
        menuUtama.setLayout(null);
        menuUtama.getContentPane().setBackground(Color.decode("#7CF51D"));
        menuUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuUtama.setVisible(true);
        menuUtama.setLocationRelativeTo(null);

        labelNamaAplikasi = new JLabel("Aplikasi Pendataan Mahasiswa");
        labelNamaAplikasi.setBounds(40, 30, 1000, 50);
        labelNamaAplikasi.setFont(new Font("AlGERIAN", Font.BOLD, 36));
        menuUtama.add(labelNamaAplikasi);

        LoginMhs = new JButton("Login Mahasiswa");
        LoginMhs.setBounds(30, 70, 140, 30);
        LoginMhs.setBackground(Color.decode("#E8F923"));
        menuUtama.add(LoginMhs);
        
        DaftarMhs = new JButton("Daftar Mahasiswa");
        DaftarMhs.setBounds(180, 70, 140, 30);
        DaftarMhs.setBackground(Color.decode("#E8F923"));
        menuUtama.add(DaftarMhs);

        scrollTabelMhs.setBounds(30, 110, 570, 200);
        tabelMhs.setModel(mahasiswa.dataTabelMhs());
        menuUtama.add(scrollTabelMhs);

        labelUbahData = new JLabel("Ubah Data Mahasiswa");
        labelUbahData.setBounds(620, 105, 130, 30);
        menuUtama.add(labelUbahData);

        textUbahData = new JTextField("Index");
        textUbahData.setBounds(620, 135, 100, 30);
        menuUtama.add(textUbahData);

        EditMhs = new JButton("Edit");
        EditMhs.setBounds(620, 175, 55, 30);
        EditMhs.setBackground(Color.decode("#E8F923"));
        menuUtama.add(EditMhs);

        HapusMhs = new JButton("Hapus");
        HapusMhs.setBounds(685, 175, 70, 30);
        HapusMhs.setBackground(Color.decode("#E8F923"));
        menuUtama.add(HapusMhs);

        LoginMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuUtama.dispose();
                Bagas07157_LoginMahasiswa loginMahasiswa = new Bagas07157_LoginMahasiswa();
            }
        });
        
        DaftarMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                menuUtama.dispose();
                Bagas07157_DaftarMahasiswa daftarMahasiswa = new Bagas07157_DaftarMahasiswa();
            }
        });

        textUbahData.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textUbahData.setText(null);
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        EditMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa().size() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    menuUtama.dispose();
                    int index_mhs = Integer.parseInt(textUbahData.getText());
                    Bagas07157_UpdateMahasiswa updateMahasiswa = new Bagas07157_UpdateMahasiswa(index_mhs);
                }

            }
        });

        HapusMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa().size() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int index_mhs = Integer.parseInt(textUbahData.getText());
                    int result = JOptionPane.showConfirmDialog(menuUtama, "apakah anda yakin untuk menghapus ?", "Swing Tester",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                    if (result == JOptionPane.YES_OPTION) {
                        Bagas07157_Allobjctrl.mahasiswa.deleteDataMahasiswa(index_mhs);
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Information", JOptionPane.INFORMATION_MESSAGE);
                        tabelMhs.setModel(mahasiswa.dataTabelMhs());
                        textUbahData.setText(null);
                    }
                }

            }
        });

        tabelMhs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelMhs.getSelectedRow();
                textUbahData.setText(Bagas07157_Allobjctrl.mahasiswa.dataTabelMhs().getValueAt(i, 0).toString());
            }
        });
    }
}
