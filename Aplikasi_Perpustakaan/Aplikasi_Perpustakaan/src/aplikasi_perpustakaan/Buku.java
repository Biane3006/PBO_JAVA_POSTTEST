package aplikasi_perpustakaan;

import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.inputanUser;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataBuku;

/**
 *
 * @author Syamsir-Sarul
 */
public class Buku {
    //Atribut Buku
    private String idBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    private int stok;
    
    //Konstruktor 1 (Tanpa Parameter)
    Buku(){
    }
    
    //Konstruktor 2 (Dengan Parameter)
    //Konstruktor ini tidak saya gunakan karena sudah menggunakan Method Set yang ada dibawahnya
    Buku(String idBuku, String judul, String pengarang, String penerbit, int tahunTerbit, int stok){
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }
    
    
    //Set Data Buku
    //1. setIdBuku
    public void setIdBuku(String idBuku){
        this.idBuku = idBuku;
    }
    //2. setJudul
    public void setJudul(String judul){
        this.judul = judul;
    }
    //3. setPengarang
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    //4. setPenerbit
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    //5. setTahunTerbit
    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    //6. setStok
    public void setStok(int stok){
        this.stok = stok;
    }
    
    //Get Data Buku
    //1. getIdBuku
    public String getIdBuku(){
        return idBuku;
    }
    //2. getJudul
    public String getJudul(){
        return judul;
    }
    //3. getPengarang
    public String getPengarang(){
        return pengarang;
    }
    //4. getPenerbit
    public String getPenerbit(){
        return penerbit;
    }
    //5. getTahunTerbit
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    //6. getStok
    public int getStok(){
        return stok;
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
        for(Buku cariBuku: dataBuku){
            //Percabangan untuk memeriksa apakah id Buku yang akan dihapus sama dengan idBuku yang ada di arraylist
            if(cariBuku.getIdBuku().equals(idHapus)){
                dapat = true;
                dataBuku.remove(cariBuku);
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
}
