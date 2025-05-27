public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    public void tampilkanTransaksi() {
        System.out.println("=== Transaksi ===");
        kendaraan.tampilanInformasi();
        System.out.println("BBM: " + bbm.namaBBM);
        System.out.println("Liter: " + liter);
        System.out.println("Harga per liter: " + bbm.hargaPerLiter);
        System.out.println("Total Bayar: " + totalBayar);
    }
}