/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO5;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : PBO10K
 * NIM      : 10119918
 * Deskripsi Program : Program ini berisi program untuk mangakses function dari 
 * class yang sama dan penggunaan variabel global
 * 
 */
public class KambingGlobal {
    // Variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
