public class _06_NumericAndCharacterType {
    public static void main(String[] args){
        /*
        Büyük tipdeki veriyi küçükltmek veri kaybına neden olur.
         */

        double pi=3.12;
        double r;
        int alan;
        r=4.88;
        alan = (int)(pi*(r*r));
        System.out.println("Alan " + alan);

        char a=65, b='m';
        System.out.print("ASD " + a+b);




    }
}
