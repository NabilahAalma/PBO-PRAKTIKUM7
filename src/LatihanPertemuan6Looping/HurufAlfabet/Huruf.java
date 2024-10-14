package LatihanPertemuan6Looping.HurufAlfabet;// package latihan: 1. Buatlah program dengan menggunakan semua bentuk perulangan untuk : c. Huruf Z – A DENGAN PERULANGAN DO WHILE

public class Huruf {
    public void cetakHuruf() { // Deklarasi method publik bernama cetakHuruf
    System.out.println("Huruf Z sampai A:"); // Mencetak header untuk deret huruf Z sampai A
    
    char huruf = 'Z'; // Menginisialisasi variabel karakter huruf dengan nilai 'Z'
    
    do { // Memulai blok perulangan do-while
        System.out.print(huruf + " "); // Mencetak karakter huruf diikuti dengan spasi
        huruf--; // Mengurangi nilai karakter huruf dengan 1 (menuju ke huruf sebelumnya dalam alfabet)
    } while (huruf >= 'A'); // Kondisi untuk melanjutkan perulangan, selama huruf lebih besar atau sama dengan 'A'
    
    System.out.println(); // Mencetak baris baru setelah semua huruf telah dicetak
}

}
