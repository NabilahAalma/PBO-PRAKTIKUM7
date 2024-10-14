package LatihanPertemuan6Looping.TabelPerkalian;//package Latihan : 2. Buatlah suatu program yang menghasilkan suatu tabel perkalian n x n ( dimana nilai n lebih kecil atau sama dengan 10). Sebagai contoh, jika n bernilai 4 (empat), maka akan ditampilkan tabel perkalian berikut :

public class TabelPerkalian extends AbstrakTabelPerkalian { // Deklarasi kelas TabelPerkalian yang memperluas AbstractTabelPerkalian

    @Override
    public void cetakTabel(int n) { // Mengoverride metode cetakTabel dari kelas AbstractTabelPerkalian
        if (n > 10) { // Memeriksa apakah n lebih dari 10
            n = 10; // Jika ya, set n menjadi 10
        }
        System.out.println("Tabel Perkalian " + n + "x" + n + ":"); // Mencetak header tabel perkalian

        // cetak header kolom
        System.out.print("\t"); // Mencetak tab untuk pemisah kolom header
        for (int i = 1; i <= n; i++) { // Perulangan untuk mencetak header kolom
            System.out.print(i + "\t"); // Mencetak angka header kolom diikuti dengan tab
        }
        System.out.println(); // Mencetak baris baru setelah header kolom

        for (int i = 1; i <= n; i++) { // Perulangan untuk setiap baris
            // cetak header baris
            System.out.print(i + "\t"); // Mencetak header baris (angka pada baris pertama diikuti dengan tab)
            for (int j = 1; j <= n; j++) { // Perulangan dalam untuk setiap kolom
                System.out.print(i * j + "\t"); // Mencetak hasil perkalian i dan j diikuti dengan tab
            }
            System.out.println(); // Mencetak baris baru setelah setiap baris tabel
        }
    }
}