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

//Contructor
class Login {
    private String user, pass;
    Login() {
        this.user = "";
        this.pass = "";
        
    }
    
// Multiple Contructor
    Login (String user, String pass) {
        this.user = "";
        this.pass = "";
    }
    
    public void inputUser() {
        this.user = user;
    }
    public void inputPass() {
        this.pass = pass;
    }
    
    
}
