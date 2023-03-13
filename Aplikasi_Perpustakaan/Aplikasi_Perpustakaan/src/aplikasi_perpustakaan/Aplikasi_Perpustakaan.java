package aplikasi_perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Syamsir-Sarul
 */


public class Aplikasi_Perpustakaan {
    static ArrayList<Buku> dataBuku = new ArrayList<>();
    static ArrayList<Anggota> dataAnggota = new ArrayList<>();
    
    //Membuat Objek Scanner(INPUTAN)
    static Scanner inputanUser = new Scanner(System.in);
    
    //Method clearscreen
    static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch(Exception ex){
            System.err.println("Tidak Bisa ClearScreen");
        }
    }
    
    public static void main(String[] args) {
        //Membuat objek dari Class CRUD_ArrayList yang bertipe ArrayList
        Buku bukuBaru = new Buku();
        Anggota anggotaBaru = new Anggota();
        
        //Boolean untuk looping program
        boolean looping = true;
        //Perulangan while untuk menu
        while(looping){
            clearScreen();
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡብህንምህንምህንም");
            System.out.println("ፍፍህንምድ Aplikasi Perpustakaan ፍህንምፍፍ");
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልህንምህንምኮፕፖይብህንም");
            System.out.println("[1]. Data Buku Perpustakaan");
            System.out.println("[2]. Data Anggota Perpustakaan");
            System.out.println("[3]. Keluar");
            System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
            System.out.print(">> Masukkan Pilihan [1-3]: ");
            String menuUtama = inputanUser.nextLine();
            switch(menuUtama){
                case "1":
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
                                System.out.println(">>> Menu tidak ditemukan <<<");
                        }
                    }
                    break;
                case "2":
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
                    clearScreen();
                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                    System.out.println("ፍድፍፍድፍግፍግፍ TERIMA  KASIH ግፍድእዕእርድፍፍ");
                    System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                    looping = false;
                    break;
                default:
                    System.out.println(">>> Menu tidak ditemukan <<<");
            }
        }
    }
}