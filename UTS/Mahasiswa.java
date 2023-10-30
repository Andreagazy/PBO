package UTS;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    Mahasiswa(){

    }
    Mahasiswa(String nim , String nama, String alamat, char jenisKelamin){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2241720146", "Andreagazy Iza Amerianto", "Tulungagung", 'L');
        System.out.println("NIM : " + mhs.nim);
        System.out.println("Nama : " + mhs.nama);
        System.out.println("Alamat : " + mhs.alamat);
        System.out.println("Jenis Kelamin : " + mhs.jenisKelamin);
        
    }
}
