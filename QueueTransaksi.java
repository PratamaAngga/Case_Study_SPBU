public class QueueTransaksi {
    TransaksiPengisian[] data;
    int front = 0;
    int rear = 0;
    int capacity;

    public QueueTransaksi(int kapasitas){
        this.capacity = kapasitas;
        data = new TransaksiPengisian[kapasitas];
    }

    public void layaniKendaraan(TransaksiPengisian t) {
        if (rear == capacity) {
            System.out.println("Queue Penuh!");
            return;
        }
        data[rear++] = t;
    }

    public void tampilRiwayat() {
        if (rear == 0) {
            System.out.println("Belum ada Transaksi!");
            return;
        }
        System.out.println("=== Riwayat ===");
        for (int i = 0; i < rear; i++) {
            data[i].tampilkanTransaksi();
            System.out.println("---------------------");
        }
    }
}
