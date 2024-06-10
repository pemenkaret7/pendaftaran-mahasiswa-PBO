package Model;
import java.util.ArrayList;
import Node.waliMhs;

public class modelWali {
    public ArrayList <waliMhs> waliList;


    public modelWali(){
        this.waliList = new ArrayList<>();
    }

    public ArrayList<waliMhs> getWaliList() {
        return waliList;
    }

    public void tambahwali(String nama, String negara, String alamat){
        int index = waliList.size();
        this.waliList.add(new waliMhs(nama,negara,alamat));
    }

    public void deleteWali(String nama){
        for(int i = 0;i<waliList.size();i++){
            if(waliList.get(i).getNama().equals(nama)){
                waliList.remove(i);
            }
        }
    }
    public void viewallWali(){
        for(int i=0;i<waliList.size();i++){
            this.waliList.get(i).viewWalimhs();
        }
    }

}
