public class _16_ThreeDimensionalArrays {
    public static void main(String[] args){
        //3 boyutlu diziler
        int dizi[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                for (int k = 0; k < 5; k++){
                    //dizi[i][j][k] = i+j+k*2;
                    System.out.print((dizi[i][j][k] = i+j+k*2) + "   ");
                }System.out.println();
            }System.out.println();
        }


    }
}
