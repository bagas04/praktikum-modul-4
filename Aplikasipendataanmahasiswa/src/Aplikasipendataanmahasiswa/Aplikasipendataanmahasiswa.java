/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasipendataanmahasiswa;



import View.*;

/**
 *
 * @author User
 */
public class Aplikasipendataanmahasiswa {

   // public Bagas07157_MahasiswaController mahasiswa = new Bagas07157_MahasiswaController();
 //   public Scanner input = new Scanner(System.in);
   // public String npm, nama, no_telp, password, jawab;
    //public Date tgl_lahir;
    //public int pil, index_jurusan, index_mhs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bagas07157_GUI menuUtama = new Bagas07157_GUI();
//        Irfan07156_Main global = new Irfan07156_Main();
//        System.out.println("Selamat Datang di Aplikasi Pendataan Mahasiswa !!");
//        do {
//            System.out.println("1. Login Mahasiswa");
//            System.out.println("2. Pendaftaran Mahasiswa");
//            System.out.println("3. Lihat data Mahasiswa");
//            System.out.println("4. Edit data Mahasiswa");
//            System.out.println("5. Hapus data Mahasiswa");
//            System.out.println("0. Exit");
//            System.out.print("Pilih Menu : ");
//            global.pil = global.input.nextInt();
//            switch (global.pil) {
//                case 1:
//                    global.viewLogin();
//                    break;
//                case 2:
//                    global.viewPendaftaran();
//                    break;
//                case 3:
//                    global.viewDataMahasiswa();
//                    break;
//                case 4:
//                    global.viewEditDataMahasiswa();
//                    break;
//                case 5:
//                    global.viewHapusDataMahasiswa();
//                    break;
//            }
//        } while (global.pil != 0);
    }

