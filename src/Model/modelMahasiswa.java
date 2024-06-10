package Model;
import Node.*;

import java.util.ArrayList;
import java.util.List;

public class modelMahasiswa {
    public ArrayList<Mahasiswa> mhslist;
    public modelMahasiswa(){
        this.mhslist = new ArrayList<>();
    }

    public void TambahMhs(String nama, String npm, String negara, String telp, nodeJurusan jurusan, waliMhs wali) {
        mhslist.add(new Mahasiswa(nama, npm, negara, telp, jurusan, wali));
    }


    public void deleteMhs(String nama) {
        for (int i = 0; i < mhslist.size(); i++) {
            if (mhslist.get(i).getNama().equals(nama)) {
                mhslist.remove(i);
            }
        }
    }

    public void viewAllMhs() {
        for (int i = 0; i < mhslist.size(); i++) {
            this.mhslist.get(i).viewMahasiswa();
        }
    }

    public int cekLogin(String un, String pw, List<Mahasiswa> mahasiswas) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            Mahasiswa mahasiswa = mahasiswas.get(i);
            if (mahasiswa.getNama().equals(un) && mahasiswa.getNpm().equals(pw)) {
                return i;
                // ngembalikan indeks ketika nilai cocok
            }
        }
        return -1;
        // ngembalikan -1 jika tidak ada nilai yang cocok
    }


    public int search(String npm) {
        for (int i = 0; i < mhslist.size(); i++) {
            if (mhslist.get(i).getNpm().equals(npm)) {
                return i;
            }
        }
        return -1;
    }

}