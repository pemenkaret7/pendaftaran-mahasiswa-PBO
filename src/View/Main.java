package View;

import java.util.Date;
import java.util.Scanner;
import Model.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date tgl = new Date();
        int n = 0;
        int pilih;
        String lanjut;

        modelAdmin admin = new modelAdmin();
        modelPembayaran pembayaran = new modelPembayaran();
        pembayaran.tambahPembayaran(10000);
        modelJurusan jurusan = new modelJurusan();
        jurusan.tambahJurusan("Sistem Informasi", "FTETI");
        jurusan.tambahJurusan("Teknik Informatika", "FTETI");
        modelDoswal doswal = new modelDoswal();
        doswal.tambahDoswal("Kurniawan", "2315", "123456", jurusan.getDepartmens().get(1));
        modelWali wali = new modelWali();
        modelMahasiswa mahasiswa = new modelMahasiswa();
        modelPendaftaran daftar = new modelPendaftaran();

        do {
            System.out.println("============MENU UTAMA :");
            System.out.println("1. login admin");
            System.out.println("2. login mahasiswa");
            System.out.println("3. daftar mahasiswa");
            System.out.println("4. exit");
            System.out.printf("pilih opsi: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    String nm, pw;
                    System.out.print("masukkan username admin : ");
                    nm = scan.nextLine();
                    System.out.print("masukkan password admin : ");
                    pw = scan.nextLine();
                    if (admin.cekAdmin(nm, pw)) {
                        int opsi = 0;
                        do {
                            System.out.println("Selamat datang di menu admin : ");
                            System.out.println("1. Tambah dosen wali");
                            System.out.println("2. Tambah jurusan ");
                            System.out.println("3. Update jurusan ");
                            System.out.println("4. Penentuan dosen wali");
                            System.out.println("5. exit");
                            System.out.printf("Masukkan pilihan : ");
                            opsi = scan.nextInt();
                            scan.nextLine();

                            switch (opsi) {
                                case 1:
                                    String nam, no, nj;
                                    String nip;
                                    System.out.println("TAMBAHKAN DATA DOSEN :");
                                    System.out.printf("masukkan nama dosen: ");
                                    nam = scan.nextLine();
                                    System.out.printf("masukkan nip dosen: ");
                                    nip = scan.nextLine();
                                    System.out.printf("masukkan nomor telpon: ");
                                    no = scan.nextLine();
                                    System.out.println("List jurusan");
                                    jurusan.ViewAllJurusan();
                                    System.out.print("Pilih jurusan : ");
                                    nj = scan.nextLine();
                                    int idxJrsn = jurusan.searchJurusan(nj);
                                    if (idxJrsn != -1) {
                                        doswal.tambahDoswal(nam, nip, no, jurusan.getDepartmens().get(idxJrsn));
                                        doswal.getDoswal().get(idxJrsn);
                                        System.out.println(" ");
                                        System.out.println("LIST DATA DOSEN YANG ADA : ");
                                        doswal.viewAlldoswal();
                                    } else {
                                        System.out.println("Jurusan tidak ditemukan");
                                    }
                                    break;

                                case 2:
                                    System.out.println("MENAMBAH JURUSAN DAN FAKULTAS ===============");
                                    System.out.printf("Masukkan nama jurusan : ");
                                    String namajur = scan.nextLine();
                                    System.out.printf("Masukkan nama Fakultas : ");
                                    String nf = scan.nextLine();
                                    jurusan.tambahJurusan(namajur, nf);
                                    System.out.println(" ");
                                    System.out.println("LIST JURUSAN YANG ADA : ");
                                    jurusan.ViewAllJurusan();
                                    break;
                                case 3:
                                    System.out.println("Update FAKULTAS ==============");
                                    String nmjur, nmfak;
                                    System.out.printf("Masukkan nama Jurusan : ");
                                    nmjur = scan.nextLine();
                                    System.out.printf("Masukkan nama fakultas : ");
                                    nmfak = scan.nextLine();
                                    jurusan.updateJurusan(nmjur, nmfak);
                                    System.out.println("LIST JURUSAN YANG BARU : ");
                                    jurusan.ViewAllJurusan();
                                    break;
                                case 4:
                                    System.out.println("MEMASUKKAN DOSWAL KE DATA MAHASISWA MELALUI NPM MAHASISWA DAN NIP DOSWAL");
                                    System.out.println("LIST MAHASISWA : ");
                                    mahasiswa.viewAllMhs();
                                    System.out.printf("masukkan npm mahasiswa : ");
                                    String npm = scan.nextLine();
                                    int indexMahasiswa = mahasiswa.search(npm);
                                    if (indexMahasiswa != -1) {
                                        System.out.println(" List dosen yang ada : ");
                                        doswal.viewAlldoswal();
                                        System.out.printf("pilih (nip) dosen :");
                                        nip = scan.nextLine();
                                        int indexDoswal = doswal.searchDos(nip);
                                        if (indexDoswal != -1) {
                                            if (mahasiswa.mhslist.get(indexMahasiswa).getJurusan().getNama_jurusan().equals(doswal.getDoswal().get(indexDoswal).getJurusan().getNama_jurusan())) {
                                                mahasiswa.mhslist.get(indexMahasiswa).setDoswal(doswal.getDoswal().get(indexDoswal));
                                                System.out.println("DOSEN WALI BERHASIL DITETAPKAN!!");
                                            } else {
                                                System.out.println("Jurusan tidak sesuai");
                                            }
                                        } else {
                                            System.out.println("NIP TIDAK COCOK");
                                        }
                                    } else {
                                        System.out.println("Tidak ada mahasiswa dengan NPM tersebut");
                                    }
                                    break;
                            }

                        } while (opsi != 5);
                    } else {
                        System.out.println("password atau username salah");
                    }
                    break;
                case 2:
                    System.out.printf("username mahasiswa : ");
                    String name = scan.nextLine();
                    System.out.printf("password mahasiswa : ");
                    String pass = scan.nextLine();
                    int index = mahasiswa.cekLogin(name, pass, mahasiswa.mhslist);

                    if (index != -1) {
                        mahasiswa.mhslist.get(index).viewMahasiswa();
                    } else {
                        System.out.println("username atau password salah ;V");
                    }
                    break;
                case 3:
                    String nAm, nPm, nameW, telpW, alamtW, jurus;
                    int nom;
                    System.out.printf("Masukkan nama mahasiswa: ");
                    nAm = scan.nextLine();
                    System.out.printf("Masukkan npm mahasiswa: ");
                    nPm = scan.nextLine();

                    System.out.println("Pilih jurusan");
                    jurusan.ViewAllJurusan();

                    do {
                        System.out.printf("Masukkan pilihan jurusan: ");
                        jurus = scan.nextLine();

                        int indexJrsn = jurusan.searchJurusan(jurus);

                        if (indexJrsn != -1) {
                            System.out.println("Nama Jurusan Telah Dipilih");
                            System.out.println(" ");
                            System.out.printf("Masukkan nama wali: ");
                            nameW = scan.nextLine();
                            System.out.printf("Masukkan nomor telpon wali: ");
                            telpW = scan.nextLine();
                            System.out.printf("Masukkan alamat wali: ");
                            alamtW = scan.nextLine();
                            wali.tambahwali(nameW, telpW, alamtW);
                            System.out.println("Pembayaran Her Registrasi senilai 10000");
                            System.out.printf("Masukkan nominal: ");
                            nom = scan.nextInt();
                            scan.nextLine();
                            pembayaran.tambahPembayaran(nom);

                            mahasiswa.TambahMhs(nAm, nPm, "Indonesia", telpW, jurusan.getDepartmens().get(indexJrsn), wali.getWaliList().get(n));
                            daftar.addPendaftaran(tgl, mahasiswa.mhslist.get(n), wali.getWaliList().get(n), jurusan.getDepartmens().get(indexJrsn), pembayaran.getPmbyrn().get(n));
                            System.out.println(" ");
                            System.out.println("DATA MAHASISWA : ");
                            mahasiswa.viewAllMhs();
                            System.out.println("====================================");
                            System.out.println("PENDAFTARAN BERHASIL!!");
                            n++;
                            break;
                        } else {
                            System.out.println("Jurusan tidak tersedia :)");
                        }
                    } while (true);
                    break;
                case 4:
                    System.out.println("Anda akan keluar dari program ini");
                    break;
                default:
                    System.out.println("pilih nomor secara benar!!");
                    break;
            }

            System.out.print("balik ke menu utama atau tidak?[y/n]: ");
            lanjut = scan.nextLine();
        } while (lanjut.equals("y"));
    }
}

