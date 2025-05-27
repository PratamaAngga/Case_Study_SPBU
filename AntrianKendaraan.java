public class AntrianKendaraan {
    Node head, tail;
    int size = 0;

    public void tambahAntrian(Kendaraan k) {
        Node baru = new Node(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
    }

    public Kendaraan layaniKendaraan() {
        if (head == null) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus!");
            return null;
        } 
        Kendaraan k = head.kendaraan;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return k;
    }

    public int JumlahAntrian(){
        return size;
    }
    
    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println();
        System.out.println("-- Antrian Kendaraan --");
        Node temp = head;
        while (temp != null) {
            temp.kendaraan.tampilanInformasi();
            System.out.println("-----------");
            temp = temp.next;
        }
    }
}
