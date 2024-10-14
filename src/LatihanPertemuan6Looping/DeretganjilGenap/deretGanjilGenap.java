package LatihanPertemuan6Looping.DeretganjilGenap;//Latihan :1. Buatlah program dengan menggunakan semua bentuk perulangan untuk : b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20 dengan Hasilnya DENGAN PERULANGAN WHILE - IF - ELSE

public class deretGanjilGenap {
    public void hitungDeret() { // Deklarasi method publik bernama hitungDeret
    System.out.println("Deret bilangan ganjil dan genap dari 0 sampai 20:"); // Cetak header untuk deret bilangan ganjil dan genap
    int i = 0; // Menginisialisasi variabel i dengan nilai 0
    while (i <= 20) { // Memulai perulangan while selama i kurang dari atau sama dengan 20
        if (i % 2 == 0) { // Memeriksa apakah i adalah bilangan genap (sisa bagi 2 adalah 0)
            System.out.print(i + " (Genap)\n "); // Mencetak i sebagai bilangan genap dan pindah ke baris baru
        } else { // Jika i bukan bilangan genap, maka i adalah bilangan ganjil
            System.out.print(i + " (Ganjil)\n "); // Mencetak i sebagai bilangan ganjil dan pindah ke baris baru
        }
        i++; // Menambah nilai i dengan 1 setiap iterasi
    }
    System.out.println(); // Mencetak baris baru setelah semua bilangan telah dicetak
}

}
