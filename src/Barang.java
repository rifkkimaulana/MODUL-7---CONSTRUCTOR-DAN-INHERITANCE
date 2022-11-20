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
 * 
 */

class Barang {
    String kode, nama;
   
    public Barang(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;

    }
    
    public String tampilBarang() {
      return("Kode Barang/t:" + kode + "\nNama Barang\t: " + nama + "/n");
    }
}

class Detail extends Barang {
    private long hpp, hargajual;
    private int stok,jumlahjual;
    
    public Detail (String kode, String nama, long hpp, long hargajual, int stok, int jumlahjual){
        super(kode, nama);
        this.hpp = hpp;
        this.hargajual = hargajual;
        this.stok = stok;
        this.jumlahjual = jumlahjual;
    }
    
    public String tampilDetailbarang() {
        return("INPUT: " + "\nKode\t\t: " + kode + "\nNama Barang\t: " + nama + "\nHPP\t\t: " + hpp + 
                "\nHarga Jual\t: " + hargajual + "\nStok\t\t: " + stok + "\nJumlah Jual\t: " + 
                jumlahjual + "\nOUTPUT:\t" + "\nStok Sekarang\t: " + (stok - jumlahjual) 
                + "\nTotal Bayar\t: " + (hargajual*jumlahjual) + "\nLaba\t\t: " + 
                ((hargajual*jumlahjual)-(hpp*jumlahjual)));
    }
   
 }

class main {
    public static void main(String args[]) {
        Detail db = new Detail("B001", "BUKU GAMBAR", 2500, 3000, 5, 2);
        
        System.out.println(db.tampilDetailbarang());
    }
}

