public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }
}