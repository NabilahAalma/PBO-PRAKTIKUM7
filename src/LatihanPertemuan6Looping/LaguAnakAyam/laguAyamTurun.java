package LatihanPertemuan6Looping.LaguAnakAyam;

public class laguAyamTurun { // Deklarasi class public yakni laguAyamTurun
    public void nyanyiLaguAyamTurun(int n) { // Deklarasi public method yakni nyanyiLaguAyamTurun yang menerima parameter integer n
        System.out.println("Lagu Anak Ayam Turun N : "); // Cetak header lagu "Lagu Anak Ayam Turun N : "
        for (int i = n; i > 0; i--) { // Perulangan for yang dimulai dari nilai n dan turun hingga lebih besar dari 0
            System.out.println("Tek Kotek Kotek Kotek... Anak ayam turun " + i + ", Tek Kotek Kotek Kotek... mati satu tinggal " + (i - 1)); 
            // Mencetak teks lagu sesuai nilai i dan i-1 pada setiap iterasi
        } 
    } 
}