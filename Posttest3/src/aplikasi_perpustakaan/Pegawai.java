/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_perpustakaan;

import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataPegawai;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.inputanUser;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.clearScreen;

/**
 *
 * @author Syamsir-Sarul
 */
public class Pegawai extends User{
    
    //Konstruktor tanpa parameter, saya tidak mengerti penggunaan keyword STATIC
    //sehingga saya menggunakan konstruktor tanpa parameter untuk membuat objek baru di Aplikasi_Perpustakaan tanpa parameter
    Pegawai(){
    }
    
    //Konstruktor dengan parameter
    Pegawai(String username, String password, String nama, String alamat, int umur) {
        super(username,password,nama,alamat,umur);
    }
    
    @Override
    public void LoginUser(){
        Buku bukuBaru = new Buku();
        Anggota anggotaBaru = new Anggota();
        //Membuat 1 pegawai
        Pegawai pegawai1 = new Pegawai("admin","123","Syamsir","Jalan Manunggal", 21);
        Pegawai pegawai2 = new Pegawai("admin2","123","Syamsir","Jalan Manunggal", 21);
        Pegawai pegawai3 = new Pegawai("admin3","123","Syamsir","Jalan Manunggal", 21);
        dataPegawai.add(pegawai1);
        dataPegawai.add(pegawai2);
        dataPegawai.add(pegawai3);
        boolean ulangLogin = true;
        while(ulangLogin){
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡብህንምህንምህንም");
            System.out.println("ፍምድ Login Pegawai Perpustakaan ፍህፍፍ");
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልህንምህንምኮፕፖይብህንም");
            System.out.print(">> Username : ");
            String username = inputanUser.nextLine();
            System.out.print(">> Password : ");
            String password = inputanUser.nextLine();
            clearScreen();
            boolean akunDitemukan = false;
            for(Pegawai cariPegawai : dataPegawai){
                if(cariPegawai.getUsername().equals(username) && cariPegawai.getPassword().equals(password)){
                    akunDitemukan = true;
                    ulangLogin = false;
                    boolean ulangLagi = true;
                    while(ulangLagi){
                        System.out.println("");
                        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡብህንምህንምህንም");
                        System.out.println("ፍፍህፍህንንምድፍህ Menu Pegawai ፍህንፍፍህንምፍፍ");
                        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልህንምህንምኮፕፖይብህንም");
                        System.out.println("[1]. Data Buku Perpustakaan");
                        System.out.println("[2]. Data Anggota Perpustakaan");
                        System.out.println("[3]. Data Peminjaman");
                        System.out.println("[4]. Logout");
                        System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                        System.out.print(">> Masukkan Pilihan [1-3]: ");
                        String menuUtama = inputanUser.nextLine();
                        switch(menuUtama){
                            case "1":
                                System.out.println("");
                                clearScreen();
                                //Boolean untuk perulangan while
                                boolean ulangMenuBuku = true;
                                while(ulangMenuBuku){
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.println("ፍፍፍፍድድ Aplikasi Perpustakaan ፍፍድፍግፍ");
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.println("[1]. Lihat Data Buku");
                                    System.out.println("[2]. Tambah Data Buku");
                                    System.out.println("[3]. Ubah Data Buku");
                                    System.out.println("[4]. Hapus Data Buku");
                                    System.out.println("[5]. Kembali");
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.print(">> Masukkan Pilihan [1-5]: ");
                                    String menuBuku = inputanUser.nextLine();
                                    switch(menuBuku){
                                        case "1":
                                            //Memanggil Method dari Class Aplikasi_Perpustakaan
                                            bukuBaru.tampilBuku();
                                            break;
                                        case "2":
                                            bukuBaru.tambahBuku();
                                            break;
                                        case "3":
                                            bukuBaru.ubahBuku();
                                            break;
                                        case "4":
                                            bukuBaru.hapusBuku();
                                            break;
                                        case "5":
                                            ulangMenuBuku = false;
                                            break;
                                        default:
                                            System.out.println("");
                                            System.out.println(">>> Menu tidak ditemukan <<<");
                                    }
                                }
                                break;
                            case "2":
                                System.out.println("");
                                clearScreen();
                                //Boolean untuk perulangan while
                                boolean ulangMenuAnggota = true;
                                while(ulangMenuAnggota){
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.println("ድፍግፍፍድ Aplikasi Perpustakaan ፍፍድፍፍፍ");
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.println("[1]. Lihat Data Anggota");
                                    System.out.println("[2]. Tambah Data Anggota");
                                    System.out.println("[3]. Ubah Data Anggota");
                                    System.out.println("[4]. Hapus Data Anggota");
                                    System.out.println("[5]. Kembali");
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.print(">> Masukkan Pilihan [1-5]: ");
                                    String menuAnggota = inputanUser.nextLine();
                                    switch(menuAnggota){
                                        case "1":
                                            //Memanggil Method dari Class Aplikasi_Perpustakaan
                                            anggotaBaru.tampilAnggota();
                                            break;
                                        case "2":
                                            anggotaBaru.tambahAnggota();
                                            break;
                                        case "3":
                                            anggotaBaru.ubahAnggota();
                                            break;
                                        case "4":
                                            anggotaBaru.hapusAnggota();
                                            break;
                                        case "5":
                                            ulangMenuAnggota = false;
                                            break;
                                        default:
                                            System.out.println(">>> Menu tidak ditemukan <<<");
                                    }
                                }
                                break;
                            case "3":
                                System.out.println("");
                                clearScreen();
                                //Boolean untuk perulangan while
                                boolean ulangMenuPinjam = true;
                                while(ulangMenuPinjam){
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.println("ድፍግፍፍድ Aplikasi Perpustakaan ፍፍድፍፍፍ");
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.println("[1]. Lihat Data Peminjaman");
                                    System.out.println("[2]. Hapus Data Peminjaman");
                                    System.out.println("[3]. Kembali");
                                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                                    System.out.print(">> Masukkan Pilihan [1-3]: ");
                                    String menuPinjam = inputanUser.nextLine();
                                    Pinjam pinjam = new Pinjam();
                                    switch(menuPinjam){
                                        case "1":
                                            pinjam.tampilPinjam();
                                            break;
                                        case "2":
                                            pinjam.hapusPinjam();
                                            break;
                                        case "3":
                                            ulangMenuPinjam = false;
                                            break;
                                        default:
                                            System.out.println(">>> Menu Tidak Ditemukan <<<");
                                    }
                                }
                                break;
                            case "4":
                                System.out.println("");
                                clearScreen();
                                ulangLagi = false;
                                break;
                            default:
                                System.out.println(">>> Menu tidak ditemukan <<<");
                                break;
                        }
                    }
                    //break untuk keluar dari perulangan FOR untuk mencari AKUN yang sesuai
                    break;
                }
            }
            //Memeriksa apakah akun ditemukan atau tidak
            if(akunDitemukan == false){
                System.out.println("");
                System.out.println(">>> Username dan Password tidak  ditemukan !!! <<<");
                System.out.println("");
            }
        }
    }
}
