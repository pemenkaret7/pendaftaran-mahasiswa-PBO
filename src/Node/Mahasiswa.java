package Node;

import Model.modelWali;

public class Mahasiswa {
    String nama;
    String npm;
    String kewarganegaraan;
    String telp;
    //agregasi
    waliMhs wali;
    nodeJurusan jurusan;
    Doswal doswal;

    public nodeJurusan getJurusan() {
        return jurusan;
    }

    public Mahasiswa(String nama, String npm, String Negara, String telp, nodeJurusan jurusan, waliMhs wali){
        this.nama = nama;
        this.npm = npm;
        this.kewarganegaraan=Negara;
        this.telp = telp;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public void setDoswal(Doswal doswal) {
        this.doswal = doswal;
    }

    public void viewMahasiswa(){
        System.out.println("nama : "+this.nama);
        System.out.println("npm :"+this.npm);
        System.out.println("Negara :"+this.kewarganegaraan);
        System.out.println("Telp :"+this.telp);
        System.out.println("Jurusan :"+this.jurusan.nama_jurusan);
        System.out.println("Wali Mahasiswa :"+this.wali.getNama());
        if (this.doswal != null) {
            System.out.println("Dosen Wali Mahasiswa: " + this.doswal.getNama());
        } else {
            System.out.println("Dosen Wali Mahasiswa: Belum di tetapkan :)");
        }
        System.out.println("-------------------------------------------");
    }
    public String getNama(){
        return nama;
    }
    public String getNpm(){
        return npm;
    }

    public void setnpm(String npm){
        this.npm = npm;
    }

    public void setNegara(String negara){
        this.kewarganegaraan = negara;
    }

    public Doswal getDoswal() {
        return doswal;
    }

    public void setTelp(String telp){
        this.telp = telp;
    }
}

