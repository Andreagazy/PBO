package Pertemuan6.TugasTeori;

public class Segitiga extends BangunDatar{
    public float alas, tinggi;
    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }
    
    @Override
    public float keliling(){
        return alas+alas+alas;
    }
    
}
