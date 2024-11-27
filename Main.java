interface Pembayaran {
    void prosesPembayaran();
    void batalkanPembayaran();
}

class PembayaranKartuKredit implements Pembayaran {
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran dengan kartu kredit ...");
    }
    public void batalkanPembayaran() {
        System.out.println("Pembayaran Kartu Kredit dibatalkan ...");
    }
}

class PembayaranPaypal implements Pembayaran {
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran dengan PayPal ...");
    }
    public void batalkanPembayaran() {
        System.out.println("Pembayaran PayPal dibatalkan ...");
    }
}

class PembayaranTFBank implements Pembayaran {
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran dengan Transfer Bank ...");
    }
    public void batalkanPembayaran() {
        System.out.println("Pembayaran Transfer Bank dibatalkan ...");
    }
}

public class Main {
    public static void main(String[] args) {
        Pembayaran pembayaranKartuKredit = new PembayaranKartuKredit();
        pembayaranKartuKredit.prosesPembayaran();
        pembayaranKartuKredit.batalkanPembayaran();

        Pembayaran pembayaranPaypal = new PembayaranPaypal();
        pembayaranPaypal.prosesPembayaran();
        pembayaranPaypal.batalkanPembayaran();

        Pembayaran pembayaranTFBank = new PembayaranTFBank();
        pembayaranTFBank.prosesPembayaran();
        pembayaranTFBank.batalkanPembayaran();
    }
}