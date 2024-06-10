package Node;

public class waliMhs {
    String nama;
    String negara;
    String alamat;
    public waliMhs(String name,String negara,String alamat){
        this.nama=name;
        this.negara=negara;
        this.alamat=alamat;
    }
    public void viewWalimhs(){
        System.out.println("nama : "+ nama);
        System.out.println("negara : "+ negara);
        System.out.println("alamat : "+ alamat);
    }

    public String getNama(){
        return nama;
    }
}
