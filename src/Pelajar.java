/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Contruktor
 *      adalah method yang secara otomatis dipanggil/ dijalankan pada saat sebuah class diinisiai. 
 * Nama contructor harus sama dengan nama class dan tidak boleh memiliki tipe return value.
 * Sama halnya dengan method, contructor dapat memiliki satu atau banyak parameter maupun tanpa parameter.
 * 
 * Inheritance
 *      adalah proses pewarisan data dan method dari suatu class yang telah ada kepada suatu class baru
 * tetapi tidak bisa mewarisi anggota private dari superclass-nya.
 * dengan inheritance class baru akan mirip dengan class lama(superclass)
 * namun memiliki karakteristik yang baru.
 * dalam java superclass hanya bisa memiliki satu superclass, sedangkan superclass bisa memiliki satu subclass atau lebih.
 * Untuk penerapan inheritance, gunakan statement "extend".
 * 
 * @author Rifki Maulana
 */

class Pelajar {
    
    String nama;
    long tinggi;
    long berat;
    
    public Pelajar (String nama, long tinggi, long berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    public String tampilPelajar() {
        return ("Nama\t: " + nama + "\nTinggi\t: " + tinggi + "\nBerat\t: " + berat + "\n");
    }
}
class Siswa extends Pelajar {
    private String nim, asalsekolah;
    private long nilai;
    
    public Siswa (String nama, long tinggi, long berat, String nim, String asalsekolah, long nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalsekolah = asalsekolah;
        this.nilai = nilai;
    }
    public String tampilSiswa() {
        return (super.tampilPelajar() + "nim\t: " + nim + "\nAsal Sekolah: " + asalsekolah + "\nNilai\t: " + nilai);
    } 
}

class main {
    public static void main(String args[]) {
        Siswa ti = new Siswa ("Ahmad", 180, 78, "1390192", "SMK Informatika", 90);
      System.out.println(ti.tampilSiswa());
    }
}