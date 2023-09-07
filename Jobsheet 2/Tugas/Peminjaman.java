public class Peminjaman {
    public int id,harga;
    public String namaMember, namaGame;

    public int totalHarga(int lamaSewa){
        int total = harga * lamaSewa;
        return total;
    }

    public void tampilData(){
        System.out.println("ID : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga : "+harga);
    }
}
