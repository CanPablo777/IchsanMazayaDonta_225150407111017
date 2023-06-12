import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;

class Perpus {

    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private double tingkatKesamaan;
    private int hargaBuku;
    private int royaltiPersen;
    private int Royalti;
    private int penjualan;
    //Inisialisasi sinopsis
    private String sinopsis;
    private String[] penulisbanyak;

    public Perpus(){
    kategori = "";
    penulis = "";
    judul = "";
    bahasa = "";
    }

    public Perpus(String kategori, String judul, String bahasa, String penerbitan, String edisi, int halaman, String sinopsis){
      this.kategori = kategori;
      this.judul = judul;
      this.bahasa = bahasa;
      this.penerbitan = penerbitan;
      this.edisi = edisi;
      this.halaman = halaman;
      this.sinopsis = sinopsis;
    }

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }

    //Tambahan Atribut Sinopsis
    public void setSinopsis(String s){
    String[] kata = s.split("\\s+");
    int jumlahKata = kata.length;
    if(jumlahKata>=10){
        this.sinopsis = s;
    }else{
        this.sinopsis = "Jumlah kata sinopsis judul buku ini kurang dari 10 kata";
    }
      this.sinopsis = s;
    }

    //Method hitung jumlah kata pada atribut sinopsis
    public int getjumlahKataSinopsis(String sinopsis){
      String[] kata = sinopsis.split("\\s+");
      return kata.length;
    }

    //Method cek tingkat kesamaan
    public double cekKesamaan(Perpus a){
        int kesamaan=0;
        if(this.judul.equals(a.judul)){
            kesamaan ++;
        }
        if(this.kategori.equals(a.kategori)){
            kesamaan++;
        }
        if(this.bahasa.equals(a.bahasa)){
            kesamaan++;
        }
        if(this.penulis.equals(a.penulis)){
            kesamaan++;
        }
        if(this.edisi.equals(a.edisi)){
            kesamaan++;
        }
        if(this.penerbitan.equals(a.penerbitan)){
            kesamaan++;
        }
        tingkatKesamaan = kesamaan*(double)100/6;
        displayTingkatKesamaan();
        return tingkatKesamaan;
        
    }

    private void displayTingkatKesamaan(){
        System.out.println("Tingkat kesamaan kedua objek tersebut sebesar " + tingkatKesamaan + "%");
    }
    
     // Method copy yang mengembalikan object yang nilainya sama
     public void copy(Perpus A){
        this.judul = A.judul;
        this.bahasa = A.bahasa;
        this.halaman = A.halaman;
        this.edisi = A.edisi;
        this.kategori = A.kategori;
        this.penerbitan = A.kategori;
        this.penulis = A.penulis;
        this.penulisbanyak = A.penulisbanyak;
     }
    
    public void setPenjualan(int p){
        penjualan = p;
    }

    public void setHargaBuku(int h){
        hargaBuku = h;
    }

    public void royaltiPersen(int r){
        royaltiPersen=r;
    }

    private void displayItungKesamaan(Perpus o1){
        System.out.println("Tingkat kesamaan kata : " + this.tingkatKesamaan);
        }public int hitungRoyalti(int biaya){
        this.hargaBuku = biaya;
        Royalti = (penjualan*hargaBuku*10/100);
        return Royalti;
        }
        

    public int hitungRoyalti(int biaya, int persen){
        this.hargaBuku= biaya;
        this.royaltiPersen = persen;
        Royalti = (penjualan*hargaBuku*royaltiPersen)/100;
        return Royalti;
        }
        
        public void bacaFile(String pathFile){
            try
            {
            File file = new File(pathFile);
            Scanner input = new Scanner(file);
            String isi = input.nextLine();
            String[]isiFile = isi.split("; ");
            this.judul = isiFile[0];
            this.penulis = isiFile[1];
            input.close();
            }catch (FileNotFoundException exception){
            System.out.println("File not found: " +
            exception.getMessage());
            }
        }
        public void simpanFile(String namaFile){
            try{
            BufferedWriter tulis = new BufferedWriter(new
            FileWriter(namaFile));
            tulis.write(judul + "; " + penulis);
            tulis.close();
            }catch (IOException exception){
            System.out.println("Error : " + exception.getMessage());
            }
        }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: " + sinopsis);
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]",
                    ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if(sinopsis != null){
         System.out.println("Banyak kata dalam sinopsis adalah: " + getjumlahKataSinopsis(sinopsis));
        } else{
         System.out.println("Sinopsis pada judul buku ini belum ditambahkan");
        }
        System.out.println("Hasil penjualan buku bulan ini: " + this.penjualan);
        System.out.println("Penulis menerima royalti sebesar: " + this.Royalti);
    }
}