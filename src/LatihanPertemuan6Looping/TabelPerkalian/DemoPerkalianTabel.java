package LatihanPertemuan6Looping.TabelPerkalian;//package Latihan : 2. Program tabel perkalian n x n ( nilai n lebih kecil atau sama dengan 10). Contoh, jika n bernilai 4 (empat), maka akan ditampilkan tabel perkalian berikut :

public class DemoPerkalianTabel {//MainClass yang eksekusi program tabel perkalian.
    public static void main(String[] args) {
        TabelPerkalian tabelPerkalian = new TabelPerkalian(); //instance dan objek
        tabelPerkalian.cetakTabel(4);  // Contoh dengan nilai n = 4
    }
}
/*run:
Tabel Perkalian 4x4:
	1	2	3	4	
1	1	2	3	4	
2	2	4	6	8	
3	3	6	9	12	
4	4	8	12	16	
BUILD SUCCESSFUL (total time: 0 seconds)*/