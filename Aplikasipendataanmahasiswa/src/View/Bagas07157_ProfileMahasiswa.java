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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Bagas07157_ProfileMahasiswa {

    JFrame profileMhs = new JFrame();
    JTextArea areaDataMhs = new JTextArea();
    JButton Back,HapusMhs, EditMhs;;
    JLabel labelNamaMenu;
    int index_mhs;

    public Bagas07157_ProfileMahasiswa() {
        profileMhs.setSize(1038, 737);
        profileMhs.setLayout(null);
        profileMhs.getContentPane().setBackground(Color.decode("#A4EFB5"));
        profileMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        profileMhs.setVisible(true);
        profileMhs.setLocationRelativeTo(null);

        labelNamaMenu = new JLabel("Data Mahasiswa");
        labelNamaMenu.setBounds(370, 40, 626, 50);
        labelNamaMenu.setFont(new Font("AlGERIAN", Font.BOLD, 25));
        profileMhs.add(labelNamaMenu);

        areaDataMhs.setBounds(140, 124, 700, 270);
        areaDataMhs.setBackground(Color.cyan);
        profileMhs.add(areaDataMhs);

        Back = new JButton("Kembali");
        Back.setBounds(30, 650, 150, 30);
        Back.setBackground(Color.decode("#E8F923"));
        profileMhs.add(Back);
        
       Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                profileMhs.dispose();
                Bagas07157_GUI menuUtama = new Bagas07157_GUI();
            }
        });
        
        areaDataMhs.setText(dataMhs());
    }

    String dataMhs() {
        String text = "Npm = " + Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getNpm() + "\n"
                + "Nama = " + Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getNama() + "\n"
                + "No Telp = " + Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getNo_telp() + "\n"
                + "Tanggal Lahir = " + new SimpleDateFormat("dd-MM yyyy").format(Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getTglLahir()) + "\n"
                + "Password = " + Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getPassword() + "\n"
                + "Jurusan = " + Bagas07157_DataJurusan.jurusan[Bagas07157_Allobjctrl.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()] + "\n";
        return text;
    }

    public void profileMhs(int index_mhs) {
        index_mhs = index_mhs;
    }
}
