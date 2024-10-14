package LatihanPertemuan6Looping.BilanganPrimadanNonPrima;// Deklarasi package soal 1a. Menghitung Deret bilangan prima dan bukan dari 0 – 20 dengan Hasilnya

public abstract class AbstrakKalkulator implements kalkulasi {// Deklarasi class abstrak yakni AbstrakKalkulator yang implmentasikan interface kalkulasi
    public abstract void KalkulatorPrima(); //method hitung bil prima yang akan di implementasikan pada subclass
    public abstract void KalkulatorNonPrima();//method hitung bil NONprima yang akan di implementasikan pada subclass

    protected boolean Prima(int bilangan) {
        if (bilangan < 2) return false; //bil kurang dari 2 bukan bil.prima, jika faktor dari 2 sampai akar kuadrat bilangan tersebut
        for (int i = 2; i <= Math.sqrt(bilangan); i++) {//jika bil itu bisa mudulo i tak bersisa, maka bil itu NONprima
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;// Mengembalikan true jika bilangan tidak memiliki faktor selain 1 dan dirinya sendiri
    }
}
