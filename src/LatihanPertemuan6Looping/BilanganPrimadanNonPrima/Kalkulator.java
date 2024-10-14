package LatihanPertemuan6Looping.BilanganPrimadanNonPrima;// Deklarasi package soal 1a. Menghitung Deret bilangan prima dan bukan dari 0 – 20 dengan Hasilnya

//Class Kalkulator implementasi method hitung bilangan prima dan bukan prima. Agar Class AbstrakKalkulator lebih luas implementasikan metode nya.
public class Kalkulator extends AbstrakKalkulator {//Menghitung dan mencetak deret bilangan prima dari 0 sampai 20. 
    @Override//Method override method abstrak KalkulatorPrima dari kelas superclass.
    public void KalkulatorPrima() { 
        System.out.println("Deret bilangan prima dari 0 sampai 20:");// Perulangan 'FOR' untuk memeriksa bilangan dari 2 sampai 20
        for (int bilangan = 2; bilangan <= 20; bilangan++) {// perikasa bilangan adalah bilangan prima?
            if (Prima(bilangan)) { 
                System.out.print(bilangan + " ");// Cetak bilangan jika itu bilangan prima
            }
        }
        System.out.println(); // newline setelah mencetak semua bilangan prima
    }

    //hitung dan cetak deret bilangan bukan prima dari 0 sampai 20.
    @Override//override method abstrak KalkulatorNonPrima dari superclass.
    public void KalkulatorNonPrima() { 
        System.out.println("Deret bilangan bukan prima dari 0 sampai 20:");
        int bilangan = 2; //inisialisasi awal dari bilangan 2
        while (bilangan <= 20) { // Perulangan 'WHILE' untuk periksa bilangan dari 2 sampai 20
            if (!Prima(bilangan)) { // periksa bilangan bukan bilangan prima?
                System.out.print(bilangan + " "); // Cetak bilangan jika bukan bilangan prima
            }
            bilangan++; // lanjut ke bilangan berikutnya
        }
        System.out.println(); // newline setelah mencetak semua bilangan prima
    }
}