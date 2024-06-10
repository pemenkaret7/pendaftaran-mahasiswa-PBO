package Model;
import Node.*;
import java.util.ArrayList;
import java.util.Date;

public class modelPendaftaran {
    public ArrayList<Pendaftaran> daftar ;
    public modelPendaftaran(){
        this.daftar=new ArrayList<>();
    }

    public void addPendaftaran(Date tanggal, Mahasiswa mhs, waliMhs wali, nodeJurusan jurus, Pembayaran pembayaran){
        this.daftar.add(new Pendaftaran(tanggal,mhs,wali,jurus, pembayaran));
    }
}
