package Pertemuan6.TugasTeori;

public class Lingkaran extends BangunDatar {
    public float r;

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
