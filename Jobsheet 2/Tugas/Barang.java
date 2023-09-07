public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        int hargaJual =  hargaDasar - (int) ((diskon*hargaDasar)/100);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon : "+diskon);
    }
}
