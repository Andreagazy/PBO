package UTS;

public class BukuMain {
    public static void main(String[] args) {
        Penulis p1 = new Penulis();
        Buku b1 = new Buku();

        p1.setNama("Sumino Yoru");
        p1.setAlamat("Japan");

        b1.setISBN("9786026383143");
        b1.setJudul("I Want to Eat Your Pancreas");
        b1.setPenulis(p1);
        b1.setHarga(90000);

        System.out.println("Judul\t : " +b1.getJudul());
        System.out.println("ISBN\t : "+b1.getISBN());
        System.out.println("Penulis\t : "+b1.getPenulis().getNama());
        System.out.println("Harga\t : "+b1.getHarga());
    }
}
