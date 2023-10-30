package UTS;

public class SoalArray1 {
    public static void main(String[] args) {
        int [][] arrayInt = {{1,1,1},{2,1,2},{3,2,1}};
        int total = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[0].length; j++) {
                total += arrayInt[i][j];
            }
        }

        System.out.println("Jumlah total elemene array adalah "+total);
    }
}
