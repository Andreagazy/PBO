package Pertemuan9.Tugas;

public class Segitiga {
    int sudut;

    public int totalSudut(int sudutA){
        int sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB){
        int sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB){
        double keliling = sisiA + sisiB + (Math.sqrt(sisiA*sisiA+sisiB*sisiB));
        return keliling;
    }

    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println("Sudut : " + sgt.totalSudut(50));
        System.out.println("Sudut : " + sgt.totalSudut(30,50));
        System.out.println("Keliling : " + sgt.keliling(3, 4 , 20));
        System.out.println("Keliling : " + sgt.keliling(3, 4));
    }
}
