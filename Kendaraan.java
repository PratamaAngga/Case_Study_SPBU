public class Kendaraan {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan (String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilanInformasi() {
        System.out.print ("Plat Nomor : " + platNomor + "\n");
        System.out.print ("jenis Kendaraan : " + tipe + "\n");
        System.out.print ("Merk  : " + merk + "\n");

    }
}