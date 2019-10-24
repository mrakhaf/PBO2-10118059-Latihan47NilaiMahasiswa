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
public class Nilai {
    private double quiz, uts, uas;
    private String indeks, keterangan;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double nilaiAkhir(){
        return (0.2*quiz)+(0.3*uts)+(0.5*uas);
    }
    
    public String menghitungIndeks(){
        
        if((nilaiAkhir() > 80) && (nilaiAkhir() <= 100)){
            indeks = "A";
        } else if((nilaiAkhir() > 68) && (nilaiAkhir() <= 80)){
            indeks = "B";
        } else if((nilaiAkhir() > 56) && (nilaiAkhir() <= 68)){
            indeks = "C";
        } else if((nilaiAkhir() > 45) && (nilaiAkhir() <= 56)){
            indeks = "D";
        } else if((nilaiAkhir() >= 0) && (nilaiAkhir() <= 45)){
            indeks = "E";
        } 
        return indeks;       
    }
    
    public String keteranganNilai(){
        if (indeks == "A"){
            keterangan = "Sangat Baik";
        } else if (indeks == "B"){
            keterangan = "Baik";
        } else if (indeks == "C"){
            keterangan = "Cukup";
        } else if (indeks == "D"){
            keterangan = "Kurang";
        } else if (indeks == "E"){
            keterangan = "Sangat Kurang";
        }
        
        return keterangan;
    }
}
