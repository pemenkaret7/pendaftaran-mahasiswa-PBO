package Model;
import Node.nodeJurusan;
import java.util.ArrayList;


public class modelJurusan {
    public ArrayList<nodeJurusan>departmens;

    public modelJurusan() {
        this.departmens = new ArrayList<>();
    }

    public void tambahJurusan(String namejur, String Fakultas){
        this.departmens.add(new nodeJurusan(namejur,Fakultas));
    }

    public ArrayList<nodeJurusan> getDepartmens() {
        return departmens;
    }

    public void ViewAllJurusan(){
        for(int i = 0;i<departmens.size();i++){
            this.departmens.get(i).viewJurusan();
            System.out.println("---------------------");
        }
    }

    public int searchJurusan(String nj) {
        for (int i = 0; i < departmens.size(); i++) {
            if (departmens.get(i).getNama_jurusan().equals(nj)) {
                return i;
            }
        }
        return -1;
    }

    public void updateJurusan(String namaJurusan,String new_fakultas){
        for(int i=0; i<departmens.size();i++){
            if (namaJurusan.equals(departmens.get(i).getNama_jurusan())){
                departmens.get(i).setNama_fakultas(new_fakultas);
            }
        }
    }
    public void deleteJurusan(String nama_jurusan){
        for (int i = 0; i < departmens.size();i++){
            if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())){
                departmens.remove(i);
            }
        }
    }
}
