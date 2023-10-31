package UTS;

public class Buku {
    private String ISBN, judul;
    private Penulis penulis;
    private int harga;

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public Penulis getPenulis() {
        return penulis;
    }
    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

}