public class PeminjamanDemo {
  public static void main(String[] args) {
        Peminjaman pnj1 = new Peminjaman();

        pnj1.id=1;
        pnj1.namaMember="Agzy";
        pnj1.namaGame="A Space for the Unbound";
        pnj1.harga =50000;
        pnj1.tampilData();
        System.out.println("Total Harga : "+pnj1.totalHarga(5));
    }
}
