package aplikasi_perpustakaan;

/**
 *
 * @author Syamsir-Sarul
 */
public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private int umur;

    //Konstruktor Tanpa Parameter
    Anggota(){
    }
    //Konstruktor Dengan parameter
    Anggota(String idAnggota, String nama, String alamat, int umur) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
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
}
