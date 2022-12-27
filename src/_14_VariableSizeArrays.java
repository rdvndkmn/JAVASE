public class _14_VariableSizeArrays {
    public static void main(String[] args){
        //değişken boyutlu diziler
        int değişkenboyut[][] = new int[3][];
        değişkenboyut[0] = new int[2];
        değişkenboyut[1] = new int[3];
        değişkenboyut[2] = new int[4];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i+2; j++){
                değişkenboyut[i][j] = i+j*2;
                System.out.print(değişkenboyut[i][j] + " ");
            }
            System.out.println();
        }

    }
}
