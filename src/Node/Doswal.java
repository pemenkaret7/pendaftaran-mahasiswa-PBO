package Node;

public class Doswal {
    String nip;
    String nama;

    //agregasi
    nodeJurusan jurusan;
    String telp;

    public nodeJurusan getJurusan() {
        return jurusan;
    }

    public Doswal(String nip, String nama, nodeJurusan jurusan, String telp) {
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        this.telp = telp;
    }

    public Doswal() {

    }

    public void viewDoswal(){
        System.out.println("==============================");
        System.out.println("nama : "+nama);
        System.out.println("nip : "+nip);
        System.out.println("jurusan : "+jurusan.getNama_jurusan());
        System.out.println("no.telp : "+telp);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setJurusan(nodeJurusan jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
