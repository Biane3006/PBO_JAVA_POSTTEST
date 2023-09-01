package aplikasi_perpustakaan;

import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataAnggota;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataBuku;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataPinjam;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.inputanUser;

/**
 *
 * @author Syamsir-Sarul
 */
public class Anggota extends User{

    //Konstruktor tanpa parameter untuk memanggil objek baru, tanpa menggunakan static
    Anggota(){
    }
    //Konstruktor Dengan parameter    
    Anggota(String username, String password, String nama, String alamat, int umur) {
        super(username,password,nama,alamat,umur);
    }
    
    //Method CRUD Anggota
    //1. Create/Register (tambahAnggota)
    public void tambahAnggota(){
        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክህጅህህጅህጅክክ");
        System.out.println("ህጅግፍፍግእክ REGISTRASI ህጅግፍፍእክ");
        System.out.println("ህጅክህጅክህጅክህጅክህጅክህጅክህጅክህጅህጅህክ");
        //Mengisi Data Buku Sesuai inputan User (Objek dibuat dengan method Set karena atribut class bersifat Private)
        System.out.print(">> Username :");
        super.setUsername(inputanUser.nextLine());
        System.out.print(">> Password :");
        super.setPassword(inputanUser.nextLine());
        System.out.print(">> Nama :");
        super.setNama(inputanUser.nextLine());
        System.out.print(">> Alamat : ");
        super.setAlamat(inputanUser.nextLine());
        System.out.print(">> Umur : ");
        super.setUmur(Integer.parseInt(inputanUser.nextLine()));
         //Memasukkan Objek bukuBaru ke dalam Class ArrayList
        Anggota anggotaBaru = new Anggota(super.getUsername(),super.getPassword(),super.getNama(),super.getAlamat(),super.getUmur());
        dataAnggota.add(anggotaBaru);
        System.out.println(">>>Regsitrasi Telah Berhasil, Silahkan Login Anggota !!!<<<");
    }
    //2. Read (tampilAnggota)
    public void tampilAnggota(){
        if(dataAnggota.isEmpty()){
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍፍድፍድ DATA ANGGOTA PERPUSTAKAAN ፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("|  USERNAME  |          NAMA           |          ALAMAT           | UMUR |");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍፍድፍፍድፍፍ D  A  T  A     M  A  S  I  H     K  O  S  O  N  G ፍድፍፍድፍፍድፍፍድፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
        }else{
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍፍድፍድ DATA ANGGOTA PERPUSTAKAAN ፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("|  USERNAME  |          NAMA           |          ALAMAT           | UMUR |");
            for(Anggota Data : dataAnggota){
                System.out.printf("|%-12s|%-25s|%-27s|%-6d|\n",Data.getUsername(), Data.getNama(), Data.getAlamat(),Data.getUmur());
                System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            }
        }
    }
    