//    public void viewLogin() {
//        try {
//            System.out.println("NPM : ");
//            String npm = input.next();
//            System.out.println("Passwrod : ");
//            String password = input.next();
//            index_mhs = mahasiswa.login(npm, password);
//            System.out.println("Selamat Datang " + mahasiswa.getDataMahasiswa(index_mhs).getNama());
//            if (rencanaMatkul.size() == 0) {
//                System.out.println("Anda Belum Memilih Mata Kuliah\nPilih Mata Kualih : ");
//                viewRencanaMatkul(index_mhs);
//                viewMahasiswa(index_mhs);
//            } else if (rencanaMatkul.showRencanaMatkul(index_mhs) == null) {
//                System.out.println("Anda Belum Memilih Mata Kuliah\nPilih Mata Kualih : ");
//                viewRencanaMatkul(index_mhs);
//                viewMahasiswa(index_mhs);
//            } else {
//                viewMahasiswa(index_mhs);
//            }
//        } catch (Exception e) {
//            System.out.println("NPM atau Password Salah !!");
//        }
//    }
//
//    public void viewMahasiswa(int index) {
//        System.out.println("1. Profil Mahasiswa");
//        System.out.println("2. Tambah Jurusan");
//        System.out.println("3. Keluar");
//        System.out.print("Pilih : ");
//        pil = input.nextInt();
//        switch (pil) {
//            case 1:
//                viewDetailMahasiswa(index);
//                break;
//            case 2:
//                viewTambahMatkul();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void viewDetailMahasiswa(int index) {
//        System.out.println("================================================");
//        System.out.print("NPM : " + rencanaMatkul.showRencanaMatkul(index).getMahasiswa().getNpm()
//                + "\nNama : " + rencanaMatkul.showRencanaMatkul(index).getMahasiswa().getNama()
//                + "\nTanggal Lahir : " + rencanaMatkul.showRencanaMatkul(index).getMahasiswa().getTglLahir()
//                + "\nNo. Telp : " + rencanaMatkul.showRencanaMatkul(index).getMahasiswa().getNo_telp()
//                + "\nPassword : " + rencanaMatkul.showRencanaMatkul(index).getMahasiswa().getPassword()
//                + "\nJurusan : " + Irfan07156_JurusanEntity.jurusan[rencanaMatkul.showRencanaMatkul(index).getMahasiswa().getIndex_jurusan()]
//                + "\nMata Kuliah : \n");
//        for (int j = 0; j < rencanaMatkul.showRencanaMatkul(index).getJumlah_matkul().size(); j++) {
//            System.out.println((j) + ". " + Irfan07156_MataKuliahEntity.matkul[mahasiswa.getDataMahasiswa(index).getIndex_jurusan()][rencanaMatkul.showRencanaMatkul(index).getMatkul().get(j)]);
//        }
//        System.out.println("================================================");
//        System.out.print("Kembali (k) : ");
//        jawab = input.next();
//        switch (jawab) {
//            case "k":
//                viewMahasiswa(index);
//                break;
//        }
//    }
//
//    public void viewTambahMatkul() {
//        if (rencanaMatkul.showRencanaMatkul(index_mhs).getJumlah_matkul().size() < 2) {
//            System.out.println("====================================");
//            System.out.println("Mata Kuliah Yang Belum Dipilih");
//            for (int j = 0; j < Irfan07156_MataKuliahEntity.matkul[mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()].length; j++) {
//                for (int i = 0; i < rencanaMatkul.showRencanaMatkul(index_mhs).getJumlah_matkul().size(); i++) {
//                    if (j != rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(i)) {
//                        System.out.println((j) + " " + Irfan07156_MataKuliahEntity.matkul[mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()][j]);
//                    }
//                }
//            }
//            System.out.print("Pilih / Batal(00) : ");
//            int pilMatKul = input.nextInt();
//            if (pilMatKul != 00) {
//                rencanaMatkul.tambahMatkul(pilMatKul, index_mhs);
//                viewMahasiswa(index_mhs);
//            } else {
//                viewMahasiswa(index_mhs);
//            }
//            System.out.println("====================================");
//        } else {
//            System.out.println("------------------------------------");
//            System.out.println("Mata Kuliah Sudah Diambil Semua");
//            System.out.println("------------------------------------");
//            viewMahasiswa(index_mhs);
//        }
//    }
//
//    public void viewRencanaMatkul(int index) {
//        for (int i = 0; i < Irfan07156_MataKuliahEntity.matkul[mahasiswa.getDataMahasiswa(index).getIndex_jurusan()].length; i++) {
//            System.out.println((i) + " " + Irfan07156_MataKuliahEntity.matkul[mahasiswa.getDataMahasiswa(index).getIndex_jurusan()][i]);
//        }
//        int pilMatKul = input.nextInt();
//        rencanaMatkul.insertMatkul(pilMatKul, index);
//    }
//
//    public void viewPendaftaran() {
//        try {
//            System.out.print("Input NPM = ");
//            npm = input.next();
//            System.out.print("Input Nama = ");
//            nama = input.next();
//            System.out.print("Input Tanggal Lahir (dd/MM/yyyy) = ");
//            tgl_lahir = new Date(input.next());
//            System.out.print("Input No. Telp = ");
//            no_telp = input.next();
//            System.out.print("Input Password = ");
//            password = input.next();
//            for (int i = 0; i < Irfan07156_JurusanEntity.jurusan.length; i++) {
//                System.out.println(i + ". " + Irfan07156_JurusanEntity.jurusan[i]);
//            }
//            System.out.print("Pilih Jurusan = ");
//            index_jurusan = input.nextInt();
//            mahasiswa.insertDataMahasiswa(npm, nama, tgl_lahir, index_jurusan, no_telp, password);
//            System.out.println("Data Berhasil DiTambahkan");
//        } catch (Exception e) {
//            System.out.println("Format Pengisian Salah");
//        }
//    }
//
//    public void viewDataMahasiswa() {
//        int i = 0;
//        if (mahasiswa.getDataMahasiswa().size() == 0) {
//            System.out.println("Data Masih Kosong");
//        } else {
//            System.out.println("====================================");
//            for (Irfan07156_MahasiswaEntity mahasiswa : mahasiswa.getDataMahasiswa()) {
//                System.out.println(i + ". NPM : " + mahasiswa.getNpm()
//                        + "\n   Nama : " + mahasiswa.getNama()
//                        + "\n   Jurusan : " + Irfan07156_JurusanEntity.jurusan[mahasiswa.getIndex_jurusan()]
//                        + "\n   Tanggal Lahir : " + mahasiswa.getTglLahir()
//                        + "\n   No. Telp : " + mahasiswa.getNo_telp()
//                        + "\n   Password : " + mahasiswa.getPassword());
//                i++;
//            }
//            System.out.println("====================================");
//        }
//    }
//
//    public void viewEditDataMahasiswa() throws ParseException {
//        if (mahasiswa.getDataMahasiswa().size() == 0) {
//            System.out.println("Data Masih Kosong");
//        } else {
//            viewDataMahasiswa();
//            System.out.print("Pilih Nomor : ");
//            index_mhs = input.nextInt();
//            do {
//                System.out.println("1. Npm : " + mahasiswa.getDataMahasiswa(index_mhs).getNpm());
//                System.out.println("2. Nama : " + mahasiswa.getDataMahasiswa(index_mhs).getNama());
//                System.out.println("3. Jurusan : " + Irfan07156_JurusanEntity.jurusan[mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()]);
//                System.out.println("4. Tanggal Lahir : " + mahasiswa.getDataMahasiswa(index_mhs).getTglLahir());
//                System.out.println("5. No. Telp : " + mahasiswa.getDataMahasiswa(index_mhs).getNo_telp());
//                System.out.println("6. PasswordS : " + mahasiswa.getDataMahasiswa(index_mhs).getPassword());
//                System.out.print("Pilih Angka Untuk Edit : ");
//                pil = input.nextInt();
//                switch (pil) {
//                    case 1:
//                        System.out.println("NPM Sekarang : " + mahasiswa.getDataMahasiswa(index_mhs).getNpm());
//                        System.out.print("Input NPM Baru : ");
//                        npm = input.next();
//                        mahasiswa.updateDataMahasiswa(index_mhs, npm, "npm", "string");
//                        System.out.println("Data Berhasil DiEdit");
//                        break;
//                    case 2:
//                        System.out.println("Nama Sekarang : " + mahasiswa.getDataMahasiswa(index_mhs).getNama());
//                        System.out.print("Input Nama Baru : ");
//                        nama = input.next();
//                        mahasiswa.updateDataMahasiswa(index_mhs, nama, "nama", "string");
//                        System.out.println("Data Berhasil DiEdit");
//                        break;
//                    case 3:
//                        for (int i = 0; i < Irfan07156_JurusanEntity.jurusan.length; i++) {
//                            System.out.println(i + ". " + Irfan07156_JurusanEntity.jurusan[i]);
//                        }
//                        System.out.println("Jurusan Sekarang : " + Irfan07156_JurusanEntity.jurusan[mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()]);
//                        System.out.print("Pilih Jurusan Baru : ");
//                        String str_index_jurusan = input.next();
//                        mahasiswa.updateDataMahasiswa(index_mhs, str_index_jurusan, "index_jurusan", "int");
//                        rencanaMatkul.hapus(index_mhs);
//                        System.out.println("Data Berhasil DiEdit");
//                        break;
//                    case 4:
//                        System.out.println("Tanggal Lahir Sekarang : " + mahasiswa.getDataMahasiswa(index_mhs).getTglLahir());
//                        System.out.print("Input Tgl. Lahir Baru (dd/MM/yyyy) : ");
//                        String Str_tgl_lahir = input.next();
//                        mahasiswa.updateDataMahasiswa(index_mhs, Str_tgl_lahir, "tanggal", "date");
//                        System.out.println("Data Berhasil DiEdit");
//                        break;
//                    case 5:
//                        System.out.println("No. Telp Sekarang : " + mahasiswa.getDataMahasiswa(index_mhs).getNo_telp());
//                        System.out.print("Input No. Telp Baru : ");
//                        no_telp = input.next();
//                        mahasiswa.updateDataMahasiswa(index_mhs, no_telp, "noTelp", "string");
//                        System.out.println("Data Berhasil DiEdit");
//                        break;
//                    case 6:
//                        System.out.println("Password Sekarang : " + mahasiswa.getDataMahasiswa(index_mhs).getPassword());
//                        System.out.print("Input Password Baru : ");
//                        password = input.next();
//                        mahasiswa.updateDataMahasiswa(index_mhs, password, "password", "string");
//                        System.out.println("Data Berhasil DiEdit");
//                        break;
//                }
//                System.out.println("Apakah Ingin Edit Lagi ? (y/t)");
//                jawab = input.next();
//            } while (jawab == "y" | jawab == "Y");
//        }
//    }
//
//    public void viewHapusDataMahasiswa() {
//        if (mahasiswa.getDataMahasiswa().size() == 0) {
//            System.out.println("Data Masih Kosong");
//        } else {
//            viewDataMahasiswa();
//            System.out.print("Pilih Nomor : ");
//            index_mhs = input.nextInt();
//            mahasiswa.deleteDataMahasiswa(index_mhs);
//            System.out.println("Data Berhasil Dihapus");
//        }
//    }
}
