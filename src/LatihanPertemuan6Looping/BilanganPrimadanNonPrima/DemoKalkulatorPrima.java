package LatihanPertemuan6Looping.BilanganPrimadanNonPrima; 
// Deklarasi package soal 1a. Menghitung Deret bilangan prima dan bukan dari 0 – 20 dengan Hasilnya

/* DemoKalkulatorPrima MainClass untuk eksekusi program
 kelas Kalkulator untuk menghitung bilangan prima dan bukan prima.*/

public class DemoKalkulatorPrima {// Deklarasi public class yakni DemoKalkulatorPrima
    public static void main(String[] args) {  //membuat instance dari kelas Kalkulator dan memanggil method hitung bilangan prima dan bukan prima.
        Kalkulator hitung = new Kalkulator(); // instance class Kalkulator yakni hitung
        
        hitung.KalkulatorPrima(); // panggil method KalkulatorPrima pada objek hitung untuk menghitung bilangan prima
        hitung.KalkulatorNonPrima();// panggil method KalkulatorNonPrima pada objek hitung untuk menghitung bilangan bukan prima
    }
}
/*run:
Deret bilangan prima dari 0 sampai 20:
2 3 5 7 11 13 17 19 
Deret bilangan bukan prima dari 0 sampai 20:
4 6 8 9 10 12 14 15 16 18 20 
BUILD SUCCESSFUL (total time: 0 seconds)*/