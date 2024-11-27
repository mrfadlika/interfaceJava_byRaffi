interface Operasi {
    public void Penjumlahan(double bil1, double bil2);
    public void Pengurangan(double bil1, double bil2);
    public double Perkalian(double bil1, double bil2);
    public double Pembagian(double bil1, double bil2);
}

class Calculator implements Operasi {
    @Override
    public void Penjumlahan(double bil1, double bil2) {
        System.out.println("Hasil Penjumlahan: " + (bil1 + bil2));
    }

    @Override
    public void Pengurangan(double bil1, double bil2) {
        System.out.println("Hasil Pengurangan: " + (bil1 - bil2));
    }

    @Override
    public double Perkalian(double bil1, double bil2) {
        return bil1 * bil2;
    }

    @Override
    public double Pembagian(double bil1, double bil2) {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            throw new ArithmeticException("Bilangan pembagi tidak boleh nol");
        }
    }
}

public class OperasiMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.Penjumlahan(5, 3);
        calc.Pengurangan(5, 3);
        System.out.println("Hasil Perkalian: " + calc.Perkalian(5, 3));
        System.out.println("Hasil Pembagian: " + calc.Pembagian(5, 3));
    }
}
