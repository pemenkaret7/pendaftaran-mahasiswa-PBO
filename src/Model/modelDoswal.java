package Model;

import Node.*;

import java.util.ArrayList;
import java.util.Objects;

public class modelDoswal {
    public ArrayList <Doswal> doswal;

    public modelDoswal() {
        this.doswal = new ArrayList<>();
    }

    public void tambahDoswal(String nama, String nip, String tlp, nodeJurusan jurusan){
        doswal.add(new Doswal(nip, nama, jurusan, tlp));
    }

    public void viewAlldoswal(){
        for (Doswal dos: doswal){
            dos.viewDoswal();
        }
    }

    public int searchDos (String nip){
        for (int i = 0; i < doswal.size();i++){
            if (doswal.get(i).getNip().equals(nip)){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Doswal> getDoswal() {
        return doswal;
    }
}
