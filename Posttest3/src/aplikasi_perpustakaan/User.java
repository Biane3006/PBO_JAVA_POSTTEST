/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_perpustakaan;

/**
 *
 * @author Syamsir-Sarul
 */
public class User {
    private String username;
    private String password;
    private String nama;
    private String alamat;
    private int umur;

    //Kontruktor Kosong (untuk menghindari static), sehingga subclass nya boleh dipanggil tanpa parameter
    User(){
    }
    
    //Konstruktor
    protected User(String username, String password, String nama, String alamat, int umur) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    protected void LoginUser(){
    }
}
