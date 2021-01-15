/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataMasuk.Bagas07157_DataMahasiswa;
import DataMasuk.Bagas07157_DataJurusan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Bagas07157_MahasiswaController {
    int indexLogin;
    public Bagas07157_DataMahasiswa getDataMahasiswa(int index) {
        return Bagas07157_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }
    
    public int login(String npm, String password) {
        return Bagas07157_AllObjectModel.mahasiswa.cekMahasiswa(npm, password);
    }
    
    public Bagas07157_DataMahasiswa mahasiswaEntity(int index) {
        return Bagas07157_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }
    
    public void insertDataMahasiswa(String npm, String nama, Date tanggal_lahir, int index_jurusan, String no_telp, String password) {
        Bagas07157_DataMahasiswa mahasiswa = new Bagas07157_DataMahasiswa();
        mahasiswa.setNpm(npm);
        mahasiswa.setNama(nama);
        mahasiswa.setTglLahir(tanggal_lahir);
        mahasiswa.setIndex_jurusan(index_jurusan);
        mahasiswa.setNo_telp(no_telp);
        mahasiswa.setPassword(password);
        Bagas07157_AllObjectModel.mahasiswa.insertMahasiswaModel(mahasiswa);
    }
    
    public void deleteDataMahasiswa(int index) {
        Bagas07157_AllObjectModel.mahasiswa.hapusMahasiswaModel(index);
    }
    
    public ArrayList<Bagas07157_DataMahasiswa> getDataMahasiswa() {
        return Bagas07157_AllObjectModel.mahasiswa.getAllMahasiswa();
    }
    
    public void updateDataMahasiswa(int index, String data, String ubah, String tipe) throws ParseException {
        switch(tipe) {
            case "string" :
                switch(ubah) {
                    case "npm":
                        Bagas07157_AllObjectModel.mahasiswa.editNpmMahasiswaModel(index, data);
                        break;
                    case "nama":
                        Bagas07157_AllObjectModel.mahasiswa.editNamaMahasiswaModel(index, data);
                        break;
                    case "noTelp":
                        Bagas07157_AllObjectModel.mahasiswa.editNoTelpMahasiswaModel(index, data);
                        break;
                    case "password":
                        Bagas07157_AllObjectModel.mahasiswa.editPasswordMahasiswaModel(index, data);
                        break;
                }
                break;
            case "date" :
                Bagas07157_AllObjectModel.mahasiswa.editMahasiswaModel(index, new SimpleDateFormat("dd/MM/yyyy").parse(data));
                break;
            case "int":
                Bagas07157_AllObjectModel.mahasiswa.editMahasiswaModel(index, Integer.parseInt(data));
                break;
        }
    }
    
    public DefaultTableModel dataTabelMhs(){
        DefaultTableModel dtmMhs = new DefaultTableModel();
        Object[] kolom = {"index", "NPM", "Nama", "Jurusan"};
        dtmMhs.setColumnIdentifiers(kolom);
        int size = Bagas07157_AllObjectModel.mahasiswa.getAllMahasiswa().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[4];
            data[0] = String.valueOf(i);
            data[1] = Bagas07157_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getNpm();
            data[2] = Bagas07157_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getNama();
            data[3] = Bagas07157_DataJurusan.jurusan[Bagas07157_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getIndex_jurusan()];
            dtmMhs.addRow(data);
        }
        return dtmMhs;
    }
}
