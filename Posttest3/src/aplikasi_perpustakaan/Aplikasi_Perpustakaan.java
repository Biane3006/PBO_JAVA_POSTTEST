package aplikasi_perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * 
 * @author Syamsir-Sarul
 */
//Nama :Syamsir
//NIM  : 2109106090


public class Aplikasi_Perpustakaan {
    static ArrayList <Pegawai> dataPegawai = new ArrayList<Pegawai>();
    static ArrayList<Buku> dataBuku = new ArrayList<Buku>();
    static ArrayList<Anggota> dataAnggota = new ArrayList<Anggota>();
    static ArrayList<Pinjam> dataPinjam = new ArrayList<Pinjam>();
    
    //Membuat Objek Scanner(INPUTAN)
    static Scanner inputanUser = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        //Membuat objek dari Class CRUD_ArrayList yang bertipe ArrayList
        Buku bukuBaru = new Buku();
        Pegawai pegawaiBaru = new Pegawai();
        Anggota anggotaBaru = new Anggota();
        
        //Boolean untuk looping program
        boolean looping = true;
        //Perulangan while untuk menu
        while(looping){
            System.out.println("");
            clearScreen();
            
            System.out.println("");
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡብህንምህንምህንም");
            System.out.println("ፍፍህንምድ Aplikasi Perpustakaan ፍህንምፍፍ");
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልህንምህንምኮፕፖይብህንም");
            System.out.println("[1]. Login Anggota Perpustakaan");
            System.out.println("[2]. Register Anggota Perpustakaan");
            System.out.println("[3]. Login Pegawai Perpustakaan");
            System.out.println("[4]. Keluar");
            System.out.print(">> Masukkan Pilihan [1-3] : ");
            String menuLogin = inputanUser.nextLine();
            switch(menuLogin){
                case "1":
                    System.out.println("");
                    clearScreen();
                    anggotaBaru.LoginUser();
                    break;
                case "2":
                    System.out.println("");
                    clearScreen();
                    anggotaBaru.tambahAnggota();
                    break;
                case "3":
                    System.out.println("");
                    clearScreen();
                    pegawaiBaru.LoginUser();
                    break;
                case "4":
                    looping = false;
                    clearScreen();
                    System.out.println("TERIMA KASIH");
                    System.out.print("Tekan Enter untuk Keluar...");
                    inputanUser.nextLine();
                    break;
                default:
                    System.out.println(">>> Menu Tidak Ditemukan <<<");
                    System.out.print("Tekan Enter unuk melanjutkan...");
                    inputanUser.nextLine();
                    break;
            }
        }
    }
    
    
    //Method clearscreen
    static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch(Exception ex){
            System.err.println("Tidak Bisa ClearScreen");
        }
    }
}