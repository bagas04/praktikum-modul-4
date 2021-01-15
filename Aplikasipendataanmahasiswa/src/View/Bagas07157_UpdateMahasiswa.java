/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DataMasuk.Bagas07157_DataJurusan;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Bagas07157_UpdateMahasiswa {

    JFrame updateMhs = new JFrame();
    JLabel labelNpm, labelNama, labelPassword, labelNotelp, labelTglLahir, labelJurusan, labelNamaMenu;
    JTextField textNpm, textNama, textNotelp, textTglLahir;
    JButton Update, Back, EditNpm, EditNama, EditTglLahir, EditNotelp, EditPassword, EditJurusan;
    JPasswordField textPassword;
    JComboBox cbPilJurusan = new JComboBox(Bagas07157_DataJurusan.jurusan);

    public Bagas07157_UpdateMahasiswa(int index_mhs) {
        updateMhs.setSize(1038, 737);
        updateMhs.setLayout(null);
        updateMhs.getContentPane().setBackground(Color.decode("#A9FC82"));
        updateMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateMhs.setVisible(true);
        updateMhs.setLocationRelativeTo(null);

        labelNamaMenu = new JLabel("Edit Data Mahasiswa");
        labelNamaMenu.setBounds(300, 10, 600, 50);
        labelNamaMenu.setFont(new Font("ALGERIAN", Font.BOLD, 35));
        updateMhs.add(labelNamaMenu);

        labelNpm = new JLabel("NPM");
        labelNpm.setBounds(400, 80, 150, 30);
        updateMhs.add(labelNpm);

        textNpm = new JTextField();
        textNpm.setBounds(400, 110, 150, 30);
        updateMhs.add(textNpm);

        EditNpm = new JButton("Edit");
        EditNpm.setBounds(560, 110, 55, 30);
        EditNpm.setBackground(Color.decode("#E5E5E5"));
        updateMhs.add(EditNpm);

        labelNama = new JLabel("Nama");
        labelNama.setBounds(400, 140, 150, 30);
        updateMhs.add(labelNama);

        textNama = new JTextField();
        textNama.setBounds(400, 170, 150, 30);
        updateMhs.add(textNama);

        EditNama = new JButton("Edit");
        EditNama.setBounds(560, 170, 55, 30);
        EditNama.setBackground(Color.decode("#E5E5E5"));
        updateMhs.add(EditNama);

        labelTglLahir = new JLabel("Tanggal Lahir (dd/MM/yyy)");
        labelTglLahir.setBounds(400, 200, 150, 30);
        updateMhs.add(labelTglLahir);

        textTglLahir = new JTextField();
        textTglLahir.setBounds(400, 230, 150, 30);
        updateMhs.add(textTglLahir);

        EditTglLahir = new JButton("Edit");
        EditTglLahir.setBounds(560, 230, 55, 30);
        EditTglLahir.setBackground(Color.decode("#E5E5E5"));
        updateMhs.add(EditTglLahir);

        labelNotelp = new JLabel("No Telepon");
        labelNotelp.setBounds(400, 260, 150, 30);
        updateMhs.add(labelNotelp);

        textNotelp = new JTextField();
        textNotelp.setBounds(400, 290, 150, 30);
        updateMhs.add(textNotelp);

        EditNotelp = new JButton("Edit");
        EditNotelp.setBounds(560, 290, 55, 30);
        EditNotelp.setBackground(Color.decode("#E5E5E5"));
        updateMhs.add(EditNotelp);

        labelPassword = new JLabel("Password");
        labelPassword.setBounds(400, 320, 150, 30);
        updateMhs.add(labelPassword);

        textPassword = new JPasswordField();
        textPassword.setBounds(400, 350, 150, 30);
        updateMhs.add(textPassword);

        EditPassword = new JButton("Edit");
        EditPassword.setBounds(560, 350, 55, 30);
        EditPassword.setBackground(Color.decode("#E5E5E5"));
        updateMhs.add(EditPassword);

        labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(400, 380, 150, 30);
        updateMhs.add(labelJurusan);

        cbPilJurusan.setBounds(400, 410, 150, 30);
        updateMhs.add(cbPilJurusan);

        EditJurusan = new JButton("Edit");
        EditJurusan.setBounds(560, 410, 55, 30);
        EditJurusan.setBackground(Color.decode("#E5E5E5"));
        updateMhs.add(EditJurusan);

        Update = new JButton("Update");
        Update.setBounds(450, 460, 100, 30);
        Update.setBackground(Color.decode("#E8F923"));
        updateMhs.add(Update);
        
        Back = new JButton("Kembali");
        Back.setBounds(30, 650, 150, 30);
        Back.setBackground(Color.decode("#E8F923"));
        updateMhs.add(Back);

        textNpm.setEnabled(false);
        textNama.setEnabled(false);
        textTglLahir.setEnabled(false);
        textNotelp.setEnabled(false);
        textPassword.setEnabled(false);
        cbPilJurusan.setEnabled(false);

        textNpm.setText(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getNpm());
        textNama.setText(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getNama());
        textTglLahir.setText(new SimpleDateFormat("dd/MM/yyy").format(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getTglLahir()));
        textNotelp.setText(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getNo_telp());
        textPassword.setText(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getPassword());
        cbPilJurusan.setSelectedIndex(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan());

        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                updateMhs.dispose();
                Bagas07157_GUI menuUtama = new Bagas07157_GUI();
            }
        });
        
       EditNpm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textNpm.setEnabled(true);
            }
        });

        EditNama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textNama.setEnabled(true);
            }
        });

        EditTglLahir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textTglLahir.setEnabled(true);
            }
        });
        
       EditPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textPassword.setEnabled(true);
            }
        });
        
        EditJurusan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cbPilJurusan.setEnabled(true);
            }
        });

        EditNotelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textNotelp.setEnabled(true);
            }
        });
        
        Update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if(textNpm.isEnabled()) {
                        Bagas07157_Allobjctrl.mahasiswa.updateDataMahasiswa(index_mhs, textNpm.getText(), "npm", "string");
                    }
                    if(textNama.isEnabled()) {
                        Bagas07157_Allobjctrl.mahasiswa.updateDataMahasiswa(index_mhs, textNama.getText(), "nama", "string");
                    }
                    if(textNotelp.isEnabled()) {
                        Bagas07157_Allobjctrl.mahasiswa.updateDataMahasiswa(index_mhs, textNotelp.getText(), "notelp", "string");
                    }
                    if(textPassword.isEnabled()) {
                        Bagas07157_Allobjctrl.mahasiswa.updateDataMahasiswa(index_mhs, textPassword.getText(), "password", "string");
                    }
                    if(textTglLahir.isEnabled()) {
                        Bagas07157_Allobjctrl.mahasiswa.updateDataMahasiswa(index_mhs, textTglLahir.getText(), "tgllahir", "date");
                    }
                    if(cbPilJurusan.isEnabled()) {
                        Bagas07157_Allobjctrl.mahasiswa.updateDataMahasiswa(index_mhs, String.valueOf(cbPilJurusan.getSelectedIndex()), "jurusan", "int");
                    }
                    JOptionPane.showMessageDialog(null, "Update Berhasil", "Information", JOptionPane.INFORMATION_MESSAGE);
                    updateMhs.dispose();
                    Bagas07157_GUI menuUtama = new Bagas07157_GUI();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
