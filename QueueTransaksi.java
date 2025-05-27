public class QueueTransaksi {
    TransaksiPengisian[] data;
    int front;
    int rear;
    int capacity;
    int size;

    public QueueTransaksi(int kapasitas){
        this.capacity = kapasitas;
        data = new TransaksiPengisian[kapasitas];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void layaniKendaraan(TransaksiPengisian t) {
        if (size == capacity) {
            System.out.println("Queue Penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = t;
        size++;
    }
    
    public void tampilRiwayat() {
        int index = front;
        if (size == 0) {
            System.out.println("Belum ada Transaksi!");
            return;
        }
        System.out.println("=== Riwayat ===");
        for (int i = 0; i < size; i++) {
            data[index].tampilkanTransaksi();
            System.out.println("---------------------");
            index = (index + 1) % capacity;
            
        }
    }
}
