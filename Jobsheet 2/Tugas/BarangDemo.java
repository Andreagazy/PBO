public class BarangDemo {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "B001";
        brg1.namaBarang = "Silverqueen";
        brg1.hargaDasar = 20000;
        brg1.diskon = 15;
        brg1.tampilData();
        System.out.println("Harga Jual : "+brg1.hitungHargaJual());
    }
}
