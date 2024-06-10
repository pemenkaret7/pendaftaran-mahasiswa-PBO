package Model;

import Node.Pembayaran;

import java.util.ArrayList;
import java.util.Date;

public class modelPembayaran {

    public ArrayList<Pembayaran> pmbyrn;

    public modelPembayaran() {
        this.pmbyrn = new ArrayList<>();
    }

    public void tambahPembayaran( int harga){
        pmbyrn.add(new Pembayaran(harga));
    }

    public ArrayList<Pembayaran> getPmbyrn() {
        return pmbyrn;
    }
}