    //3. Update (ubahAnggota)
    public void ubahAnggota(){
        tampilAnggota();
        //Meminta Id Anggota yang akan diganti datanya
        System.out.println("ፍድግፍፍግእዕእርድፍግይህጅክህጅህጅክህክ");
        System.out.println("ክ GANTI  DATA  ANGGOTA ህ");
        System.out.println("ህክህጅክህጅክህጅክህጅክህጅክህጅክህጅህክ");
        System.out.print(">> Masukkan Username Akun : ");
        String idGanti = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        //Melakukan perulangan for untuk mencari data buku yang akan diganti 
        for(Anggota cariAnggota: dataAnggota){
            if(cariAnggota.getUsername().equals(idGanti)){
                dapat = true;
                //Mengisi Data Buku Sesuai inputan User (Objek dibuat dengan method Set karena atribut class bersifat Private)
                System.out.print(">> Username Baru : ");
                cariAnggota.setUsername(inputanUser.nextLine());
                System.out.print(">> Password Baru: ");
                cariAnggota.setPassword(inputanUser.nextLine());
                System.out.print(">> Nama :");
                cariAnggota.setNama(inputanUser.nextLine());
                System.out.print(">> Alamat : ");
                cariAnggota.setAlamat(inputanUser.nextLine());
                System.out.print(">> Umur : ");
                cariAnggota.setUmur(Integer.parseInt(inputanUser.nextLine()));
                System.out.println("DATA BERHASIL DI UPDATE!!!");
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
        System.out.print(">> Masukkan Username Akun : ");
        String idHapus = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        //Melakukan perulangan untuk mencari data buku yang akan dihapus
        for(int i = 0; i < dataAnggota.size(); i++){
            //Percabangan untuk memeriksa apakah id Buku yang akan dihapus sama dengan idBuku yang ada di arraylist
            if(dataAnggota.get(i).getUsername().equals(idHapus)){
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
    
    public void lihatStrukPeminjaman(Anggota anggotaBaru){
        for(Pinjam cariData : dataPinjam){
            if(cariData.getNamaPeminjam().equals(anggotaBaru.getNama())){
                System.out.println("===============================");
                System.out.println("==========Pinjam Buku==========");
                System.out.println("===============================");
                System.out.println(">> Nama            : " + cariData.getNamaPeminjam());
                System.out.println(">> Judul Buku      : " + cariData.getJudulBuku());
                System.out.println(">> Tanggal Pinjam  : " + cariData.getTgl_pinjam());
                System.out.println(">> Tanggal Kembali : " + cariData.getTgl_kembali());
                System.out.println(">>Silahkan Ambil Buku di Perpustkaan dengan menunjukkan Bukti ini<<");
            }
        }
        System.out.print("Tekan Enter untuk kembali...");
        inputanUser.nextLine();
    }
    
    @Override
    public void LoginUser(){
        int percobaan = 3;
        boolean ulangLogin = true;
        while(ulangLogin){
            boolean akunDitemukan = false;
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡብህንምህንምህንም");
            System.out.println("ፍምድ Login Anggota Perpustakaan ፍህፍፍ");
            System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልህንምህንምኮፕፖይብህንም");
            System.out.print(">> Username : ");
            String username = inputanUser.nextLine();
            System.out.print(">> Password : ");
            String password = inputanUser.nextLine();
            for(Anggota cariAnggota : dataAnggota){
                if(cariAnggota.getUsername().equals(username) && cariAnggota.getPassword().equals(password)){
                    akunDitemukan = true;
                    boolean ulangMenuAnggota = true;
                    while(ulangMenuAnggota){
                        Buku dataBuku = new Buku();
                        System.out.println("");
                        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልኮፕፖኡብህንምህንምህንም");
                        System.out.println("ፍፍህፍህንንምድፍህ Menu Anggota ፍህንፍፍህንምፍፍ");
                        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክጂኦልህንምህንምኮፕፖይብህንም");
                        System.out.println("[1]. Pinjam Buku");
                        System.out.println("[2]. Lihat Bukti Peminjaman");
                        System.out.println("[3]. Logout");
                        System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
                        System.out.print(">> Masukkan Pilihan [1-3]: ");
                        String menuUtama = inputanUser.nextLine();
                        Pinjam pinjam = new Pinjam();
                        switch(menuUtama){
                            case "1":
                                pinjam.pinjamBuku(dataBuku,cariAnggota);
                                break;
                            case "2":
                                lihatStrukPeminjaman(cariAnggota);
                                break;
                            case "3":
                                ulangMenuAnggota = false;
                                ulangLogin = false;
                                break;
                            default:
                                System.out.println(">>> Menu Tidak Ditemukan <<<");
                                break;
                        }
                    }
                }
            }
            if(akunDitemukan == false){
                System.out.println("");
                System.out.println(">>> Username dan Password tidak  ditemukan !!! <<<");
                System.out.println("");
                percobaan = percobaan - 1;
            }
            if(percobaan == 0){
                System.out.println("Silahkan Registrasi Terlebih Dahulu");
                System.out.print("Tekan Enter untuk kembali...");
                inputanUser.nextLine();
                ulangLogin = false;
            }
        }
    }
}
