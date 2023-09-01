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
    static ArrayList<Buku> dataBuku = new ArrayList<>();
    static ArrayList<Anggota> dataAnggota = new ArrayList<>();
    
    //Membuat Objek Scanner(INPUTAN)
    static Scanner inputanUser = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        //Membuat objek dari Class CRUD_ArrayList yang bertipe ArrayList
        Aplikasi_Perpustakaan appLibrary = new Aplikasi_Perpustakaan();
        
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
            System.out.println("[1]. Data Buku Perpustakaan");
            System.out.println("[2]. Data Anggota Perpustakaan");
            System.out.println("[3]. Keluar");
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
                                appLibrary.tampilBuku();
                                break;
                            case "2":
                                appLibrary.tambahBuku();
                                break;
                            case "3":
                                appLibrary.ubahBuku();
                                break;
                            case "4":
                                appLibrary.hapusBuku();
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
                                appLibrary.tampilAnggota();
                                break;
                            case "2":
                                appLibrary.tambahAnggota();
                                break;
                            case "3":
                                appLibrary.ubahAnggota();
                                break;
                            case "4":
                                appLibrary.hapusAnggota();
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
    
    //Method CRUD Buku
    //1. Create
    public void tambahBuku(){
        Buku bukuBaru = new Buku();
        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክህጅህጅክክ");
        System.out.println("ህጅክ TAMBAH DATA BUKU ህጅክ");
        System.out.println("ህጅክህጅክህጅክህጅክህጅክህጅክህጅክህጅክ");
        //Mengisi Data Buku Sesuai inputan User
        System.out.print(">> ID Buku : ");
        bukuBaru.setIdBuku(inputanUser.nextLine());
        System.out.print(">> Judul Buku :");
        bukuBaru.setJudul(inputanUser.nextLine());
        System.out.print(">> Pengarang Buku : ");
        bukuBaru.setPengarang(inputanUser.nextLine());
        System.out.print(">> Penerbit Buku : ");
        bukuBaru.setPenerbit(inputanUser.nextLine());
        System.out.print(">> Tahun Terbit Buku : ");
        bukuBaru.setTahunTerbit(Integer.parseInt(inputanUser.nextLine()));
        System.out.print(">> Stok Buku : ");
        bukuBaru.setStok(Integer.parseInt(inputanUser.nextLine()));
         //Memasukkan Objek bukuBaru ke dalam Class ArrayList
        dataBuku.add(bukuBaru);
        System.out.println(">>>Data Telah Berhasil Ditambahkan!!!<<<");
    }
    //2. Read
    public void tampilBuku(){
        if(dataBuku.isEmpty()){
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድ DATA BUKU PERPUSTAKAAN ፍድፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("| ID BUKU |     JUDUL     |    PENGARANG    |   PENERBIT   | TAHUN | STOK |");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍፍድፍፍድፍፍ D  A  T  A     M  A  S  I  H     K  O  S  O  N  G ፍድፍፍድፍፍድፍፍድፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
        }else{
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድ DATA BUKU PERPUSTAKAAN ፍድፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("| ID BUKU |     JUDUL     |    PENGARANG    |   PENERBIT   | TAHUN | STOK |");
            for(Buku Data : dataBuku){
                System.out.printf("|%-9s|%-15s|%-17s|%-14s|%-7d|%-6d|\n",Data.getIdBuku(),Data.getJudul(), Data.getPengarang(), Data.getPenerbit(), Data.getTahunTerbit(), Data.getStok());
                System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            }
        }
    }
    //3. Update
    public void ubahBuku(){
        //Meminta Id Buku yang akan diganti datanya
        tampilBuku();
        System.out.println("ፍድግፍፍግእዕእርድፍግይህጅክህጅህጅክህክ");
        System.out.println("ህጅክ UBAH  DATA  BUKU ህጅክ");
        System.out.println("ህክህጅክህጅክህጅክህጅክህጅክህጅክህጅህክ");
        System.out.print(">> Masukkan ID Buku : ");
        String idGanti = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        //Melakukan perulangan for untuk mencari data buku yang akan diganti 
        for(Buku cariBuku: dataBuku){
            if(cariBuku.getIdBuku().equals(idGanti)){
                dapat = true;
                //Set data Buku terbaru
                System.out.print(">> ID Buku : ");
                cariBuku.setIdBuku(inputanUser.nextLine());
                System.out.print(">> Judul Buku :");
                cariBuku.setJudul(inputanUser.nextLine());
                System.out.print(">> Pengarang Buku : ");
                cariBuku.setPengarang(inputanUser.nextLine());
                System.out.print(">> Penerbit Buku : ");
                cariBuku.setPenerbit(inputanUser.nextLine());
                System.out.print(">> Tahun Terbit Buku : ");
                cariBuku.setTahunTerbit(Integer.parseInt(inputanUser.nextLine()));
                System.out.print(">> Stok Buku : ");
                cariBuku.setStok(Integer.parseInt(inputanUser.nextLine()));
            }
        }
        if(dapat == false){
            System.out.println(">>>Data Tidak Ditemukan<<<");
        }else{
            System.out.println(">>>Data Telah Berhasil Diganti!!!<<<");
            tampilBuku();
        }
    }
    
    //4. Delete (hapusBuku)
    public void hapusBuku(){
        //Meminta Id Buku yang akan dihapus
        tampilBuku();
        System.out.println("ፍድግፍፍግእዕእርድፍግይህጅክህጅህጅክክ");
        System.out.println("ህጅክ HAPUS DATA BUKU ህጅክ");
        System.out.println("ህክህጅክህጅክህጅክህጅክህጅክህጅክህጅክ");
        System.out.print(">> Masukkan ID Buku : ");
        String idHapus = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        //Melakukan perulangan untuk mencari data buku yang akan dihapus
        for(int i = 0; i < dataBuku.size(); i++){
            //Percabangan untuk memeriksa apakah id Buku yang akan dihapus sama dengan idBuku yang ada di arraylist
            if(dataBuku.get(i).getIdBuku().equals(idHapus)){
                dapat = true;
                dataBuku.remove(dataBuku.get(i));
            }
        }
        //Memeriksa apakah data yang akan dihapus dapat ditemukan atau tidak
        if(dapat == false){
            System.out.println(">>>Data Tidak Ditemukan<<<");
        }else{
            System.out.println(">>>Data Telah Terhapus!!!<<<");
            tampilBuku();
        }
    }
    
    //Method CRUD Anggota
    //1. Create (tambahAnggota)
    public void tambahAnggota(){
        Anggota anggotaBaru = new Anggota();
        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክህጅህህጅህጅክክ");
        System.out.println("ህጅክ TAMBAH DATA ANGGOTA ህጅክ");
        System.out.println("ህጅክህጅክህጅክህጅክህጅክህጅክህጅክህጅህጅህክ");
        //Mengisi Data Buku Sesuai inputan User (Objek dibuat dengan method Set karena atribut class bersifat Private)
        System.out.print(">> ID Anggota : ");
        anggotaBaru.setIdAnggota(inputanUser.nextLine());
        System.out.print(">> Nama :");
        anggotaBaru.setNama(inputanUser.nextLine());
        System.out.print(">> Alamat : ");
        anggotaBaru.setAlamat(inputanUser.nextLine());
        System.out.print(">> Umur : ");
        anggotaBaru.setUmur(Integer.parseInt(inputanUser.nextLine()));
         //Memasukkan Objek bukuBaru ke dalam Class ArrayList
        dataAnggota.add(anggotaBaru);
        System.out.println(">>>Data Telah Berhasil Ditambahkan!!!<<<");
    }
    //2. Read (tampilAnggota)
    public void tampilAnggota(){
        if(dataAnggota.isEmpty()){
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍፍድፍድ DATA ANGGOTA PERPUSTAKAAN ፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("| ID ANGGOTA |          NAMA           |          ALAMAT           | UMUR |");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍፍድፍፍድፍፍ D  A  T  A     M  A  S  I  H     K  O  S  O  N  G ፍድፍፍድፍፍድፍፍድፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
        }else{
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍፍድፍድ DATA ANGGOTA PERPUSTAKAAN ፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("| ID ANGGOTA |          NAMA           |          ALAMAT           | UMUR |");
            for(Anggota Data : dataAnggota){
                System.out.printf("|%-12s|%-25s|%-27s|%-6d|\n",Data.getIdAnggota(), Data.getNama(), Data.getAlamat(),Data.getUmur());
                System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            }
        }
    }
    
    //3. Update (ubahAnggota)
    public void ubahAnggota(){
        tampilAnggota();
        //Meminta Id Buku yang akan diganti datanya
        System.out.println("ፍድግፍፍግእዕእርድፍግይህጅክህጅህጅክህክ");
        System.out.println("ክ UBAH   DATA  ANGGOTA ህ");
        System.out.println("ህክህጅክህጅክህጅክህጅክህጅክህጅክህጅህክ");
        System.out.print(">> Masukkan ID Anggota : ");
        String idGanti = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        //Melakukan perulangan for untuk mencari data buku yang akan diganti 
        for(Anggota cariAnggota: dataAnggota){
            if(cariAnggota.getIdAnggota().equals(idGanti)){
                dapat = true;
                //Mengisi Data Buku Sesuai inputan User (Objek dibuat dengan method Set karena atribut class bersifat Private)
                System.out.print(">> ID Anggota : ");
                cariAnggota.setIdAnggota(inputanUser.nextLine());
                System.out.print(">> Nama :");
                cariAnggota.setNama(inputanUser.nextLine());
                System.out.print(">> Alamat : ");
                cariAnggota.setAlamat(inputanUser.nextLine());
                System.out.print(">> Umur : ");
                cariAnggota.setUmur(Integer.parseInt(inputanUser.nextLine()));
            }
        }
        if(dapat == false){
            System.out.println(">>>Data Tidak Ditemukan<<<");
        }else{
            System.out.println(">>>Data Telah Berhasil Diganti!!!<<<");
            tampilAnggota();
        }
    }
    
    //4. Delete (hapusAnggota)
    public void hapusAnggota(){
        tampilAnggota();
        //Meminta IdAnggota yang akan dihapus
        System.out.println("ፍድግፍፍግእዕእርድፍግይህጅክህጅህጅክክ");
        System.out.println("ክ HAPUS  DATA ANGGOTA ክ");
        System.out.println("ህክህጅክህጅክህጅክህጅክህጅክህጅክህጅክ");
        System.out.print(">> Masukkan ID Anggota : ");
        String idHapus = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        //Melakukan perulangan untuk mencari data buku yang akan dihapus
        for(int i = 0; i < dataAnggota.size(); i++){
            //Percabangan untuk memeriksa apakah id Buku yang akan dihapus sama dengan idBuku yang ada di arraylist
            if(dataAnggota.get(i).getIdAnggota().equals(idHapus)){
                dapat = true;
                dataAnggota.remove(dataAnggota.get(i));
            }
        }
        //Memeriksa apakah data yang akan dihapus dapat ditemukan atau tidak
        if(dapat == false){
            System.out.println(">>>Data Tidak Ditemukan<<<");
        }else{
            System.out.println(">>>Data Telah Terhapus!!!<<<");
            tampilAnggota();
        }
    }
}