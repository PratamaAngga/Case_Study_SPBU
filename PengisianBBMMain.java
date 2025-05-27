import java.util.Scanner;
public class PengisianBBMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan Antrian = new AntrianKendaraan();
        QueueTransaksi transaksiQueue = new QueueTransaksi(100);
        int pilihan;
        do {
            System.out.println("\n --- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan ");
            System.out.println("2. Tampilkan Antrian ");
            System.out.println("3. Cek Jumlah Antrian Kendaraan ");
            System.out.println("4. Layani Kendaraan ");
            System.out.println("5. Tampilkan Riwayat Transaksi ");
            System.out.println("0. Keluar ");
            System.out.print("Pilih : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor  : ");
                    String platNomor = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan : ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk  : ");
                    String merk = sc.nextLine();

                    Antrian.tambahAntrian(new Kendaraan(platNomor, tipe, merk));
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;

                case 2:
                    Antrian.tampilkanAntrian();
                    break;
                
                case 3: 
                    System.out.println("Jumlah kendaraan dalam antrian: " + Antrian.JumlahAntrian());
                    break;
                    
                case 4:
                    Kendaraan dilayani = Antrian.layaniKendaraan();
                    if (dilayani != null) {
                        System.out.println("Petugas melayani " + dilayani.platNomor);
                        System.out.print("Jenis BBM: ");
                        String namaBBM = sc.nextLine();
                        System.out.print("Harga per Liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Jumlah Liter: ");
                        double liter = sc.nextDouble(); sc.nextLine();

                        BBM bbm = new BBM(namaBBM, harga);
                        TransaksiPengisian transaksi = new TransaksiPengisian(dilayani, bbm, liter);
                        transaksiQueue.layaniKendaraan(transaksi);
                        System.out.println("Transaksi telah dicatat.");
                    }
                    break;
                case 5:
                    transaksiQueue.tampilRiwayat();
                    break;
            }
        } while (pilihan != 0 && pilihan <= 5);
        sc.close();
    }
}
