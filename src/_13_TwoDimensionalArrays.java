public class _13_TwoDimensionalArrays {
    public static void main(String[] args){

        int dizi[][] = new int[3][4];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                dizi[i][j] = i+j*2;
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }




    }
}
