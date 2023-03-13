package aplikasi_perpustakaan;


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
}
