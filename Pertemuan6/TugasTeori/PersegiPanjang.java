package Pertemuan6.TugasTeori;

public class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;    
    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
