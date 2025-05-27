public class Queue {
    AntrianKendaraan Antrian = new AntrianKendaraan();
    Kendaraan[] data;
    int size = 0;
    int front;
    int max;
    int ditangani;

    public Queue(int max){
        this.max = max;
        this.data = new Kendaraan[max];
        this.front = 0;
        this.size = Antrian.JumlahAntrian();
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public Kendaraan[] layaniKendaraan(){
        if(isEmpty()){
            System.out.println("Antrian kosong");
            return null;
        }
        int layani = 2;
        Kendaraan[] dilayani = new Kendaraan[layani];
        for (int i = 0; i < layani; i++){
            dilayani[i] = data[front];
            front = (front + 1) % max;
            ditangani++;
            size--;
        }
        
        return dilayani;
    }
}
