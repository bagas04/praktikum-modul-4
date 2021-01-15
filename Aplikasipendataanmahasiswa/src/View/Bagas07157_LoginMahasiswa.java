/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Bagas07157_LoginMahasiswa {

    JFrame loginMhs = new JFrame();
    JButton LoginMhs, Back;
    JLabel labelNamaMenu, labelNpm, labelPassword;
    JTextField textNpm, textPassword;

    public Bagas07157_LoginMahasiswa() {
        loginMhs.setSize(1038, 737);
        loginMhs.setLayout(null);
        loginMhs.getContentPane().setBackground(Color.decode("#99FFAF"));
        loginMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginMhs.setVisible(true);
        loginMhs.setLocationRelativeTo(null);

        labelNamaMenu = new JLabel("Login");
        labelNamaMenu.setBounds(480, 80, 100, 100);
        labelNamaMenu.setFont(new Font("AlGERIAN", Font.BOLD, 28));
        loginMhs.add(labelNamaMenu);

        labelNpm = new JLabel("NPM");
        labelNpm.setBounds(430,180,50,30);
        loginMhs.add(labelNpm);

        textNpm = new JTextField();
        textNpm.setBounds(430, 210, 200, 30);
        loginMhs.add(textNpm);

        labelPassword = new JLabel("Password");
        labelPassword.setBounds(430, 236, 150, 30);
        loginMhs.add(labelPassword);

        textPassword = new JTextField();
        textPassword.setBounds(430, 266, 200, 30);
        loginMhs.add(textPassword);

        LoginMhs = new JButton("Sig in");
        LoginMhs.setBounds(430, 300, 150, 30);
        LoginMhs.setBackground(Color.decode("#E8F923"));
        loginMhs.add(LoginMhs);

        Back = new JButton("Kembali");
        Back.setBounds(30, 660, 150, 30);
        Back.setBackground(Color.decode("#E8F923"));
        loginMhs.add(Back);

       LoginMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int index_mhs = Bagas07157_Allobjctrl.mahasiswa.login(textNpm.getText(), textPassword.getText());
                if (index_mhs == -1) {
                    JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    Bagas07157_LoginMahasiswa loginMahasiswa = new Bagas07157_LoginMahasiswa();
                } else if (index_mhs == -2) {
                    JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    Bagas07157_LoginMahasiswa loginMahasiswa = new Bagas07157_LoginMahasiswa();
                } else {
                    loginMhs.dispose();
                    Bagas07157_ProfileMahasiswa profileMhs = new Bagas07157_ProfileMahasiswa();
                    profileMhs.profileMhs(index_mhs);
                }
            }
        });

       Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                loginMhs.dispose();
                Bagas07157_GUI menuUtama = new Bagas07157_GUI();
            }
        });
    }
}
