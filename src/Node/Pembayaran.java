package Node;

import java.time.LocalDate;

public class Pembayaran {
    LocalDate tanggal;
    int harga;

    public Pembayaran(int harga){
        this.tanggal= LocalDate.now();
        this.harga=harga;
    }
}
