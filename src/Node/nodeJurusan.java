package Node;

import java.util.ArrayList;

public class nodeJurusan {
    String nama_jurusan;
    String nama_fakultas;

    public nodeJurusan (String nama_jurusan, String nama_fakultas) {
        this.nama_jurusan = nama_jurusan;
        this.nama_fakultas = nama_fakultas;
    }

    public void viewJurusan(){
        System.out.println("Jurusan : "+this.nama_jurusan);
        System.out.println("FAKULTAS : "+this.nama_fakultas);
    }

    public void setNama_jurusan(String nama_jurusan) {

        this.nama_jurusan = nama_jurusan;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_fakultas (String nama_fakultas) {
        this.nama_fakultas=nama_fakultas;
    }
}
