package aplikasi_perpustakaan;

import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.inputanUser;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataAnggota;

/**
 *
 * @author Syamsir-Sarul
 */
public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private int umur;
    
    
    //Set Data Anggota
    //1. setIdAnggota
    public void setIdAnggota(String IdAnggota){
        this.idAnggota = IdAnggota;
    }
    //2. setNama
    public void setNama(String nama){
        this.nama = nama;
    }
    //3. setAlamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    //4. setUmur
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    
    //Get Data Anggota
    //1. getIdAnggota
    public String getIdAnggota(){
        return idAnggota;
    }
    //2. getNama
    public String getNama(){
        return nama;
    }
    //3. getAlamat
    public String getAlamat(){
        return alamat;
    }
    //4. getUmur
    public int getUmur(){
        return umur;
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
                System.out.printf("|%-12s|%-25s|%-27s|%-6d",Data.getIdAnggota(), Data.getNama(), Data.getAlamat(),Data.getUmur());
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
        for(Anggota cariAnggota: dataAnggota){
            //Percabangan untuk memeriksa apakah id Buku yang akan dihapus sama dengan idBuku yang ada di arraylist
            if(cariAnggota.getIdAnggota().equals(idHapus)){
                dapat = true;
                dataAnggota.remove(cariAnggota);
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
