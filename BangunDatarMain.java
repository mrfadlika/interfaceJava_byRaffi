interface BangunDatar {
    double hitungKeliling();
    double hitungLuas();
}

class Persegi implements BangunDatar {
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang implements BangunDatar {
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class BangunDatarMain {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(3);
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.setLebar(3);
        persegipanjang.setPanjang(4);
        System.out.println("Keliling Persegi Panjang: " + persegipanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegipanjang.hitungLuas());
    }
}
