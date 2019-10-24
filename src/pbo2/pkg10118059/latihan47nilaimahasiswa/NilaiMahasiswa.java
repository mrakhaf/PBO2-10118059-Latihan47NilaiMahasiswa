/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan47nilaimahasiswa;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setQuiz(75);
        nilai.setUts(45);
        nilai.setUas(34);
        
        System.out.println("QUIZ        = " + nilai.getQuiz());
        System.out.println("UTS         = " + nilai.getUts());
        System.out.println("UAS         = " + nilai.getUas());
        
        System.out.println("");
        
        System.out.println("Nilai Akhir = " + nilai.nilaiAkhir());
        
        System.out.println("");
        
        System.out.println("Index       = " + nilai.menghitungIndeks());
        System.out.println("Keterangan  = " + nilai.keteranganNilai());
    }
    
}
