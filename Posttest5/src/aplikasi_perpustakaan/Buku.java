package aplikasi_perpustakaan;

import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataBuku;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.inputanUser;


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
    
    //Konstruktor 1 tanpa parameter (Saya tidak paham dengan penggunaan keyword STATIC)
    Buku(){
    }
    
    //Konstruktor 2 (Menggunakan parameter)
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
    public final void tambahBuku(){
        System.out.println("ፍድፍግፍፍግእዕእርድፍግይህጅክህጅህጅክክ");
        System.out.println("ህጅክ TAMBAH DATA BUKU ህጅክ");
        System.out.println("ህጅክህጅክህጅክህጅክህጅክህጅክህጅክህጅክ");
        //Mengisi Data Buku Sesuai inputan User
        System.out.print(">> ID Buku : ");
        this.idBuku = inputanUser.nextLine();
        System.out.print(">> Judul Buku :");
        this.judul = inputanUser.nextLine();
        System.out.print(">> Pengarang Buku : ");
        this.pengarang = inputanUser.nextLine();
        System.out.print(">> Penerbit Buku : ");
        this.penerbit = inputanUser.nextLine();
        System.out.print(">> Tahun Terbit Buku : ");
        this.tahunTerbit = Integer.parseInt(inputanUser.nextLine());
        System.out.print(">> Stok Buku : ");
        this.stok = Integer.parseInt(inputanUser.nextLine());
         //Memasukkan Objek bukuBaru ke dalam Class ArrayList
         Buku bukuBaru = new Buku(this.idBuku,this.judul,this.pengarang,this.penerbit,this.tahunTerbit,this.stok);
        dataBuku.add(bukuBaru);
        System.out.println(">>>Data Telah Berhasil Ditambahkan!!!<<<");
    }
    //2. Read
    public final void tampilBuku(){
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
    public final void ubahBuku(){
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
    public final void hapusBuku(){
        //Meminta Id Buku yang akan dihapus
        tampilBuku();
        System.out.println("ፍድግፍፍግእዕእርድፍግይህጅክህጅህጅክክ");
        System.out.println("ህጅክ HAPUS DATA BUKU ህጅክ");
        System.out.println("ህክህጅክህጅክህጅክህጅክህጅክህጅክህጅክ");
        System.out.print(">> Masukkan ID Buku : ");
        String idHapus = inputanUser.nextLine();
        //Membuat variabel boolean "dapat" untuk memeriksa apakah data yang akan dihapus ada atau tidak
        boolean dapat = false;
        if(dataBuku.isEmpty()){
            System.out.println("Kembali ke menu....");
            inputanUser.nextLine();
        }else{
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
    }
    
    public void menuCariBuku(){
        boolean ulangCariBuku = true;
        while(ulangCariBuku){
            System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡፍፍፍፍፍፍይብህንም");
            System.out.println("ድፍፍፍፍግፍፍድፍድፍድ Cari Data Buku ፍፍፍፍድፍፍፍድፍፍፍ");
            System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡፍፍፍፍፍፍይብህንም");
            System.out.println("[1]. Berdasarkan Judul Buku");
            System.out.println("[2]. Berdasarkan Tahun Terbit Buku");
            System.out.println("[3]. Kembali");
            System.out.println("ፍድፍግፍፍግእዕእርድፍህንምህንምግይህጅክጂኦልኮፕኡይብህንም");
            System.out.print(">> Masukkan Pilihan [1-3]: ");
            String menuCariBuku = inputanUser.nextLine();
            switch(menuCariBuku){
                case "1":
                    System.out.print(">> Masukkan Judul Buku : ");
                    String judul = inputanUser.nextLine();
                    cariDataBuku(judul);
                    break;
                case "2":
                    System.out.print(">> Masukkan Tahun Terbit Buku : ");
                    int tahunTerbit = Integer.parseInt(inputanUser.nextLine());
                    cariDataBuku(tahunTerbit);
                    break;
                case "3":
                    ulangCariBuku = false;
                    break;
                default:
                    System.out.println(">>> Menu Tidak Ditemukan <<<");
            }
        }
    }
    
    //@Overload
    public void cariDataBuku(String judul){
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
                if(Data.getJudul().equals(judul)){
                    System.out.printf("|%-9s|%-15s|%-17s|%-14s|%-7d|%-6d|\n",Data.getIdBuku(),Data.getJudul(), Data.getPengarang(), Data.getPenerbit(), Data.getTahunTerbit(), Data.getStok());
                    System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
                }
            }
        }
    }
    
    //@overload
    public void cariDataBuku(int tahunTerbit){
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
                if(Data.getTahunTerbit() == tahunTerbit){
                    System.out.printf("|%-9s|%-15s|%-17s|%-14s|%-7d|%-6d|\n",Data.getIdBuku(),Data.getJudul(), Data.getPengarang(), Data.getPenerbit(), Data.getTahunTerbit(), Data.getStok());
                    System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
                }
            }
        }
    }
    
}
