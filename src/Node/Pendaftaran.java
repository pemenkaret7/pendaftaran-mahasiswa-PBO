package Node;
import Model.modelMahasiswa;

import java.util.Date;

public class Pendaftaran {
    Date tanggal;

    //agregasi
    Mahasiswa mhs;
    waliMhs wali;
    nodeJurusan jurusan;
    Pembayaran pembayaran;

    public Pendaftaran(Date tgl,Mahasiswa mhs,waliMhs wali,nodeJurusan jurus, Pembayaran pembayaran){
        this.tanggal=tgl;
        this.mhs = mhs;
        this.wali=wali;
        this.jurusan=jurus;
        this.pembayaran = pembayaran;
    }
}
