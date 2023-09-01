/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_perpustakaan;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.inputanUser;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataBuku;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.dataPinjam;
import static aplikasi_perpustakaan.Aplikasi_Perpustakaan.clearScreen;
import java.time.LocalDate;

/**
 *
 * @author Syamsir-Sarul
 */
public final class Pinjam{
    private String namaPeminjam;
    private String judulBuku;
    private String tgl_pinjam;
    private String tgl_kembali;
    private String Keterangan;

    Pinjam(){
    }
    
    public Pinjam(String namaPeminjam, String judulBuku, String tgl_pinjam, String tgl_kembali, String Keterangan) {
        this.namaPeminjam = namaPeminjam;
        this.judulBuku = judulBuku;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.Keterangan = Keterangan;
    }
    
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }    
    
    public void pinjamBuku(Buku bukuBaru,Anggota anggotaBaru){
        if(dataBuku.isEmpty()){
            System.out.println(">>> TIDAK ADA BUKU YANG TERSEDIA DI PERPUSTAKAAN <<<");
            System.out.print("Tekan Enter untuk kembali...");
            inputanUser.nextLine();
        }else{
            while(true){
                clearScreen();
                bukuBaru.tampilBuku();
                System.out.println("");
                System.out.print(">> Masukkan Kode Buku yang akan dipinjam : ");
                String judulBuku = inputanUser.nextLine();
                boolean ketemu = false;
                for(Buku cariBuku : dataBuku){
                    if(cariBuku.getIdBuku().equals(judulBuku)){
                        ketemu = true;
                        System.out.println("===============================");
                        System.out.println("==========Pinjam Buku==========");
                        System.out.println("===============================");
                        int sisaStok = cariBuku.getStok() - 1;
                        cariBuku.setStok(sisaStok);
                        this.namaPeminjam = anggotaBaru.getNama();
                        System.out.println(">> Nama            : " + this.namaPeminjam);
                        this.judulBuku = cariBuku.getJudul();
                        System.out.println(">> Judul Buku      : " + this.judulBuku);
                        this.tgl_pinjam = LocalDate.now().toString();
                        System.out.println(">> Tanggal Pinjam  : " + this.tgl_pinjam);
                        this.tgl_kembali = LocalDate.now().plusDays(3).toString();
                        System.out.println(">> Tanggal Kembali : " + this.tgl_kembali);
                        Pinjam dataPeminjaman = new Pinjam(this.namaPeminjam,this.judulBuku,this.tgl_pinjam,this.tgl_kembali,"Belum Kembali");
                        dataPinjam.add(dataPeminjaman);
                        System.out.println(">>Silahkan Ambil Buku di Perpustkaan dengan menunjukkan Bukti ini<<");
                    }
                }
                if(ketemu == false){
                    System.out.println(">>> ID Buku tidak ditemukan <<<");
                }else{
                    System.out.print("Tekan Enter untuk kembali...");
                    inputanUser.nextLine();
                    break;
                }
            }
        }
    }
    
    public void tampilPinjam(){
        if(dataPinjam.isEmpty()){
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍፍፍፍድፍድፍድፍድፍድ DATA PEMINJAM BUKU ፍድፍድፍፍፍድፍፍፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("| NAMA PEMINJAM |   JUDUL BUKU    | TGL_PINJAM | TGL_KEMBALI | KETERANGAN |");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍፍድፍፍድፍፍ D  A  T  A     M  A  S  I  H     K  O  S  O  N  G ፍድፍፍድፍፍድፍፍድፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
        }else{
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድ DATA BUKU PERPUSTAKAAN ፍድፍድፍፍፍድፍድፍድፍድፍድፍፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            System.out.println("| NAMA PEMINJAM |   JUDUL BUKU    | TGL_PINJAM | TGL_KEMBALI | KETERANGAN |");
            for(Pinjam Data : dataPinjam){
                System.out.printf("|%-15s|%-17s|%-12s|%-13s|%-12s|\n",Data.getNamaPeminjam(),Data.getJudulBuku(), Data.getTgl_pinjam(),Data.getTgl_kembali(), Data.getKeterangan());
                System.out.println("ፍድፍድፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድፍድድፍድፍድፍድፍድፍድፍፍፍፍፍፍፍፍ");
            }
        }
    }
    
    public void hapusPinjam(){
        tampilPinjam();
        boolean dapat = false;
        if(dataPinjam.isEmpty()){
            System.out.print("Kembali ke menu....");
            inputanUser.nextLine();
        }else{
            System.out.print(">> Masukkan Nama Peminjam : ");
            String namaHapus = inputanUser.nextLine();
            for(int i = 0; i < dataPinjam.size(); i++){
                //Percabangan untuk memeriksa apakah nama peminjam yang akan dihapus sama dengan nama peminjam yang ada di arraylist
                if(dataPinjam.get(i).getNamaPeminjam().equals(namaHapus)){
                    dapat = true;
                    dataPinjam.remove(dataPinjam.get(i));
                }
            }
            //Memeriksa apakah data yang akan dihapus dapat ditemukan atau tidak
            if(dapat == false){
                System.out.println(">>>Data Tidak Ditemukan<<<");
            }else{
                System.out.println(">>>Data Telah Terhapus!!!<<<");
                tampilPinjam();
            }
        }
    }
}
